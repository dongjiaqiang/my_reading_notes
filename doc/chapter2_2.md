#Java内存区域与内存溢出异常

###1.运行时数据区域

![data_area](https://github.com/dongjiaqiang/understanding_the_jvm/blob/master/pictures/ds.png)

#####1.程序计数器(Program Counter Register)
+ 当前线程所执行字节码的行号指示器
+ 通过改变这个计数器的值来选取下一条所需执行的字节码指令(Java方法,对于Native方法该计数器为空)
+ 未定义OutOfMemoryError异常

#####2.Java虚拟机栈(VM Stack)
+ 描述Java方法执行的内存模型
+ 栈中存储的是栈帧,每一个Java方法的调用和完成对应着一个栈帧的进栈和出栈.
+ 栈帧包括局部变量表,操作数栈,动态链接和出口信息等.
+ 局部变量表存放着编译期可知的各种基本数据类型和对象引用,每一个方法需要在帧中分配多大的局部变量空间在编译期完全可知.
+ 定义了超过调用栈深度的StackOverflowError异常和OutOfMemoryError异常.

#####3.本地方法栈(Native Method Stack)
  同虚拟机栈一样的作用,但服务的是本地方法.

#####4.Java堆(Heap)
+ 存放着绝大部分的对象实例和数组对象实例.
+ 定义了OutOfMemoryError异常

#####5.方法区(Method Area)
+ 存储已被虚拟机加载的类信息,字符串常量池,静态变量,代码等数据.
+ 定义了OutOfMemoryError异常

#####6.运行时常量池(Runtime Constant Pool)


#####7.直接内存(Direct Memory)
+ 不属于虚拟机运行时数据区,不受堆大小影响但受系统总内存影响
+ 在Java NIO中所分配的缓冲区就是在直接内存上分配的,通过存储在堆中的DirectByteBuffer对象作为这块内存的引用进行操作.
  
###3.对象
#####1.对象的创建
  



###4.OutOfMemoryError异常实战





