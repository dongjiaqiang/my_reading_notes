#类文件结构

###1.无关性
![y_wuguan](https://github.com/dongjiaqiang/understanding_the_jvm/blob/master/pictures/y_wuguan.png)

+ 平台无关性　Sun公司和其他虚拟机提供商发布了许多可运行在各种平台上的虚拟机,这些虚拟机都可以载入和实现同一种平台无法的字节码文件,从而实现平台无关性.
+ 语言无关性　虚拟机不与任何语言绑定,只与Class文件这个特定的二进制文件绑定,任何其他语言都可以编译为被虚拟机接受的有效的Class文件,从而实现语言无关性.

###2.Class类文件结构
#####1.class类文件结构
![c_geshi](https://github.com/dongjiaqiang/understanding_the_jvm/blob/master/pictures/c_geshi.png)

+ Class文件是一组以８位字节为基础单位的二进制流,Class文件不一定以磁盘形式存在.
+ Class文件中只有无符号数和表这两种数据类型,数据项严格按照顺序排列在Class文件中,之间没有任何空隙.
+ 无符号数包括u1,u2,u4和u8代表1,2,4,8个字节,对于多字节无符号数采用大端字节序排列.表由多个无符号数或其他表作为数据项构成的复合数据类型.

```java
public class TestClass {
	private int m;
	public int inc(){
		return m+1;
	}
}
```
对如上的Java源代码进行编译后生成的class文件各个字节的解析如下图:
![zi](https://github.com/dongjiaqiang/understanding_the_jvm/blob/master/pictures/zi.png)

① 魔数(magic number) 每个Class文件头４个字节称为魔数,用于确定这个文件是否为一个能被虚拟机接受的Class文件.其值固定为0xCAFEBABE.

② 次版本号(minor version)

③ 主版本号(major version) 虚拟机拒绝执行超过其版本号的Class文件.

#####2.常量池
常量池是Class文件的资源仓库,常量池中主要存放两大类常量:
+ 字面量(文本字符串,声明为final的常量值)
+ 符号引用(类和接口的全限定名,字段的名称和描述符,方法的名称和描述符)
+ 常量池中每一项常量都是一个表,共有14种不同的表,每种表开头都有一个u1类型标志位代表当前常量属于哪种常量类型.

④ 常量池大小(const pool count) 由于常量池中的常量数量不固定,需要在常量池入口放置一个u2类型的数据,代表常量池的计数器,计数器值从1开始到常量池大小减一

⑤ 常量池(const pool count) 
![cpc](https://github.com/dongjiaqiang/understanding_the_jvm/blob/master/pictures/cpc.png)
⑥ 访问标志(access flags) 用于识别这个类或接口层次的访问信息 包括是否为public类型,是否为abstract类型等,访问标志位和含义:
 + ACC_PUBLIC 0x0001 是否为public类型
 + ACC_FINAL 0x0010 是否为final类型,只能对类进行设置
 + ACC_SUPER 0x0020 JDK1.2之后编译出来的类这个标志位必须设置
 + ACC_INTERFACE 0x0200 标识接口
 + ACC_ABSTRACT 0x0400 标识抽象类,对于接口和抽象类该标识位被设置
 + ACC_SYNTHETIC 0x1000 标识这个类非用户代码产生的
 + ACC_ANNOTATION 0X2000 标识为注解
 + ACC_ENUM 0x4000 标识为枚举

各个标识位进行或操作就得到该类或接口的访问标志信息

⑦ 类索引(this class) 类索引确定这个类的全限定名 这个索引值指向一个类型为const_class_info的类描述符常量.通过这个常量的索引值可以找到定义为const_utf8_info类型的常量中的全限定名字符串.

⑧ 父类索引(super class) 同类索引,但确定这个类的父类全限定名，所有类都要父类但java.lang.Object除外,故除java.lang.Object类,其他类这个索引值不为0

⑨ 接口索引计数器interface count) 表示接口索引的数量,如果该类没有实现任何接口,则该值为0,且后面的接口索引不占用任何字节
⑩ 接口索引集合(interfaceS) 同类索引,但确定这个类所实现接口的类全限定名,数量为接口索引计数器所确定的值

__类索引,父类索引和接口索引共同确定了类的继承关系__

⑪ 字段计数器(fields count) 确定字段表数量　

#####3.字段表
字段表是用于描述接口或类中声明的变量.字段包括类级变量和实例级变量,但不包括方法体中声明的局部变量.

一个字段使用一个字段表进行描述,字段表的结构如下:
![fields_info]()
+ 字段访问标志(field access flags) 许多访问标志位的设置受限于Java语言本身的规则 可设置的标志位和含义如下:
  + ACC_PUBLIC 0x0001 字段是否为public
  + ACC_PRIVATE 0x0002 字段是否为private
  + ACC_PROTECTED 0x0004 字段是否为protected
  + ACC_STATIC 0x0008 字段是否为static
  + ACC_FINAL 0x0010 字段是否为final
  + ACC_VOLATILE 0x0040 字段是否为volatile
  + ACC_TRANSIENT 0x0080 字段是否为transient
  + ACC_SYNTHETIC 0x1000 字段是否由编译器产生
  + ACC_ENUM 0x4000 字段是否enum
+ 字段简单名称索引(field name index) 指向常量池的一个常量索引　简单名称指的是无类型和参数修饰的方法或字段名称　如这个类的字段m的简单名称就是m
+ 方法或字段描述符索引(field descriptor index) 指向常量池的一个索引 描述符的作用就是描述字段的数据类型,方法的参数列表(数量,顺序和类型)和返回值,如下是描述字段的描述符含义
  + B 基本类型byte
  + J 基本类型long
  + C 基本类型char
  + S 基本类型short
  + D 基本类型double
  + Z 基本类型boolean
  + F 基本类型float
  + V 特殊类型void
  + I 基本类型int
  + L 对象类型 如Ljava/lang/Object
  + 对于一维数组在类型前前置[来进行描述　如int[]描述为[I
  + 对于二维数组在类型前前置[[来进行描述　如java.lang.String[][]描述为[[Ljava/lang/String
  + 对方法进行描述时,要按照先参数列表,后返回值的顺序描述,参数列表按照参数的严格顺序放置于()中,如方法void inc()描述为()V,int cha(char[])描述为([C)I

12. 字段表集合(fields)
13. 方法计数器(methods count) 确定方法表数量
#####4.方法表
方法表的描述同字段表的描述是一样的,但对于访问标志和属性表集合的表述中存在差异
+ 方法访问标志(method access flags) 含义如下:
  + ACC_PUBLIC 0x0001 方法是否为public
  + ACC_PRIVATE 0x0002 方法是否为private
  + ACC_PROTECTED 0x0004 方法是否为protected
  + ACC_STATIC 0x0008 方法是否为static
  + ACC_FINAL 0x0010 方法是否为final
  + ACC_SYNCHRONIZED 0x0020 方法是否为synchronized
　+ ACC_BRIDGE 0x0040 方法是否为编译器产生的桥接方法
  + ACC_VARARGS 0x0080 方法是否接受不定参数
  + ACC_NATIVE 0x0100 方法是否为native方法
  + ACC_ABSTRACT 0x0400 方法是否为abstract方法
  + ACC_STRICTFP 0x0800 方法是否为strictfp
　+ ACC_SYNTHETIC 0x1000　方法是否是由编译器自动产生的

 



 







