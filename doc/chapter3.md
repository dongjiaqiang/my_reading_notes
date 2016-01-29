#常用Java虚拟机参数

###1.跟踪调试参数
#####1.跟踪垃圾回收-读懂虚拟机日志
+ -XX:+PrintGC 启动Java虚拟机后,只要进行了GC,就会打印日志
+ -XX:+PrintGCDetails 将更加详细的打印GC日志
+ -XX:+PrintHeapAtGC 会在每次GC前后打印堆的信息
+ -XX:+PrintGCTimeStamps 该参数在每次GC发生时,额外输出GC发生的时间.该输出时间是为虚拟机启动后的时间偏移量.
+ -XX:+PrintGCApplicationConcurrentTime 打印应用程序的执行时间
+ -XX:+PrintGCApplicationStoppedTime 打印应用程序因GC而产生的停顿时间
+ -Xloggc:日志文件位置  将GC日志存储至文件中

#####2.类加载和卸载的跟踪
+ -XX:+TraceClassLoading 跟踪类的加载
+ -XX:+TraceClassUnloading 跟踪类的卸载
+ -XX:+PrintClassHistogram 按下Ctrl+Break则显示当前类的柱形图



#####3.系统参数查看
+ -XX:+PrintVMOptions 程序在运行时,打印虚拟机接受到的命令行显式参数,即虚拟机启动时,命令行明确的参数
+ -XX:+PrintCommandsLineFlags 打印传递给虚拟机的显式参数和隐式参数,隐式参数由系统启动时自行设置
+ -XX:+PrintFlagsFinal 打印所有的系统参数的值

###2.堆的配置参数
#####1.最大堆和初始堆的设置
   当Java进程启动时,虚拟机就会分配一块初始堆空间,可以使用参数-Xms指定这块空间的大小.虚拟机会尽量维持在初始堆空间的范围内运行.但如果初始堆空间耗尽,虚拟机会对堆空间进行扩展,其扩展上限为最大堆空间,最大堆空间可由参数-Xmx指定.
```java
 //最大可用内存就是-Xmx设置的内存大小
        System.out.print("maxMemory=");
        System.out.println(Runtime.getRuntime().maxMemory() + " bytes");
        //当前空闲内存应该为当前可用总内存大小减去使用的内存大小
        System.out.print("free mem=");
        System.out.println(Runtime.getRuntime().freeMemory()+" bytes");
        //当前可用总内存大小应该介于-Xms和-Xmx所设置的内存大小之间
        System.out.print("total mem=");
        System.out.println(Runtime.getRuntime().totalMemory()+" bytes");
```

可直接将初始堆与最大堆设置为相等,提高系统的性能.

#####2.新生代配置
  参数-Xmn可设置新生代大小,设置一个较大的新生代会减少老年代的大小.这个参数对系统性能和GC行为有影响.新生代大小一般设置为堆空间的1/3到1/4.
  
  参数-XX:SurviorRation设置新生代中eden空间和from/to空间的比例关系  -XX:SurviorRation=eden/from=eden/to

  




