### 第2章 NIO入门

本章包括:
+ 传统的BIO编程
+ 基于NIO的非阻塞编程
+ 基于NIO2.0的异步非阻塞编程
+ 为什么使用NIO编程
+ 为什么使用Netty

#### 2.1 传统的BIO编程

##### 2.1.1 传统的同步阻塞I/O服务端通信模型

网络编程的基本模型是C/S模型,也就是两个进程间互相通信,其中服务端提供位置信息(绑定IP和端口号),客户端通过连接操作向服务端监听的地址发起连接请求,通过三次握手建立连接,如果连接建立成功,双方就可以通过网络套接字进行通信.

下图展现了传统的同步阻塞I/O服务端通信模型,在该模型中服务端主线程只负责监听客户端连接,其收到客户端连接请求后为每个客户端创建一个新的线程来处理客户端请求,当处理完客户端请求后,就消耗线程.

![bio](http://7xonn1.com1.z0.glb.clouddn.com/bio.png)

该模型最大的问题就是缺乏弹性伸缩能力,当客户端连接请求急剧增加后,服务器需要创建大量的线程用于处理客户端请求,由于在JVM中线程资源非常宝贵,这将导致服务端性能急剧下降,最终将导致服务端宕机,导致无法向外提供服务.

通过如下的Java代码展现基于传统的BIO模型编写的时间服务器
```java
//时间服务器主线程只负责监听客户端连接
public class TimerServer {


    public static void main(String []args){

        int port=8080;

        ServerSocket serverSocket=null;

        try{
            //创建服务端套接字绑定端口号
            serverSocket=new ServerSocket(port);
            System.out.println("The time server is start in port: " + port);
            Socket socket=null;
            while (true){
                //服务端套接字调用accept方法监听客户端连接,也就是服务端主线程只负责监听客户端连接
                socket=serverSocket.accept();
                //服务端创建一个线程来处理客户端连接
                new Thread(new TimeServerHandler(socket)).start();
            }

        }catch (IOException e){
            if(serverSocket!=null){
                System.out.println("The time server close");
                try{
                    serverSocket.close();
                }catch (IOException e1){
                    e1.printStackTrace();
                }
                serverSocket=null;
            }
        }

    }
}
//创建专门的线程处理客户端请求
public class TimeServerHandler implements Runnable{

    private Socket socket;

    public TimeServerHandler(Socket socket){ this.socket=socket;}
    @Override
    public void run() {


        BufferedReader reader=null;
        PrintWriter writer=null;

        try{
            reader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
            writer=new PrintWriter(new OutputStreamWriter(socket.getOutputStream()),true);
            String currentTime=null;
            String body=null;

            while (true){
                body=reader.readLine();
                if(body==null)
                    break;
                System.out.println("The time server receive order: " + body);
                currentTime="QUERY TIMER ORDER".equalsIgnoreCase(body)?new java.util.Date(System.currentTimeMillis()).toString():"BAD ORDER";
                writer.println(currentTime);
                writer.flush();

            }

        }catch (IOException e){
            if(reader!=null){
                try {
                    reader.close();
                }catch (IOException e1){
                    e1.printStackTrace();
                }
            }
            if (writer != null) {
                    writer.close();
                    writer=null;
            }
            if(socket!=null){
                try {
                    socket.close();
                }catch (IOException e2){
                    e2.printStackTrace();
                }
                socket=null;
            }
        }

    }
}
//时间服务器客户端
public class TimeClient {
    public static void main(String[]args){
        int port=8080;

        Socket socket=null;
        BufferedReader in=null;
        PrintWriter out=null;

        try{
            socket=new Socket();
            socket.connect(new InetSocketAddress("127.0.0.1",8080));
            in=new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out=new PrintWriter(socket.getOutputStream(),true);
            out.flush();
            out.println("QUERY TIMER ORDER");
            System.out.println("Send order 2 server succeed.");
            String resp=in.readLine();
            System.out.println("Now is: " + resp);

        }catch (IOException e){
            if(socket!=null){
                try {
                    socket.close();
                }catch (IOException e1){
                    e1.printStackTrace();
                }
                socket=null;
            }
            if(in!=null){
                try{
                    in.close();
                }catch (IOException e2){
                    e2.printStackTrace();
                }
            }
            if(out!=null) {
                out.close();
                out=null;
            }
        }

    }
}
```
##### 2.1.2 伪异步I/O服务端通信模型

下图展现了伪异步I/O服务端通信模型,在该模型中,服务端的主线程依旧只负责处理客户端的连接请求,但是在服务端中维护了一个线程池,客户端的请求处理将被封装为一个task(实现Runnable接口),该task被丢入线程池中进行处理.由于线程池中线程数量可以控制,所以可以实现一组固定的线程服务大量的客户端请求.

![psedu_aio](http://7xonn1.com1.z0.glb.clouddn.com/pseudo_aio.png)

虽然该模型解决了传统的BIO模型中面对大量客户端连接请求需要创建大量的线程来处理客户端请求,但是未从根本上解决**同步I/O导致的通信链路阻塞问题**.由于处理客户端请求的任务读写I/O操作是同步阻塞的,阻塞时间取决于客户端I/O线程的处理速度和网络/IO的传输速度,但是由于无法保证客户端处理I/O的速度和网络I/O的传输速度,这就导致了该模型的可靠性非常差.

通过如下的Java代码展现基于伪异步I/O模型编程的时间服务器
```java
public class TimerServerUsingThreadPool {

    public static void main(String[]args){
        int port=8080;

        //服务端维护一个线程池
        ExecutorService service= Executors.newCachedThreadPool();
        ServerSocket serverSocket=null;

        try{
            //创建服务端套接字绑定端口号
            serverSocket=new ServerSocket(port);
            System.out.println("The time server is start in port: " + port);
            Socket socket=null;
            socket=serverSocket.accept();
            //将客户端请求处理封装为一个任务丢入线程池进行处理
            service.execute(new TimeServerHandler(socket));

        }catch (IOException e){
            if(serverSocket!=null){
                System.out.println("The time server close");
                try{
                    serverSocket.close();
                }catch (IOException e1){
                    e1.printStackTrace();
                }
                serverSocket=null;
            }
            service.shutdown();
        }
    }
}
```