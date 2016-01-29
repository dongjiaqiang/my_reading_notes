#Java虚拟机的基本结构

###1.Java虚拟机的架构
![jiagou](https://github.com/dongjiaqiang/understanding_the_jvm/blob/master/pictures/jiegou.png)
+ 类加载子系统 其负责从文件系统或网络中加载Class信息.所加载的类信息存放于一块称为方法区的内存空间.
+ Java堆 Java堆中存放着大多数实例对象,这块内存区域由所有线程共享
+ 直接内存 这个是直接向系统申请的内存区域,访问直接内存的速度优于堆,这块区域大小不直接受限于堆空间大小,但会受限于系统所给出的最大内存大小.
＋垃圾回收机制 可以对方法区,堆和直接内存进行回收.
+ Java栈 这是每一个线程私有的内存空间,栈中保存了方法调用的局部变量,方法参数.
+ 本地方法栈 同Java栈类似,但是这主要用于保存本地方法所调用的局部变量和方法参数.
+ PC寄存器 也是每个线程都有,其值指向当前正被执行的指令.
＋执行引擎 核心组件负责将Java代码编译为字节码.

###2.设置Java虚拟机参数
`java [-option]] class [args]`option就是启动虚拟机所设置的参数,class是带有main方法的Java类,args是传递给main方法的参数.

`java -Xmx32m Main a`设置系统最大可用堆空间大小为32M.
###3.Java堆
Java堆完全自动化管理,通过垃圾回收机制,垃圾对象可以被自动清理,根据垃圾回收机制的不同,Java堆结构是不一样的.
![dui](https://github.com/dongjiaqiang/understanding_the_jvm/blob/master/pictures/dui.png)
+ 新生代　新对象首先分配在eden区 经过一次新生代回收后会进入s0或s1区,之后没经过一次GC后,年龄都会增加一.
+ 老年代  年龄达到一定值后就会进入老年代

```java
public class SimpleHeap {
    private int id;
    public SimpleHeap(int id) {
        this.id = id;
    }
    public void show(){
        System.out.println("My ID is: "+id);
    }
    public static void main(String[]args){
        SimpleHeap s1=new SimpleHeap(1);
        SimpleHeap s2=new SimpleHeap(2);
        s1.show();
        s2.show();
    }
}
```
![gxi](https://github.com/dongjiaqiang/understanding_the_jvm/blob/master/pictures/gxi.png)
###3.Java栈
  Java栈是一块线程私有的内存空间.Java堆和程序数据密切相关,而Java栈则和线程密切相关.在Java栈中保存的是栈帧,每次调用一次函数都会压入一个栈帧,结束则会弹出一个栈帧.

  栈帧至少包含局部变量表,操作数栈和帧数据区这三个部分.

  Java虚拟机提供了参数-Xss来指定线程最大可用的栈大小,这也决定了函数调用最大的栈深度.
```java
public class TestStackDeep {
    private static int count=0;

    public static void recursion(){
        count++;
        recursion();
    }

    public static void main(String[] args){
        try {
            recursion();
        }catch (Throwable e){
            System.out.println("deep of Calling: "+count);
            e.printStackTrace();
        }
    }
}
```
`java -Xss125k TestStackDeep`设置线程最大可用栈空间大小

#####1.局部变量表
  局部变量表是栈帧重要的组成部分,用于保存函数的参数和局部变量.局部变量表位于栈帧中,其为影响栈空间的大小,局部变量表较小的函数调用可以支持更深的栈深度

  jclasslib工具可以进一步查看函数的局部变量.其中的槽位可以重用,如果一个局部变量过了作用域,那其作用域后声明的新的局部变量可能复用过期局部变量的槽位.
```java
public void localvar1(){
        int a=0;
        System.out.println(a);
        int b=0;
    }

    public void localvar2(){
        {
            int a=0;
            System.out.println(a);
        }
        int b=0;
    }
```
函数localvar1中的局部变量表有三个槽位,而函数localvar2中的局部变量表则有两个槽位,在a变量过期后,b可以复用a槽位.

  局部变量表中的变量也是重要的垃圾回收根节点.只要被局部变量表中直接或间接引用的对象都不会被回收.
```java
//函数中在对上分配了一个6M的堆空间,并由a变量引用,显示调用gc方法无法释放a引用的堆空间.
    public void localvarGC1(){
        byte[] a=new byte[6*1024*1024];
        System.gc();
    }
    //函数显示的将a设置为null,显示调用gc可以成功回收
    public void localvarGC2(){
        byte[] a=new byte[6*1024*1024];
        a=null;
        System.gc();
    }
    //调用gc方法时a变量已经过期,但是局部变量表未被销毁,所以gc方法无法起作用
    public void localvarGC3(){
        {
            byte[] a = new byte[6 * 1024 * 1024];
        }
        System.gc();
    }
    //b变量重用了a变量的槽位,使得gc方法可以其作用
    public void localvarGC4(){
        {
            byte[] a=new byte[6*1024*1024];
        }
        long b=8;
        System.gc();;
    }
    //调用localvarGC1方法可以使得局部变量表被销毁,显示gc可以其作用.
    public void localvarGC5() {
        localvarGC1();
        System.gc();
    }
```
#####2.操作数栈
#####3.帧数据区
#####4.栈上分配
  对于那些线程私有的对象可以将其打散分配在栈上,而不是分配在堆上.分配栈上可在函数调用后自行销毁而无需垃圾回收机制介入,从而提高性能.

  栈上分配的一个技术基础是进行逃逸分析,对象以局部变量形式存在,不会被其他线程所访问,则未逃逸.
```java
public class OnStackTest {

    public static class User{
        public int id=0;
        public String name="";
    }


    public static void alloc(){
	//u局部变量引用的对象未被函数返回或其他方式进行公开,则对象未逃逸,可以实现栈上分配.
        User u=new User();
        u.id=5;
        u.name="geym";
    }

    public static void main(String[] args){
        long b=System.currentTimeMillis();
        for(int i=0;i<1000000000;i++)
            alloc();
        long e=System.currentTimeMillis();
        System.out.println(e-b);
    }
}
```
`-server -Xmx10m -Xms10m -XX:DoEscapeAnalysis -XX:+PrintGC -XX:USETLAB -XX:+EliminateAllocations`参数设置开启栈分配

###4.方法区
 方法区是一块所有线程共享的内存区域.用于保存系统的类信息,包括类的字段,方法,常量池等.方法区大小决定系统可以保存多少类,如果太多也会导致其溢出

`-XX:PermSize=5M -XX:MaxPermSize=5M`设置永久区的大小

`-XX:MaxMetaspaceSize=5M`
