### 第2章 NIO入门

本章包括:
+ 传统的BIO编程
+ 基于NIO的非阻塞编程
+ 基于NIO2.0的异步非阻塞编程
+ I/O模型对比
+ 使用Netty框架理由

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

#### 2.2 NIO编程

下图展现了NIO服务端通信的序列

![nio](http://7xonn1.com1.z0.glb.clouddn.com/nio.png)

##### 缓冲区Buffer

Buffer是一个对象,其包含了一些要写入或读出的数据.在NIO类库中加入Buffer对象,体现了新库与原I/O的一个重要区别.在面向流的I/O中,可以将数据直接写入或者将数据直接读到Stream对象中.在NIO中,所有数据都是用缓冲区处理的.缓冲区实质上是一个数组.通常是一个字节数组.但是缓冲区不仅仅是一个数组,缓冲区提供了对数据的结构化访问和维护读写位置等信息.

##### 通道Channel

Channel是一个通道,网络数据通过Channel读取和写入.通道与流的不同之处在于通道是双向的,流只是在一个方向上移动(一个流必须是InputStream或OutputStream的子类),而通道可以用于读写或同时进行.

##### 多路复用器Selector

多路复用器提供选择已经就绪的任务的能力.Selector会不断轮询注册其上的Channel,如果某个Channel上发生读或写事件,该Channel就处于就绪状态,会被Selector轮询处出来,然后通过SelectionKey可以获取就绪的Channel集合,进行后续的I/O操作.

```java
//服务端实现
public class MultiplexerTimerServer implements Runnable{
    //多路复用选择器
    private Selector selector;
    //服务端套接字通道
    private ServerSocketChannel serverSocketChannel;
    //标识服务是否运行
    private volatile boolean stop;
    public MultiplexerTimerServer(int port){
        try{
            //创建一个多路复用选择器
            selector= Selector.open();
            //创建一个服务端套接字通道
            serverSocketChannel=ServerSocketChannel.open();
            //设置服务端套接字通道为非阻塞模式
            serverSocketChannel.configureBlocking(false);
            //将套接字服务端通道绑定到本地一个端口
            serverSocketChannel.socket().bind(new InetSocketAddress(port),1024);
            System.out.println("The time server is start in port : " + port);
        }catch (IOException e){
            e.printStackTrace();
            System.exit(1);
        }
    }
    public void stop(){
        stop=false;
    }
    private void doWrite(SocketChannel channel,String response) throws IOException{
        if(response!=null&&response.trim().length()>0){
            byte[] bytes=response.getBytes();
            ByteBuffer byteBuffer=ByteBuffer.allocate(bytes.length);
            byteBuffer.put(bytes);
            byteBuffer.flip();
            channel.write(byteBuffer);
        }
    }
    private void handleInput(SelectionKey key) throws IOException{
        //如果选择器键有效
        if(key.isValid()){
            //如果选择器键是连接就绪事件
            if(key.isAcceptable()){
                //获取选择器键上的服务端套接字通道
                ServerSocketChannel ssc=(ServerSocketChannel)key.channel();
                //获取客户端套接字通道
                SocketChannel sc=ssc.accept();
                //设置该通道为非阻塞模式
                sc.configureBlocking(false);
                //在该通道上设置读事件
                sc.register(selector,SelectionKey.OP_READ);
            }
            //如果选择器键是读事件
            if(key.isReadable()){
                //获取选择器键上的客户端套接字通道
                SocketChannel sc= (SocketChannel) key.channel();
                //创建一个缓冲区对象并将通道中的数据读到缓冲区中
                ByteBuffer byteBuffer=ByteBuffer.allocate(1024);
                int readBytes=sc.read(byteBuffer);
                //如果读取到数据
                if(readBytes>0){
                    byteBuffer.flip();
                    byte[] bytes=new byte[byteBuffer.remaining()];
                    //将缓冲区中已读取数据读到一个字节数组中
                    byteBuffer.get(bytes);
                    String body=new String(bytes,"UTF-8");
                    System.out.println("The time server receive order : " + body);
                    String currentTime="QUERY TIME ORDER".equalsIgnoreCase(body)?new java.util.Date(System.currentTimeMillis()).toString():"BAD ORDER";
                    doWrite(sc,currentTime);
                }else if(readBytes<0){
                    key.cancel();
                    sc.close();
                }else {
                    ;
                }
            }
        }
    }
    @Override
    public void run() {
        while (!stop){
            try {
                //在多路复用器选择器上为服务端套接字通道注册接受连接事件
                serverSocketChannel.register(selector,SelectionKey.OP_ACCEPT);
                //在多路复用选择器上等待客户端套接字通道请求连接
                selector.select(1000);
                //获取该多路复用器上的就绪的选择器键集合
                Set<SelectionKey> selectionKeys=selector.selectedKeys();
                Iterator<SelectionKey> iterator=selectionKeys.iterator();
                SelectionKey key=null;
                //迭代就绪的选择器键集合
                while (iterator.hasNext()) {
                    key = iterator.next();
                    iterator.remove();
                    try {
                        handleInput(key);
                    } catch (IOException e) {
                        if (key != null) {
                            key.cancel();
                            if (key.channel() != null)
                                key.channel().close();
                        }
                    }
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        //多路复用器关闭后,所有注册其上的Channel和Pipe等资源都会被自动去注册并关闭,所以不需要重复释放资源
        if(selector!=null)
            try{
                selector.close();
            }catch (IOException e){
                e.printStackTrace();
            }
    }
}
//客户端实现
public class TimeClientHandler implements Runnable {

    //服务端地址
    private String host;
    private int port;
    //多路复用选择器
    private Selector selector;
    //客户端套接字通道
    private SocketChannel socketChannel;
    //标识客户端是否运行
    private volatile boolean stop;
    public TimeClientHandler(String host,int port){
        this.host=host;
        this.port=port;
        try{
            //创建多路复用选择器
            selector=Selector.open();
            //创建客户端套接字通道并设置为非阻塞模式
            socketChannel=SocketChannel.open();
            socketChannel.configureBlocking(false);
        }catch (IOException e){
            e.printStackTrace();
            System.exit(1);
        }
    }
    private void handleInput(SelectionKey key) throws IOException{
        if(key.isValid()){
            SocketChannel sc=(SocketChannel)key.channel();
            if(key.isConnectable()){
                if(sc.finishConnect()){
                    sc.register(selector,SelectionKey.OP_READ);
                    doWrite(sc);
                }else{
                    System.exit(1);
                }
            }
            if(key.isReadable()){

                ByteBuffer byteBuffer=ByteBuffer.allocate(1024);
                int readBytes=sc.read(byteBuffer);
                if(readBytes>0) {
                    byteBuffer.flip();
                    byte[] bytes = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bytes);
                    String body = new String(bytes, "UTF-8");
                    System.out.println("Now is : " + body);
                    this.stop = true;
                }else if(readBytes<0){
                    this.stop=true;
                    key.cancel();
                    sc.close();
                }else{
                    ;
                }
            }
        }
    }
    private void doConnect() throws IOException{
        if(socketChannel.connect(new InetSocketAddress(host,port))){
            socketChannel.register(selector, SelectionKey.OP_READ);
            doWrite(socketChannel);
        }else{
            socketChannel.register(selector,SelectionKey.OP_CONNECT);
        }
    }
    private void doWrite(SocketChannel sc) throws IOException{
        byte[] req="QUERY TIME ORDER".getBytes();
        ByteBuffer byteBuffer=ByteBuffer.allocate(req.length);
        byteBuffer.put(req);
        byteBuffer.flip();
        sc.write(byteBuffer);
        if(!byteBuffer.hasRemaining())
            System.out.println("Send order 2 server succeed.");
    }
    @Override
    public void run() {
        try{
            //首先与服务端进行连接
            doConnect();
        }catch (IOException e){
            e.printStackTrace();
            System.exit(1);
        }

        while (!stop){
            try{
                selector.select(1000);
                Set<SelectionKey> selectionKeys=selector.selectedKeys();
                Iterator<SelectionKey> iterator=selectionKeys.iterator();
                SelectionKey key=null;
                while (iterator.hasNext()){
                    key=iterator.next();
                    iterator.remove();
                    try{
                        handleInput(key);
                    }catch (IOException e){
                        if(key!=null){
                            key.cancel();
                            if(key.channel()!=null)
                                key.channel().close();
                        }
                    }
                }
            }catch (IOException e){
                    e.printStackTrace();
                    System.exit(1);
            }
        }
    }
}
```

#### 2.3 AIO编程



#### 2.4 I/O模型的对比

