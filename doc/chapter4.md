#垃圾回收的概念和算法

###1.垃圾回收
    在编程语法中,垃圾特指位于内存中,不会被再使用的对象.如果不及时将这些不会被使用的对象清理掉,当内存资源紧张,而新对象无法使用这些垃圾所占用的内存资源时,就会发生内存溢出.
###2.常用的垃圾回收算法
#####1引用计数法
  引用计数器实现非常简单,对于某个对象A,当任何一个对象引用的对象A,其引用计数增加一,当对A的引用消除了,其引用计数减一,当引用计数减为0时,其就可以被回收.
    
  引用计数法存在两个问题
+ 无法处理循环引用问题,当两个对象互相引用时,而没有任何其他根对象可触达时,其无法被回收.
+ 没有产生和消除引用都要对计数器进行操作,对系统的性能产生了一定的影响.

__可触达对象是可通过根对象引用到,而不可触达对象,根对象无法触达__

#####2.标记清除法
  标记清除法是现代垃圾回收机制的基础.该方法将垃圾回收分为标记阶段和清除阶段.
+ 标记阶段 通过根节点标记从根节点开始的可达对象.
+ 清除阶段 清除所有未被标记的对象.其可能最大的问题是空间碎片化.

#####3.复制算法
  将原有的内存空间分为两块,每次只使用其中一块,在垃圾回收时,将正在使用的内存中存活对象复制到未使用的内存块中,之后,清除正在使用内存块中的所有对象.
![sj](https://github.com/dongjiaqiang/understanding_the_jvm/blob/master/pictures/sf.png)

  在Java的新生代串行垃圾回收器中,使用了复制算法的思想.
  新生代分为eden,from和to三个空间.其中from和to可视为用于复制的两块大小相同,地位相等,且可进行角色互换的空间块.

+ 新生代 存放年轻对象的堆空间.年轻对象就是指刚刚创建的,或经历垃圾回收次数不多的对象.
+ 老年代 存放老年对象的堆空间.老年对象指经历多次垃圾回收依然存活的对象.

  在垃圾回收时,eden空间中的存活对象复制到survior中的to空间,正在使用的survior中的from空间中的年轻对象也会复制到to空间(大对象,或老年对象进入老年代,to空间已满,则对象直接进入老年代,此时可以直接清空eden和from空间.复制算法适用于新生代,因为其垃圾对象多于存活对象.
  
#####4.标记压缩法
  标记压缩算法的最终效果等同于标记清除算法执行完后,再进行一次内存碎片整理.
#####5.分代算法
  分代算法将内存区间根据对象的特点分为几个块,根据内存区间的特点,使用不同的回收算法,以提高回收效率.
  
  对于新生代对象采用复制算法,而对于老年代对象则采用标记清除法或标记压缩法.

  由于新生代的回收频率比较高,虚拟机可能采用了一种称为卡表的数据结构,卡表为一个比特位集合,每一个比特位用来表示老年代的某一个区域中的所有对象是否持有新生代对象引用.这样确定老年代对新生代的引用时,就可以无需扫描全部老年代区域.

#####6.分区算法
  分代算法将按照对象的生命周期的长短划分为两个部分.分区算法将整个堆空间划分为连续的不同小区间.


###3.判断可触及性
  垃圾回收的基本思想是考察每一个对象的可触及性,即从根节点是否可到达这个对象.

  可触及性状态定义:
+ 可触及性 从根节点可到达这个对象
+ 可复活的 对象的所有引用都被释放,但是对象可能在finalize()方法中复活
+ 不可触及性 对象的finalize()方法被调用,并且没有复活.那么就会进入不可触及状态,不可触及对象无法复活,因为finalize()方法只能被调用一次.

#####1对象复活
```java
public class CanReliveObj {
    public static CanReliveObj obj;
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("CanReliveObj finalize called");
        obj=this;
    }
    @Override
    public String toString() {
        return "CanReliveObj{}";
    }
    public static void main(String [] args)throws InterruptedException{
        obj=new CanReliveObj();
        obj=null;
        //这里obj设置为null,调用gc是将触发finalize方法,在这个方法中对象将被复活
        System.gc();
        Thread.sleep(1000);
        if(obj==null)
            System.out.println("obj是null");
        else
            System.out.println("obj可用");
        System.out.println("第2次gc");
        obj=null;
        //finalize方法只能被调用一次,对象真正被回收.
        System.gc();
        Thread.sleep(1000);
        if(obj==null)
            System.out.println("obj是null");
        else
            System.out.println("obj可用");

    }
}
```
#####2.引用和可触及性的强度
  Java存在四种级别引用:强引用,软引用,弱引用和虚引用.

+ 强引用

  1. 强引用可以直接访问目标对象
  2. 强引用所指向的对象在任何时候都不会被系统回收,虚拟机宁愿抛出OOM异常,也不会回收强引用所指向的对象
  3. 强引用可能导致内存泄漏

+ 软引用

  当堆空间不足时,就会回收软引用所指向的对象.

     
+ 弱引用
  
  
+虚引用

 

###4.垃圾回收的停顿现象