# My Technical Notes

### Context

#### [java语言程序设计](https://github.com/dongjiaqiang/my_reading_notes#一-java语言程序设计)
#### [Java并发编程](https://github.com/dongjiaqiang/my_reading_notes#二-java并发编程)
#### [java反射编程](https://github.com/dongjiaqiang/my_reading_notes#三-java反射编程)
#### [java虚拟机](https://github.com/dongjiaqiang/my_reading_notes#四-java虚拟机)
#### [java网络编程](https://github.com/dongjiaqiang/my_reading_notes#五-java网络编程)
#### [Scala语言程序设计](https://github.com/dongjiaqiang/my_reading_notes#六-scala语言程序设计)
#### [Scala并发编程](https://github.com/dongjiaqiang/my_reading_notes#七-scala并发编程)
#### [Groovy语言程序设计](https://github.com/dongjiaqiang/my_reading_notes#八-groovy语言程序设计)
#### [Spring框架](https://github.com/dongjiaqiang/my_reading_notes#九-spring框架)
#### [领域专用语言](https://github.com/dongjiaqiang/my_reading_notes#十-领域专用语言)
#### [Linux命令行和Shell语言程序设计](https://github.com/dongjiaqiang/my_reading_notes#十一-linux命令行和shell语言程序设计)
#### [Haskell程序设计语言](https://github.com/dongjiaqiang/my_reading_notes#十二haskell程序设计语言)
#### [Clojure语言程序设计](https://github.com/dongjiaqiang/my_reading_notes#十三-clojure语言程序设计)
#### [软件工程](https://github.com/dongjiaqiang/my_reading_notes#十四-软件工程)
#### [Spark框架](https://github.com/dongjiaqiang/my_reading_notes#十五-spark框架)
#### [Netty框架](https://github.com/dongjiaqiang/my_reading_notes#十六-netty框架)
#### [Akka框架](https://github.com/dongjiaqiang/my_reading_notes#十七-akka框架)
#### [Zookeeper框架](https://github.com/dongjiaqiang/my_reading_notes#十九-zookeeper框架)
#### [Storm框架](https://github.com/dongjiaqiang/my_reading_notes#二十三-storm框架)

## 一. Java语言程序设计

### [JavaSE 8 API Documentation](http://docs.oracle.com/javase/8/docs/api/overview-summary.html)

### [Apache Commons Office Website](http://commons.apache.org/)

### [Apache Log4j Office Website](http://logging.apache.org/log4j/1.2/)

### [Google Guava Project](https://github.com/google/guava)

### [Google Guava User Guide](https://github.com/google/guava/wiki)

### [Google Guava User Guide(中文版)](http://ifeve.com/google-guava/)
+ [基本工具](http://7xoeea.com1.z0.glb.clouddn.com/Google%20Guava%E6%95%99%E7%A8%8B%E5%9F%BA%E6%9C%AC%E5%B7%A5%E5%85%B7.html) __使用和避免null__ __前置条件__ __常见Object方法__ __Guava排序比较器__ __简化异常和错误的传播与检查__
+ [集合](http://7xoeea.com1.z0.glb.clouddn.com/Google%20Guava%E6%95%99%E7%A8%8B%E9%9B%86%E5%90%88.html) __不可变集合__ __新集合类型__

### [Effective Java(中文第二版)](http://www.amazon.cn/Sun-%E5%85%AC%E5%8F%B8%E6%A0%B8%E5%BF%83%E6%8A%80%E6%9C%AF%E4%B8%9B%E4%B9%A6-Effective-Java%E4%B8%AD%E6%96%87%E7%89%88-Joshua-Bloch/dp/B001PTGR52/ref=pd_bxgy_14_img_3?ie=UTF8&refRID=1K4TFG3XFVJH3DCFT2FT)
+ [创建和销毁对象](http://7xoeea.com1.z0.glb.clouddn.com/%E5%88%9B%E5%BB%BA%E5%92%8C%E9%94%80%E6%AF%81%E5%AF%B9%E8%B1%A1.html) __何时和如何创建对象 何时和如何避免创建对象 如何确保对象能够适时地销毁 如何管理对象销毁前的各种清理动作__
+ [通用对象方法](http://7xoeea.com1.z0.glb.clouddn.com/%E5%AF%B9%E8%B1%A1%E9%80%9A%E7%94%A8%E6%96%B9%E6%B3%95%28General%20Method%C2%A0%29.html)
__Object类所有的非final方法(equals,hashCode,toString,clone和finalize)都有明确的通用约定 其被设计成要被覆盖__
+ [通用程序设计](http://7xoeea.com1.z0.glb.clouddn.com/%E9%80%9A%E7%94%A8%E7%A8%8B%E5%BA%8F%E8%AE%BE%E8%AE%A1%28General%20Program%20Design%29.html) __局部变量处理 控制结构 类库用法 各种数据类型用法 优化和命名惯例__
+ [类和接口](http://7xoeea.com1.z0.glb.clouddn.com/%E7%B1%BB%E5%92%8C%E6%8E%A5%E5%8F%A3%28Class%20And%20Interface%29.html) __类和接口是Java程序设计语言核心 其是Java语言的基本抽象单元__
+ [泛型](http://7xoeea.com1.z0.glb.clouddn.com/%E6%B3%9B%E5%9E%8B%28Generic%29.html) __使用泛型可以告诉编译器每个集合中接受哪些对象类型 编译器自动在插入时进行转换 并在编译时告知是否插入类型错误的对象__
+ [枚举与注解](http://7xoeea.com1.z0.glb.clouddn.com/%E6%9E%9A%E4%B8%BE%28Enum%29%E5%92%8C%E6%B3%A8%E8%A7%A3%28Annotation%29.html) __Java 1.5所增加的两个新的引用类型__
+ [方法](http://7xoeea.com1.z0.glb.clouddn.com/%E6%96%B9%E6%B3%95%28Method%29.html) __如何处理参数和返回值 如何设计方法签名 如何为方法编写文档__
+ [异常](http://7xoeea.com1.z0.glb.clouddn.com/%E5%BC%82%E5%B8%B8(Exception).html) __充分发挥异常的优点 可以提高程序的可读性 可靠性和可维护性__
+ [并发](http://7xoeea.com1.z0.glb.clouddn.com/%E5%B9%B6%E5%8F%91%28Concurrency%29.html) __并行编程可以使程序执行速度得到极大提高 或者为设计某些类型的程序提供更易用的模型 或者两者皆有__

### [Java编程思想(第4版)](http://www.amazon.cn/Java%E7%BC%96%E7%A8%8B%E6%80%9D%E6%83%B3-%E5%9F%83%E5%8F%B2%E5%B0%94/dp/B0011F7WU4/ref=sr_1_1?ie=UTF8&qid=1451465907&sr=8-1&keywords=JAVA) 
+ [对象导论](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC1%E7%AB%A0%20%E5%AF%B9%E8%B1%A1%E5%AF%BC%E8%AE%BA.html) __万物皆对象__
+ [初始化与清理](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC5%E7%AB%A0%20%E5%88%9D%E5%A7%8B%E5%8C%96%E4%B8%8E%E6%B8%85%E7%90%86.html) __初始化和清理涉及Java的编程安全__
+ [访问权限控制](http://7xoeea.com1.z0.glb.clouddn.com/6%E8%AE%BF%E9%97%AE%E6%9D%83%E9%99%90%E6%8E%A7%E5%88%B6.html) __访问控制(或隐藏具体实现)与”最初的实现并不恰当”有关__
+ [复用类](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC7%E7%AB%A0%20%E5%A4%8D%E7%94%A8%E7%B1%BB.html) __组合和继承是非常重要的两种代码重用机制__
+ [多态](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC8%E7%AB%A0%20%E5%A4%9A%E6%80%81.html) __多态,数据抽象和继承是面向对象程序语言的三大特征__
+ [接口](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC9%E7%AB%A0%20%E6%8E%A5%E5%8F%A3.html) __接口和内部类提供了一种将接口与实现分离的更加结构化的方法__
+ [内部类](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC10%E7%AB%A0%20%E5%86%85%E9%83%A8%E7%B1%BB.html) __可以把一个类的定义放在另一个类的定义内部,这就是内部类__
+ [通过异常处理错误](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC12%E7%AB%A0%20%E9%80%9A%E8%BF%87%E5%BC%82%E5%B8%B8%E5%A4%84%E7%90%86%E9%94%99%E8%AF%AF.html) __发现错误的理想时机是在编译期,但是在编译期无法找出所有的错误,剩下的问题必须在运行期解决__
+ [类型信息](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC14%E7%AB%A0%20%E7%B1%BB%E5%9E%8B%E4%BF%A1%E6%81%AF.html) __运行时类型信息使得可以在程序运行时发现和使用类型信息__
+ [泛型]() __泛型实现了参数化类型的概念,使代码可以应用于多种类型. 泛型机制解耦了类或方法与所使用的类型间的约束__
+ [容器深入研究](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC17%E7%AB%A0%20%E5%AE%B9%E5%99%A8%E6%B7%B1%E5%85%A5%E7%A0%94%E7%A9%B6.html) __深入探索Java集合类库__
+ [枚举类型](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC19%E7%AB%A0%20%E6%9E%9A%E4%B8%BE%E7%B1%BB%E5%9E%8B.html) __关键字enum可以将一组具名的值的有限集合创建为一种新的类型,而这些具名的值可以作为常规的程序组件使用__
+ [注解](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC20%E7%AB%A0%20%E6%B3%A8%E8%A7%A3%28Annotation%29.html) __注解为我们在代码中添加信息提供了一种形式化的方法,使我们可以在稍后某时刻非常方便地使用这些数据__
+ [并发]() __并行编程可以使程序执行速度得到极大提高 或者为设计某些类型的程序提供更易用的模型 或者两者皆有__

### [Java 8实战](https://www.amazon.cn/Java-8%E5%AE%9E%E6%88%98-%E8%8B%B1-%E5%8E%84%E9%A9%AC-%E6%84%8F-%E5%BC%97%E6%96%AF%E7%A7%91-%E8%8B%B1-%E7%B1%B3%E5%85%8B%E7%BD%97%E5%A4%AB%E7%89%B9/dp/B01ER75QC8/ref=sr_1_1?ie=UTF8&qid=1461740545&sr=8-1&keywords=Java+8%E5%AE%9E%E6%88%98)

#### 1.基础知识

+ [通过行为参数化传递代码](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC%202%E7%AB%A0%20%E9%80%9A%E8%BF%87%E8%A1%8C%E4%B8%BA%E5%8F%82%E6%95%B0%E5%8C%96%E4%BC%A0%E9%80%92%E4%BB%A3%E7%A0%81.html) __行为参数化__ __匿名类__ __Lambda表达式__
+ [Lambda表达式](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC3%E7%AB%A0%20Lambda%E8%A1%A8%E8%BE%BE%E5%BC%8F.html) __函数式接口__ __默认方法__ __函数描述符__ __环绕执行模式__ __类型检查__ __类型推断__ __闭包__ __方法引用__ __复合Lambda表达式__ __避免装箱__ __目标类型__

#### 2.函数式数据处理

+ [引入流](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC4%E7%AB%A0%20%E5%BC%95%E5%85%A5%E6%B5%81.html) __流__ __集合__ __内部迭代__ __外部迭代__ __中间操作__ __终端操作__
+ [使用流](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC5%E7%AB%A0%20%E4%BD%BF%E7%94%A8%E6%B5%81.html) __筛选__ __截短__ __匹配__ __跳过__ __映射__ __流扁平化__ __归约__ __查找__ __数值流__ __原始类型流特化__ __构建流__ __无限流__ __有状态操作__ __无状态操作__
+ [用流收集数据](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC6%E7%AB%A0%20%E7%94%A8%E6%B5%81%E6%94%B6%E9%9B%86%E6%95%B0%E6%8D%AE.html) __收集器__ __Collector接口__ __collect方法__ __预定义收集器__ __归约__ __汇总__ __连接字符串__ __分组__ __多级分组__ __分区__ __自定义收集器__
+ [并行数据处理与性能](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC7%E7%AB%A0%20%20%20%20%20%E5%B9%B6%E8%A1%8C%E6%95%B0%E6%8D%AE%E5%A4%84%E7%90%86%E4%B8%8E%E6%80%A7%E8%83%BD.html) __并行流__ __顺序流__ __parallelStream方法__ __sequential方法__ __分支/合并框架__ __工作窃取__ __Spliterator接口__

#### 3.高效Java 8编程

+ [重构 测试和调试](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC8%E7%AB%A0%20%E9%87%8D%E6%9E%84%20%E6%B5%8B%E8%AF%95%E5%92%8C%E8%B0%83%E8%AF%95.html) __重构__ __设计模式__ __测试__ __调试__
+ [默认方法](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC9%E7%AB%A0%20%E9%BB%98%E8%AE%A4%E6%96%B9%E6%B3%95.html) __默认方法__ __API演进__ __多继承__ __组合接口__ __解决冲突__ __菱形继承问题__
+ [用optional取代null](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC10%E7%AB%A0%20%E7%94%A8optional%E5%8F%96%E4%BB%A3null.html) __Optional__ __防御式检查__ __组合Optional对象__ __创建Optional对象__ __过滤Optional对象__ __Optional类方法__ __异常与Optional__ __转换Optional对象__ __提取Optional对象__
+ [CompletableFuture:组合式异步编程](http://7xonn1.com1.z0.glb.clouddn.com/1.html) __Future接口__ __CompletableFuture接口__ __同步API__ __异步API__ __流水线操__ __合并操作__
+ [ 新的日期和时间API](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC12%E7%AB%A0%20%E6%96%B0%E7%9A%84%E6%97%A5%E6%9C%9F%E5%92%8C%E6%97%B6%E9%97%B4API.html) __LocalDate__ __LocalTime__ __LocalDateTime__ __Instant__ __Duration__ __Period__ __Temporal接口__ __TemporalAdjuster函数式接口__ __DateTimeFormatter__

#### 4.超越Java 8

+ [函数式的思考](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC13%E7%AB%A0%20%E5%87%BD%E6%95%B0%E5%BC%8F%E7%9A%84%E6%80%9D%E8%80%83.html) __共享可变数据__ __命令式编程__ __声明式编程__ __无副作用__ __函数式编程__ __引用透明性__ __递归__ __迭代__ __尾递归__
+ [函数式编程的技巧](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC14%E7%AB%A0%20%E5%87%BD%E6%95%B0%E5%BC%8F%E7%BC%96%E7%A8%8B%E7%9A%84%E6%8A%80%E5%B7%A7.html) __一等函数__ __高阶方法__ __柯里化__ __局部应用__ __函数式数据结构__ __延迟计算__ __延迟列表__ __模式匹配__ __引用透明性__ __缓存__
+ [结论和Java的未来](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC16%E7%AB%A0%20%E7%BB%93%E8%AE%BA%E5%92%8CJava%E7%9A%84%E6%9C%AA%E6%9D%A52.html) __新特性__ __函数式编程思想__ __未成熟特性__

### [Java 8函数式编程](http://www.amazon.cn/Java-8%E5%87%BD%E6%95%B0%E5%BC%8F%E7%BC%96%E7%A8%8B-%E8%8B%B1-%E6%B2%83%E4%BC%AF%E9%A1%BF/dp/B00VDSW7AE/ref=sr_1_1?ie=UTF8&qid=1458486119&sr=8-1&keywords=java%E5%87%BD%E6%95%B0%E5%BC%8F%E7%BC%96%E7%A8%8B)

+ [Lambda表达式](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC2%E7%AB%A0%20Lambda%E8%A1%A8%E8%BE%BE%E5%BC%8F.html) __Lambda表达式是一个匿名方法 将行为像数据一样进行传递__
+ [流](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC3%E7%AB%A0%20%E6%B5%81.html) __流使得可以在更高的层次上对集合进行操作__
+ [类库](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC4%E7%AB%A0%20%E7%B1%BB%E5%BA%93.html) __在类库开发中应用函数式编程思想__
+ [高级集合类和收集器](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC5%E7%AB%A0%20%E9%AB%98%E7%BA%A7%E9%9B%86%E5%90%88%E7%B1%BB%E5%92%8C%E6%94%B6%E9%9B%86%E5%99%A8.html) __关于Java 8中集合类的一些高级主题__
+ [数据并行化](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC6%E7%AB%A0%20%E6%95%B0%E6%8D%AE%E5%B9%B6%E8%A1%8C%E5%8C%96.html) __数据并行化是把工作拆分 同时在多核CPU上执行的方式__
+ [测试 调试和重构]() __重构 测试驱动开发和持续集成越来越流行 如果需要将Lambda表达式应用于日常编程工作 就需要学会如何为其编写单元测试__
+ [设计和架构的原则](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC8%E7%AB%A0%20%E8%AE%BE%E8%AE%A1%E5%92%8C%E6%9E%B6%E6%9E%84%E5%8E%9F%E5%88%99.html) __软件开发最重要的设计工具不是什么技术而是设计原则__

### [Head First Servlets and JSP(第2版)](https://www.amazon.cn/Head-First-Servlets-and-JSP-%E5%B7%B4%E8%90%A8%E5%A7%86/dp/B0042WNHGG/ref=sr_1_1?ie=UTF8&qid=1503240280&sr=8-1&keywords=jsp)
+ [请求和响应(Servlet技术模型)](http://7xoeea.com1.z0.glb.clouddn.com/%E8%AF%B7%E6%B1%82%E5%92%8C%E5%93%8D%E5%BA%94%28Servlet%E6%8A%80%E6%9C%AF%E6%A8%A1%E5%9E%8B%29.html)
+ [属性和监听者(容器模型)](http://7xoeea.com1.z0.glb.clouddn.com/%E5%B1%9E%E6%80%A7%E5%92%8C%E7%9B%91%E5%90%AC%E8%80%85%28Web%E5%AE%B9%E5%99%A8%E6%A8%A1%E5%9E%8B%29.html)
+ [会话管理(会话状态)](http://7xoeea.com1.z0.glb.clouddn.com/%E4%BC%9A%E8%AF%9D%E7%AE%A1%E7%90%86%28%E4%BC%9A%E8%AF%9D%E7%8A%B6%E6%80%81%29.html)
+ [使用JSP(JSP技术模型)](http://7xoeea.com1.z0.glb.clouddn.com/%E4%BD%BF%E7%94%A8JSP%28JSP%E6%8A%80%E6%9C%AF%E6%A8%A1%E5%9E%8B%29.html)

## 二. Java并发编程

### [Java并发编程实战](http://www.amazon.cn/Java%E5%B9%B6%E5%8F%91%E7%BC%96%E7%A8%8B%E5%AE%9E%E6%88%98-%E7%9B%96%E8%8C%A8/dp/B0077K9XHW/ref=pd_sim_14_1?ie=UTF8&dpID=51XldrwRktL&dpSrc=sims&preST=_AC_UL160_SR124%2C160_&refRID=1XYR1SM2GH25CNPM5Z3K)
+ [简介](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AE%80%E4%BB%8B%28Introduction%29.html) __并发__ __优势__ __风险__
+ [线程安全性](http://7xoeea.com1.z0.glb.clouddn.com/线程安全性(Thread%20Safety).html) __线程安全性__  __原子性__ __加锁机制__  __活跃性与性能问题__
+ [对象的共享](http://7xoeea.com1.z0.glb.clouddn.com/%E5%AF%B9%E8%B1%A1%E7%9A%84%E5%85%B1%E4%BA%AB(Shared%20Objects).html) __可见性__ __发布与逸出__ __线程封闭__  __不变性__ __安全发布__
+ [对象的组合](http://7xoeea.com1.z0.glb.clouddn.com/%E5%AF%B9%E8%B1%A1%E7%BB%84%E5%90%88.html) __设计线程安全性的类__ __实例封闭__ __线程安全性委托__  __同步策略文档化__
+ [构建基础模块](http://7xoeea.com1.z0.glb.clouddn.com/%E5%9F%BA%E7%A1%80%E6%9E%84%E5%BB%BA%E6%A8%A1%E5%9D%97.html) __同步容器__ __并发容器__ __同步工具__  
+ [任务执行](http://7xoeea.com1.z0.glb.clouddn.com/%E4%BB%BB%E5%8A%A1%E6%89%A7%E8%A1%8C.html) __线程__ __Executor框架__ 
+ [取消和关闭](http://7xoeea.com1.z0.glb.clouddn.com/%E5%8F%96%E6%B6%88%E5%92%8C%E5%85%B3%E9%97%AD%28Abort%20And%20Interrupted%29.html) __任务取消__ __中断__ __停止基于线程的服务__ __处理非正常的线程终止__
+ [避免活跃性问题](http://7xoeea.com1.z0.glb.clouddn.com/%E9%81%BF%E5%85%8D%E6%B4%BB%E8%B7%83%E6%80%A7%E9%97%AE%E9%A2%98%28Avoid%20Active%20Problem%29.html) __死锁__ __饥饿__ __活锁__
+ [性能和可伸缩性](http://7xoeea.com1.z0.glb.clouddn.com/%E6%80%A7%E8%83%BD%E4%B8%8E%E5%8F%AF%E4%BC%B8%E7%BC%A9%E6%80%A7.html) __缩小锁的范围__ __减少锁的粒度__ __锁分段__
+ [线程池的使用](http://7xoeea.com1.z0.glb.clouddn.com/%E7%BA%BF%E7%A8%8B%E6%B1%A0%E7%9A%84%E4%BD%BF%E7%94%A8%28Thread%20Pool%29.html) __任务__ __执行策略__ __解耦__ __线程饥饿__ __线程死锁__ __设置线程池__ __线程池创建和销毁__ __管理队列任务__ __饱和策略__ __线程工厂__
+ [显式锁](http://7xoeea.com1.z0.glb.clouddn.com/显式锁.html) __Lock__ __ReenTrantLock__ __轮询锁__ __定时锁__ __读写锁__
+ [构建自定义的同步工具](http://7xoeea.com1.z0.glb.clouddn.com/%E6%9E%84%E5%BB%BA%E8%87%AA%E5%AE%9A%E4%B9%89%E7%9A%84%E5%90%8C%E6%AD%A5%E5%B7%A5%E5%85%B7.html) __状态依赖管理__ __条件队列__ __Condtion对象__ __AbstractQueuedSynchronizer__ 
+ [原子变量和非阻塞同步机制](http://7xl8na.com1.z0.glb.clouddn.com/%E5%8E%9F%E5%AD%90%E5%8F%98%E9%87%8F%E4%B8%8E%E9%9D%9E%E9%98%BB%E5%A1%9E%E5%90%8C%E6%AD%A5%E6%9C%BA%E5%88%B6.html) __原子变量__ __非阻塞算法__  
+ [Michael-Scott非阻塞算法中的插入算法](http://7xoeea.com1.z0.glb.clouddn.com/Michael-Scott%E9%9D%9E%E9%98%BB%E5%A1%9E%E7%AE%97%E6%B3%95%E4%B8%AD%E7%9A%84%E6%8F%92%E5%85%A5%E7%AE%97%E6%B3%95.html) __Michael-Scott非阻塞算法__
+ [基于Treiber算法实现的非阻塞栈](http://7xoeea.com1.z0.glb.clouddn.com/%E5%9F%BA%E4%BA%8ETreiber%E7%AE%97%E6%B3%95%E5%AE%9E%E7%8E%B0%E7%9A%84%E9%9D%9E%E9%98%BB%E5%A1%9E%E6%A0%88.html) __Treiber算法__
+ [Java内存模型](http://7xoeea.com1.z0.glb.clouddn.com/Java%E5%86%85%E5%AD%98%E6%A8%A1%E5%9E%8B.html) __内存模型__ __重排序__ __Happens-Before关系__ __发布__ __初始化__ __双重检查锁__

### [Java多线程编程实战指南(设计模式篇)](https://www.amazon.cn/gp/product/B016IW624G/ref=pd_bxgy_14_img_2?ie=UTF8&psc=1&refRID=YKS1MEW8R4T1XEFJTK1R)
+ [不可变对象模式](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC3%E7%AB%A0%20Immutable%20Object%28%E4%B8%8D%E5%8F%AF%E5%8F%98%E5%AF%B9%E8%B1%A1%29%E6%A8%A1%E5%BC%8F.html) __使得可以在不使用锁情况下 既保证共享变量访问的线程安全 又能够避免引入锁可能带来的问题和开销__
+ [保护性暂挂模式]() __该模式的核心思想是如果某个线程执行特定操作前需要满足一定的条件 则在该条件未满足时将该线程暂停运行(即暂挂线程 使其处于等待状态 直到该条件满足时才继续该线程运行)__
+ [两阶段终止模式](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC5%E7%AB%A0%20Two-phase%20Termination%28%E4%B8%A4%E9%98%B6%E6%AE%B5%E7%BB%88%E6%AD%A2%29%E6%A8%A1%E5%BC%8F.html) __两阶段终止模式通过将停止线程这个动作分解为准备阶段和执行阶段这两个阶段 提供一种通用的用于优雅地停止线程的方法__
+ [承诺模式](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC6%E7%AB%A0%20Promise%28%E6%89%BF%E8%AF%BA%29%E6%A8%A1%E5%BC%8F.html) __承诺模式是一种异步编程模式 它使得可以先开始一个任务的执行 并得到一个用于获取该任务执行结果的凭据对象 而不必等待该任务执行完毕就可以继续执行其他操作 得到需要该任务的执行结果时 再调用凭据对象的相关方法来获取 这样就可以避免不必要的等待 增加了系统的并发性__
+ [生产者消费者模式](http://7xoeea.com1.z0.glb.clouddn.com/ProducerConsumer%28%E7%94%9F%E4%BA%A7%E8%80%85%E8%B4%B9%E8%80%85%29%E6%A8%A1%E5%BC%8F.html) __为避免数据的生产者和消费者中处理速率快的一方需要等待处理速率慢的一方 生产者消费者模式通过在数据的生产者和消费者间引入一个通道对二者进行解耦 生产者将其生产的数据放入通道 消费者则从相应通道中取出数据进行消费 生产者将其生产的数据放入通道 消费者从相应通道中取出数据进行消费 生产者和消费者各自运行在各自的线程中 从而使双方处理速率互不影响__
+ [线程池模式](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC9%E7%AB%A0%20Thread%20Pool%28%E7%BA%BF%E7%A8%8B%E6%B1%A0%29%E6%A8%A1%E5%BC%8F.html) __线程池模式的核心思想是使用队列对待处理的任务进行缓存 并复用一定数量的工作者线程去取队列的任务进行执行__ 
+ [线程特有存储模式](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC10%E7%AB%A0%20Thread%20Specific%20Storage%28%E7%BA%BF%E7%A8%8B%E7%89%B9%E6%9C%89%E5%AD%98%E5%82%A8%29%E6%A8%A1%E5%BC%8F.html) __不同线程使用统一的访问接入点 可以获取该线程所特有的TSObject实例 这就是线程特有存储模式的核心思想__

### [七周七并发模型](https://www.amazon.cn/%E4%B8%83%E5%91%A8%E4%B8%83%E5%B9%B6%E5%8F%91%E6%A8%A1%E5%9E%8B-%E5%B8%83%E5%BD%BB/dp/B00V4B2KEI/ref=sr_1_1?ie=UTF8&qid=1461251092&sr=8-1&keywords=%E4%B8%83%E5%91%A8%E4%B8%83%E5%B9%B6%E5%8F%91)

+ [线程与锁]()

### [Java虚拟机并发编程](https://item.jd.com/10994913715.html)

## 三. Java反射编程

### [Java Reflection in Action](https://www.amazon.cn/Java-Reflection-in-Action-Forman-Ira-R/dp/1932394184/ref=sr_1_1?ie=UTF8&qid=1478399465&sr=8-1&keywords=Java+Reflection+in+Action)
+ [Java反射基础 访问字段 动态加载和运行时实例化](http://7xoeea.com1.z0.glb.clouddn.com/Java%E5%8F%8D%E5%B0%84%E5%AE%9E%E8%B7%B5123.html)
+ [动态代理 调用栈自检 自定义类加载器](http://7xoeea.com1.z0.glb.clouddn.com/Java%E5%8F%8D%E5%B0%84%E5%AE%9E%E8%B7%B5456.html)

## 四. Java虚拟机

### [深入理解Java虚拟机:JVM高级特性与最佳实践(第2版)](http://www.amazon.cn/%E6%B7%B1%E5%85%A5%E7%90%86%E8%A7%A3Java%E8%99%9A%E6%8B%9F%E6%9C%BA-JVM%E9%AB%98%E7%BA%A7%E7%89%B9%E6%80%A7%E4%B8%8E%E6%9C%80%E4%BD%B3%E5%AE%9E%E8%B7%B5-%E5%91%A8%E5%BF%97%E6%98%8E/dp/B00D2ID4PK/ref=sr_1_1?ie=UTF8&qid=1451532281&sr=8-1&keywords=java%E8%99%9A%E6%8B%9F%E6%9C%BA)

+ [索引](https://www.evernote.com/shard/s501/nl/176057404/385da952-abcc-4f9e-9609-6221bea07c91/)

### 高效并发

+ [Java内存模型与线程](https://www.evernote.com/shard/s501/nl/176057404/4f82b793-2566-41d3-9d09-7dcb090da434/)
+ [线程安全与锁优化](https://www.evernote.com/shard/s501/nl/176057404/e51ffbd5-1f3e-4003-a11c-331920ca18b6/)

### [实战Java虚拟机:JVM故障诊断与性能优化](http://www.amazon.cn/%E5%AE%9E%E6%88%98Java%E8%99%9A%E6%8B%9F%E6%9C%BA-JVM%E6%95%85%E9%9A%9C%E8%AF%8A%E6%96%AD%E4%B8%8E%E6%80%A7%E8%83%BD%E4%BC%98%E5%8C%96-%E8%91%9B%E4%B8%80%E9%B8%A3/dp/B00V34NZBS/ref=sr_1_1?ie=UTF8&qid=1454035543&sr=8-1&keywords=%E5%AE%9E%E6%88%98Java%E8%99%9A%E6%8B%9F%E6%9C%BA%3AJVM%E6%95%85%E9%9A%9C%E8%AF%8A%E6%96%AD%E4%B8%8E%E6%80%A7%E8%83%BD%E4%BC%98%E5%8C%96)

+ [认识Java虚拟机的基本结构](https://github.com/dongjiaqiang/my_reading_notes/blob/master/doc/chapter2.md)
+ [常用虚拟机参数](https://github.com/dongjiaqiang/my_reading_notes/blob/master/doc/chapter3.md)
+ [垃圾回收概念与算法](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC4%E7%AB%A0%20%E5%9E%83%E5%9C%BE%E5%9B%9E%E6%94%B6%E6%A6%82%E5%BF%B5%E4%B8%8E%E7%AE%97%E6%B3%95.html) __引用计数法__ __标记清除法__ __复制算法__ __标记压缩算法__ __分代算法__ __分区算法__ __可触及性__ __强引用__ __弱引用__ __虚引用__ __软引用__ __停顿__

### [Java性能权威指南](https://www.amazon.cn/Java%E6%80%A7%E8%83%BD%E6%9D%83%E5%A8%81%E6%8C%87%E5%8D%97-%E5%A5%A5%E5%85%8B%E6%96%AF/dp/B01DLB7Z66/ref=sr_1_1?ie=UTF8&qid=1460901455&sr=8-1&keywords=java%E6%80%A7%E8%83%BD)

### [自己动手写Java虚拟机](https://www.amazon.cn/%E8%87%AA%E5%B7%B1%E5%8A%A8%E6%89%8B%E5%86%99Java%E8%99%9A%E6%8B%9F%E6%9C%BA-%E5%BC%A0%E7%A7%80%E5%AE%8F/dp/B01FX8YEKK/ref=sr_1_3?s=books&ie=UTF8&qid=1481463323&sr=1-3&keywords=%E8%87%AA%E5%B7%B1%E5%8A%A8%E6%89%8B%E5%86%99)

### [大话Java性能优化](https://www.amazon.cn/dp/B01EIE3KFU/ref=sr_1_1?ie=UTF8&qid=1485838398&sr=8-1&keywords=%E5%A4%A7%E8%AF%9Djava%E6%80%A7%E8%83%BD%E4%BC%98%E5%8C%96)

### [垃圾回收算法手册:自动内存管理的艺术](https://www.amazon.cn/dp/B01CQQ1PGS/ref=sr_1_2?ie=UTF8&qid=1485838457&sr=8-2&keywords=%E5%9E%83%E5%9C%BE%E5%9B%9E%E6%94%B6%E7%AE%97%E6%B3%95)

## 五. Java网络编程

### [Fundamental Networking in Java](https://www.amazon.cn/Fundamental-Networking-in-Java-Pitt-Esmond/dp/1849965455/ref=sr_1_1?ie=UTF8&qid=1460214221&sr=8-1&keywords=Fundamental+Networking+in+Java)

+ [Fundamental In TCP](http://7xoeea.com1.z0.glb.clouddn.com/Fundamental%20In%20TCP.html)

## 六. Scala语言程序设计

### [Scala Documentation Guides And Overviews](http://docs.scala-lang.org/overviews/)

### [Scala Ducumentation Specification](http://www.scala-lang.org/files/archive/spec/2.12/)

### [Scala Documentation API](http://www.scala-lang.org/api/2.12.1/)

### [Scala Documentation Style Guide](http://docs.scala-lang.org/style/?_ga=1.100514014.1118235608.1482761107)

### [Scala编程实战](https://www.amazon.cn/Scala%E7%BC%96%E7%A8%8B%E5%AE%9E%E6%88%98-%E4%BA%9A%E5%8E%86%E5%B1%B1%E5%A4%A7/dp/B01H6ZJFAW/ref=sr_1_1?ie=UTF8&qid=1478003896&sr=8-1&keywords=scala%E7%BC%96%E7%A8%8B%E5%AE%9E%E6%88%98)

+ [控制结构]()
+ [对象](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC6%E7%AB%A0%20%E5%AF%B9%E8%B1%A12.html)
+ [集合](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC10%E7%AB%A0%20%E9%9B%86%E5%90%88%20-%20%E9%A9%AC%E5%85%8B%E9%A3%9E%E8%B1%A1%20-%20%E4%B8%93%E4%B8%BA%E5%8D%B0%E8%B1%A1%E7%AC%94%E8%AE%B0%E6%89%93%E9%80%A0%E7%9A%84Markdown%E7%BC%96%E8%BE%91%E5%99%A8.pdf)
+ [列表 数组 映射 集和其他](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC11%E7%AB%A0%20%E5%88%97%E8%A1%A8%20%E6%95%B0%E7%BB%84%20%E6%98%A0%E5%B0%84%20%E9%9B%86%E5%92%8C%E5%85%B6%E4%BB%96.html)
+ [与Java交互](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC17%E7%AB%A0%20%E4%B8%8EJava%E4%BA%A4%E4%BA%92.html)
+ [惯用法](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC20%E7%AB%A0%20%E6%83%AF%E7%94%A8%E6%B3%95.html)

### [Scala程序设计(第2版)](https://www.amazon.cn/Scala%E7%A8%8B%E5%BA%8F%E8%AE%BE%E8%AE%A1%E7%AC%AC2%E7%89%88-%E4%B8%87%E6%99%AE%E5%8B%92/dp/B01E4X8X52/ref=sr_1_1?ie=UTF8&qid=1461687642&sr=8-1&keywords=Scala%E7%A8%8B%E5%BA%8F%E8%AE%BE%E8%AE%A1%EF%BC%88%E7%AC%AC2%E7%89%88%EF%BC%89)

+ [更简洁 更强大](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC2%E7%AB%A0%20%E6%9B%B4%E7%AE%80%E6%B4%81%20%E6%9B%B4%E5%BC%BA%E5%A4%A7%28%E4%BF%AE%E6%AD%A3%29.html) __分号__ __变量声明__ __Range__ __偏函数__ __方法声明__ __Future__ __嵌套方法__ __尾递归__ __类型推断__ __显式类型标注__ __保留字__ __字面量__ __Option__ __封闭类的继承__ __包__ __成员导入__ __包对象__ __参数化类型__ __类型成员__
+ [要点详解](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC3%E7%AB%A0%20%E8%A6%81%E7%82%B9%E8%AF%A6%E8%A7%A3.html) __标识符__ __无参方法__ __优先级规则__ __左结合__ __右结合__ __DSL__ __if语句__ __for推导式__ __while循环__ __条件操作符__ __try catch__ __名字调用__ __值调用__ __惰性赋值__ __枚举__ __可插入字符串__ __Trait__
+ [模式匹配](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC4%E7%AB%A0%20%E6%A8%A1%E5%BC%8F%E5%8C%B9%E9%85%8D.html) __简单匹配__ __匹配值 变量和类型__ __匹配序列__ __匹配元组__ __卫述句__ __匹配case类__ __unapply方法__ __unapplySeq方法__ __匹配可变参数列表__ __匹配正则表达式__ __封闭继承层级和全覆盖匹配__ __模式匹配其他用法__
+ [隐式详解](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC5%E7%AB%A0%20%E9%9A%90%E5%BC%8F%E8%AF%A6%E8%A7%A3.html) __隐式参数__ __implicitly方法__ __隐式参数适用场景__ __执行上下文__  __隐式证据__ __虚类型__ __隐式参数规则__ __隐式转换__ __类型类__ __隐式解析规则__ __Scala内置隐式__
+ [函数式编程](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC6%E7%AB%A0%20Scala%E5%87%BD%E6%95%B0%E5%BC%8F%E7%BC%96%E7%A8%8B.html) __函数式编程__ __纯函数__ __引用透明__ __副作用__ __高阶函数__ __不可变变量__ __匿名函数__ __Lambda__ __闭包__ __递归__ __尾递归__ __偏应用函数__ __Curry化__ __函数式数据结构__ __序列__ __映射表__ __集合__ __遍历__ __映射__ __过滤__ __折叠与归约__ __组合器__
+ [深入学习for推导式](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC7%E7%AB%A0%20%E6%B7%B1%E5%85%A5%E5%AD%A6%E4%B9%A0for%E6%8E%A8%E5%AF%BC%E5%BC%8F.html) __for推导式组成元素__ __for推导式内部机制__ __for推导式转化规则__ __Option容器__ __Either容器__ __Try类型__
+ [Scala面向对象编程](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC8%E7%AB%A0%20Scala%E9%9D%A2%E5%90%91%E5%AF%B9%E8%B1%A1%E7%BC%96%E7%A8%8B.html) __面向对象编程__ __类__ __对象__  __伴生对象__ __引用类型__ __值类型__ __价值类__ __通用特质__ __父类__ __主构造器__ __辅助构造器__ __case类__ __统一访问原则__ __一元方法__ __验证输入__ __嵌套类型__
+ [特质](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC9%E7%AB%A0%20%E7%89%B9%E8%B4%A8.html) __接口__ __特质__ __混入类__ __混入实例__ __特质叠加__ __构造特质__ __类线性化算法__
+ [Scala对象系统(Ⅰ)](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC10%E7%AB%A0%20Scala%E5%AF%B9%E8%B1%A1%E7%B3%BB%E7%BB%9F%28%E2%85%A0%29.html)
 __协变__ __逆变__ __不变__ __类型层次结构__ __Nothing和Null__ __Product特质__ __Predef对象__ __断言__ __对象相等__
+ [Scala对象系统(Ⅱ)](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC11%E7%AB%A0%20Scala%E5%AF%B9%E8%B1%A1%E7%B3%BB%E7%BB%9F%28%E2%85%A1%29.html) __override__ __覆写具体成员__ __final__ __覆写方法__ __覆写字段__ __覆写抽象类型__ __惰性值__ __预先初始化字段__ __统一访问原则__ __类线性化算法__
+ [Scala集合库](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC12%E7%AB%A0%20Scala%E9%9B%86%E5%90%88%E5%BA%93.html) __通用集合__ __可变集合__ __不可变集合__ __并发集合__ __并行集合__ __值类型特化__
+ [可见性规则](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC13%E7%AB%A0%20%E5%8F%AF%E8%A7%81%E6%80%A7%E8%A7%84%E5%88%99.html) __可见性规则__ __默认可见性__ __public__ __protected__ __private__ __作用域内受保护__ __作用域内私有__
+ [Scala类型系统(Ⅰ)](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC14%E7%AB%A0%20Scala%E7%B1%BB%E5%9E%8B%E7%B3%BB%E7%BB%9F%28%E2%85%A0%29.html) __参数化类型__ __变异标志__ __类型边界__ __上下文边界__ __视图边界__ __抽象类型__ __子类型标志__ __结构化类型__ __复合类型__ __存在类型__
+ [Scala类型系统(Ⅱ)]()
+ [Scala动态调用](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC19%E7%AB%A0%20Scala%E5%8A%A8%E6%80%81%E8%B0%83%E7%94%A8.html) __动态调用__ __DSL__ __Dynamic特质__
+ [高级函数式编程]()
+ [并发工具]()
+ [与Java的互操作](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC22%E7%AB%A0%20%E4%B8%8EJava%E7%9A%84%E4%BA%92%E6%93%8D%E4%BD%9C.html) __在Scala代码中使用Java名称__ __Java泛型与Scala泛型__ __JavaBean的性质__ __AnyVal类型与Java原生类型__
+ [应用程序设计]() 

### [Scala程序设计:Java虚拟机多核编程实战](http://www.amazon.cn/Scala%E7%A8%8B%E5%BA%8F%E8%AE%BE%E8%AE%A1-Java%E8%99%9A%E6%8B%9F%E6%9C%BA%E5%A4%9A%E6%A0%B8%E7%BC%96%E7%A8%8B%E5%AE%9E%E6%88%98-%E8%8B%8F%E5%B8%95%E6%8B%89%E9%A9%AC%E5%B0%BC%E4%BA%9A%E5%A7%86/dp/B00CBBKJ0W/ref=sr_1_4?ie=UTF8&qid=1451455100&sr=8-4&keywords=sCALA)
+ [Scala的类](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC4%E7%AB%A0%20Scala%E7%9A%84%E7%B1%BB.html) __创建类__ __类继承__ __单例对象__ __独立对象__ __伴生对象__ __Scala中的static__
+ [自适应类型](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC5%E7%AB%A0%20%E8%87%AA%E9%80%82%E5%BA%94%E7%B1%BB%E5%9E%8B.html) __容器和类型推演__ __Any类型__ __Nothing类型__ __Option类型__ __类型推演__ __传递参数__ __参数化类型的可变性__
+ [函数值和闭包](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC6%E7%AB%A0%20%E5%87%BD%E6%95%B0%E5%80%BC%E5%92%8C%E9%97%AD%E5%8C%85.html) __高阶函数__ __函数值__ __Curry化__ __重用函数值__ __参数的位置记法__ __Executor Around Method模式__ __偏应用函数__ __闭包__
+ [Trait和类型转换](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC7%E7%AB%A0%20Trait%E5%92%8C%E7%B1%BB%E5%9E%8B%E8%BD%AC%E6%8D%A2.html) __Trait__ __选择性混入__ __延迟绑定__ __隐式类型转换__ 
+ [使用容器](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC8%E7%AB%A0%20%E4%BD%BF%E7%94%A8%E5%AE%B9%E5%99%A8.html) __Scala容器__ __Set__ __Map__ __List__ __for表达式__ 
+ [模式匹配和正则表达式](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC9%E7%AB%A0%20%E6%A8%A1%E5%BC%8F%E5%8C%B9%E9%85%8D%E5%92%8C%E6%AD%A3%E5%88%99%E8%A1%A8%E8%BE%BE%E5%BC%8F.html) __匹配字面量和常量__ __匹配通配符__ __匹配元组和列表__ __类型和卫述句匹配__ __case表达式里的模式变量和常量__ __使用case类进行模式匹配__ __使用提取器进行匹配__ __正则表达式__
+ [异常处理](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC13%E7%AB%A0%20%E5%BC%82%E5%B8%B8%E5%A4%84%E7%90%86.html) __异常处理__ __catch顺序__

### [Scala与Clojure函数式编程模式 Java虚拟机高效编程](http://www.amazon.cn/Scala%E4%B8%8EClojure%E5%87%BD%E6%95%B0%E5%BC%8F%E7%BC%96%E7%A8%8B%E6%A8%A1%E5%BC%8F-Java%E8%99%9A%E6%8B%9F%E6%9C%BA%E9%AB%98%E6%95%88%E7%BC%96%E7%A8%8B-%E7%BE%8E-%E8%B4%9D%E7%BB%B4%E6%8B%89%E5%A4%B8%E6%9E%97/dp/B00XJ2AU24/ref=sr_1_4?ie=UTF8&qid=1458537996&sr=8-4&keywords=%E5%87%BD%E6%95%B0%E5%BC%8F%E7%BC%96%E7%A8%8B)

+ [替换面向对象模式](http://7xoeea.com1.z0.glb.clouddn.com/%E6%9B%BF%E6%8D%A2%E9%9D%A2%E5%90%91%E5%AF%B9%E8%B1%A1%E6%A8%A1%E5%BC%8F.html) __替换函数式接口__ __替换承载状态的函数式接口__ __替代生成器模式来获得不可变对象__ __替代迭代器模式__ __替代模板方法模式__ __替代策略模式__ __替换空对象__ __替换装饰器模式__ __替代访问者模式__ __替代依赖注入__
+ [函数式模式](http://7xoeea.com1.z0.glb.clouddn.com/%E5%87%BD%E6%95%B0%E5%BC%8F%E6%A8%A1%E5%BC%8F.html) __尾递归模式__ __相互递归模式__ __Filter-Map-Reduce模式__ __操作链模式__ __函数生成器模式__ __记忆模式__ __惰性序列模式__ __集中的可变性__ __自定义控制流__

### [Scala函数式编程](https://www.amazon.cn/Scala%E5%87%BD%E6%95%B0%E5%BC%8F%E7%BC%96%E7%A8%8B-Paul-Chiusano-R%C3%BAnar-Bjarnason/dp/B01DWKIT9I/ref=sr_1_2?ie=UTF8&qid=1460901637&sr=8-2&keywords=Scala)

#### 函数式编程介绍

+ [何为函数式编程](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC1%E7%AB%A0%20%E4%BD%95%E4%B8%BA%E5%87%BD%E6%95%B0%E5%BC%8F%E7%BC%96%E7%A8%8B.html) __函数式编程__ __纯函数__ __副作用__ __引用透明__ __纯粹度__ __替代模型__
+ [Scala中的函数式编程模式](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC2%E7%AB%A0%20Scala%E4%B8%AD%E7%9A%84%E5%87%BD%E6%95%B0%E5%BC%8F%E7%BC%96%E7%A8%8B%E6%A8%A1%E5%BC%8F%28%E4%BF%AE%E6%94%B9%29.html) __尾递归函数__ __高阶函数__ __多态函数__ __组合函数__
+ [函数式数据结构](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC3%E7%AB%A0%20%E5%87%BD%E6%95%B0%E5%BC%8F%E6%95%B0%E6%8D%AE%E7%BB%93%E6%9E%84.html) __函数式数据结构__ __模式匹配__ __数据共享__ __高阶函数的类型推导__ __树__
+ [不用异常来处理错误](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC4%E7%AB%A0%20%E4%B8%8D%E7%94%A8%E5%BC%82%E5%B8%B8%E6%9D%A5%E5%A4%84%E7%90%86%E9%94%99%E8%AF%AF.html) __异常的优点与劣势__ __异常的其他选择__ __Option数据类型__ __Option的使用模式__ __Option组合__ __Either数据类型__
+ [严格求值和惰性求值](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC5%E7%AB%A0%20%E4%B8%A5%E6%A0%BC%E6%B1%82%E5%80%BC%E5%92%8C%E6%83%B0%E6%80%A7%E6%B1%82%E5%80%BC.html) __严格求值__ __惰性求值__ __严格函数__ __非严格函数__ __lazy__ __惰性列表__ __无限流__ __共递归__
+ [纯函数式状态](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC6%E7%AB%A0%20%E7%BA%AF%E5%87%BD%E6%95%B0%E5%BC%8F%E7%8A%B6%E6%80%81.html) __纯函数式状态__ __组合状态行为__ __嵌套状态行为__

#### 功能设计和组合子库

+ [纯函数式的并行计算](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC7%E7%AB%A0%20%E7%BA%AF%E5%87%BD%E6%95%B0%E5%BC%8F%E7%9A%84%E5%B9%B6%E8%A1%8C%E8%AE%A1%E7%AE%97.html) __函数式库__ __代换模型__ __代数推理__ __基础组合子__ __组合组合子__ __应用组合子__ __映射法则__ __分流法则__ __分离焦点__
+ [基于性质的测试]()
+ [语法分析器组合子]()

#### 函数设计的通用结构

#### 作用与I/O

### [快学Scala](http://www.amazon.cn/%E5%BF%AB%E5%AD%A6Scala-%E5%87%AF%E2%80%A2S-%E9%9C%8D%E6%96%AF%E6%9B%BC/dp/B009P8FHHO/ref=sr_1_1?ie=UTF8&qid=1451875959&sr=8-1&keywords=%E5%BF%AB%E5%AD%A6scala)

+ [控制结构与函数](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC2%E7%AB%A0%20%E6%8E%A7%E5%88%B6%E7%BB%93%E6%9E%84%E5%92%8C%E5%87%BD%E6%95%B0.html) __条件表达式__ __语句终止__ __块表达式__ __循环__ __高级for循环__ __for推导式__ __函数__ __默认参数__ __带名参数__ __变长参数__ __过程__ __懒值__ __异常__
+ [数组相关操作](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC3%E7%AB%A0%20%E6%95%B0%E7%BB%84%E7%9B%B8%E5%85%B3%E6%93%8D%E4%BD%9C.html) __定长数组__ __数组缓存__ __遍历数组__ __数组转换__ __常用算法__ __多维数组__
+ [映射和元组](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC4%E7%AB%A0%20%E6%98%A0%E5%B0%84%E5%92%8C%E5%85%83%E7%BB%84.html) __映射__ __对偶__ __元组__
+ [高阶函数](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC12%E7%AB%A0%20%E9%AB%98%E9%98%B6%E5%87%BD%E6%95%B0.html)  __函数值__  __匿名函数__ __高阶函数__ __参数类型推断__  __闭包__ __柯里化__ 
+ [类](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC5%E7%AB%A0%20%E7%B1%BB.html) __getter属性__ __setter属性__ __对象私有字段__ __Bean属性__ __副构造器__ __主构造器__ __嵌套类__
+ [对象](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC6%E7%AB%A0%20%E5%AF%B9%E8%B1%A1.html) __单例对象__ __伴生对象__ __扩展类或特质的对象__ __apply方法__  __应用程序对象__ __枚举__
+ [包](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC7%E7%AB%A0%20%E5%8C%85.html) __包__ __作用域规则__ __串联式语包__ __文件顶部标记法__ __包对象__ __引入__ __重命名和隐藏方法__
+ [继承](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC8%E7%AB%A0%20%E7%BB%A7%E6%89%BF%E4%BF%AE%E5%A4%8D.html) __扩展类__ __重写方法__ __类型检查和转换__ __超类构造__ __重写字段__ __匿名子类__ __抽象类__ __抽象字段__ __继承层次__ __对象相等性__
+ [操作符](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC11%E7%AB%A0%20%E6%93%8D%E4%BD%9C%E7%AC%A6%E4%BF%AE%E6%94%B9.html) __标识符__ __中置操作符__ __一元操作符__ __赋值操作符__ __优先级__ __apply和update方法__ __提取器__ __unapplySeq方法__
+ [集合](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC13%E7%AB%A0%20%E9%9B%86%E5%90%88.html) __Scala集合继承层次__ __可变和不可变集合__ __序列__ __列表__ __可变列表__ __集__ __常用方法__ __函数映射到集合__ __化简折叠扫描__ __拉链操作__ __迭代器__ __流__ __懒视图__ __与Java集合的互操作__ __线程安全的集合__ __并行集合__
+ [模式匹配与样例类](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC14%E7%AB%A0%20%E6%A8%A1%E5%BC%8F%E5%8C%B9%E9%85%8D%E5%92%8C%E6%A0%B7%E4%BE%8B%E7%B1%BB.html) __match表达式__ __守卫__ __类型匹配__ __匹配数组 列表和元组__ __提取器__ __变量声明中的模式__ __for表达式中的模式__ __样例类__ __copy方法的带名参数__ __匹配嵌套结构__ __密封类__ __模拟枚举__ __Option类型__ __偏函数__
+ [注解](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC15%E7%AB%A0%20%E6%B3%A8%E8%A7%A31.html) __什么是注解__ __什么可被注解__ __注解实现__ __针对Java特性的注解__ __用于优化的注解__ __用于错误和警告的注解__
+ [特质](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC10%E7%AB%A0%20%E7%89%B9%E8%B4%A8.html) __当做接口的特质__ __带有具体实现的特质__ __带有特质的对象__ __特质叠加__ __在特质中重写抽象方法__ __当做富接口的特质__ __特质中的具体字段__ __特质中的抽象字段__ __特质构造顺序__ __初始化特质中的字段__ __扩展类的特质__ __自身类型__ __机制__
+ [隐式转换](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC21%E7%AB%A0%20%E9%9A%90%E5%BC%8F%E8%BD%AC%E6%8D%A2%E5%92%8C%E9%9A%90%E5%BC%8F%E5%8F%82%E6%95%B0.html) __隐式转换__ __隐式转换函数__ __隐式转换规则__ __隐式参数__ __上下文界定__ __类型证明__
+ [文件和正则表达式](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC9%E7%AB%A0%20%E6%96%87%E4%BB%B6%E5%92%8C%E6%AD%A3%E5%88%99%E8%A1%A8%E8%BE%BE%E5%BC%8F.html) __读取行__ __读取字符__ __访问目录__ __序列化__ __进程控制__ __正则表达式__ __正则表达式组__
+ [类型参数](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC17%E7%AB%A0%20%E7%B1%BB%E5%9E%8B%E5%8F%82%E6%95%B0.html) __泛型类__ __泛型函数__ __类型变量界定__ __视图界定__ __上下文界定__ __Manifest上下文界定__ __多重界定__ __类型约束__ __型变__ __协变和逆变点__ __类型通配符__
+ [高级类型](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC18%E7%AB%A0%20%E9%AB%98%E7%BA%A7%E7%B1%BB%E5%9E%8B.html) __单例类型__ __类型投影__ __路径__ __类型别名__ __结构类型__ __复合类型__ __中置类型__ __存在类型__ __Scala类型系统__ __自身类型__ __依赖注入__ __抽象类型__ 
+ [Actor](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC20%E7%AB%A0%20Actor.html) __创建和启动Actor__ __发生消息__ __接收消息__ __消息通道__ __同步消息__ __Future__ __共享线程__ __Actor生命周期__ __链接多个Actor__ __设计Actor__

### [深入理解Scala](http://www.amazon.cn/%E6%B7%B1%E5%85%A5%E7%90%86%E8%A7%A3Scala-%E8%8B%8F%E7%91%9E%E8%8C%A8/dp/B00RS6C9F8/ref=sr_1_1?ie=UTF8&qid=1452065856&sr=8-1&keywords=%E6%B7%B1%E5%85%A5%E7%90%86%E8%A7%A3Scala)

+ [设计哲学](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC1%E7%AB%A0%20%20%E8%AE%BE%E8%AE%A1%E5%93%B2%E5%AD%A6.html) __设计哲学__ __函数式编程__ __面向对象编程__ __类型推断__ __隐式转换__ __Scala调用Java__ __Java调用Scala__
+ [核心规则](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC2%E7%AB%A0%20%E6%A0%B8%E5%BF%83%E8%A7%84%E5%88%99.html) __REPL__ __面向表达式编程__ __不变性__ __Option类__
+ [编码规范](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC3%E7%AB%A0%20%E7%BC%96%E7%A0%81%E8%A7%84%E8%8C%83.html) __编码规范__ __行尾推断__ __变量__ __注解__
+ [面向对象](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC4%E7%AB%A0%20%E9%9D%A2%E5%90%91%E5%AF%B9%E8%B1%A1%E7%BC%96%E7%A8%8B.html) __延迟构造__ __多重继承__ __类的线性化__ __public接口应当提供返回值__
+ [隐式转换](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC5%E7%AB%A0%20%E9%9A%90%E5%BC%8F%E8%BD%AC%E6%8D%A2.html) __隐式解析__ __隐式参数__ __隐式函数__ __作用域绑定__ __限制隐式作用域__ __结合默认参数__
+ [集合类型](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC8%E7%AB%A0%20%E9%9B%86%E5%90%88%E7%B1%BB%E5%9E%8B.html) __集合类型继承体系__ __可变集合__ __不可变集合__ __延迟计算__ __即时计算__ __串行计算__ __并行计算__
+ [类型系统](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC6%E7%AB%A0%20%E7%B1%BB%E5%9E%8B%E7%B3%BB%E7%BB%9F.html) __类型__ __路径__ __类型注入__ __路径依赖类型__ __type关键字__ __结构化类型__ __类型约束(类型定界)__ __类型参数__ __高阶类型__ __型变__ __存在类型__

### [Scala Design Pattern](https://www.amazon.cn/Scala-Design-Patterns-Patterns-for-Practical-Reuse-and-Design-Hunt-John/dp/3319349724/ref=sr_1_2?ie=UTF8&qid=1476970256&sr=8-2&keywords=SCALA+DESIGN)

#### Fundamental Patterns
+ [Immutability(不变性)](http://7xoeea.com1.z0.glb.clouddn.com/Scala%20Design%20Pattern%284%29%20%E4%B8%8D%E5%8F%98%E6%80%A7.html) __Immutability indicates that once created, an objects's data cannot be changed__
+ [Singleton(单例)](http://7xoeea.com1.z0.glb.clouddn.com/Scala%20Design%20Pattern%285%29%E5%8D%95%E4%BE%8B.html) __The Singleton pattern describes a type that can only have one object constructed for it__
+ [Marker Trait(标记特质)](http://7xoeea.com1.z0.glb.clouddn.com/Scala%20Design%20Pattern%286%29%20%E6%A0%87%E8%AE%B0%E7%89%B9%E8%B4%A8.html) __The Marker Trait pattern uses trait that declare no method, functions,types or properties to indicate addition semantics of a type(class,object or further traits)__
+ [Delegation(代理)]() __Delegation pattern is a response to all those examples in books that show inheritance between types as the fundanmental approach to reuse in object oritented languages__

#### Code Reuse Patterns
+ [Lazy Parameters(懒值)](http://7xoeea.com1.z0.glb.clouddn.com/Scala%20Design%20Pattern%288%29%20%E6%87%92%E5%80%BC.html) __In some situations a parameter to a method or function may be costly to process or evaluate,but might only need to be processed or evaluated in certain situations__
+ [Partially Applied Functions(部分应用函数)](http://7xoeea.com1.z0.glb.clouddn.com/Scala%20Design%20Pattern%289%29%20%E9%83%A8%E5%88%86%E5%BA%94%E7%94%A8%E5%87%BD%E6%95%B0.html) __An operation can be partially applied in that it is possible to bind one or more of the parameters to create a new operation with fewer parameters.The remaining parameters must then be provided when the new operation is invoked__
+ [Stackable Traits(层叠特质)](http://7xoeea.com1.z0.glb.clouddn.com/Scala%20Design%20Pattern%2811%29%20%E5%B1%82%E5%8F%A0%E7%89%B9%E8%B4%A8.html) __Stacking such traits extends this concept further allowing traits to extend behaviour as well as define it__
+ [Structural Injection(结构级注入)](http://7xoeea.com1.z0.glb.clouddn.com/Scala%20Design%20Pattern%28%E7%BB%93%E6%9E%84%E7%BA%A7%E6%B3%A8%E5%85%A5%29.html) __The Structural Injection pattern uses structural typing to provide one approach for DI in Scala__
+ [Implicit Injection(隐式注入)](http://7xoeea.com1.z0.glb.clouddn.com/%E9%9A%90%E5%BC%8F%E6%B3%A8%E5%85%A5.html) __Use of implicit declarations in Scala to provide a simple yet type safe approach to the injection of objects to a dependent consumer__

#### Gang of Four Patterns
+ [Factory Operation(工厂方法)]()
+ [Builder(构建者)]()

## 七. Scala并发编程

### [Scala并发编程](http://www.amazon.cn/Scala%E5%B9%B6%E5%8F%91%E7%BC%96%E7%A8%8B-%E6%99%AE%E7%BD%97%E7%A7%91%E4%BD%A9%E8%8C%A8/dp/B015YBW0SY/ref=sr_1_6?ie=UTF8&qid=1451876157&sr=8-6&keywords=scala)

+ [JVM和Java内存模型中的并发处理方式](http://7xoeea.com1.z0.glb.clouddn.com/2%20JVM%E5%92%8CJava%E5%86%85%E5%AD%98%E6%A8%A1%E5%9E%8B%E4%B8%AD%E7%9A%84%E5%B9%B6%E5%8F%91%E5%A4%84%E7%90%86%E6%96%B9%E5%BC%8F.html) __创建和启动线程__ __原子执行方式__ __监控器和同步__ __死锁__ __保卫锁__ __中断线程和正常关闭__ __Volatile变量__ __Java内存模型__ __不可变字段__ __final字段__  [练习](http://7xoeea.com1.z0.glb.clouddn.com/JVM%E5%92%8CJava%E5%86%85%E5%AD%98%E6%A8%A1%E5%9E%8B%E4%B8%AD%E7%9A%84%E5%B9%B6%E5%8F%91%E5%A4%84%E7%90%86%E6%96%B9%E5%BC%8F%20%E7%BB%83%E4%B9%A0.html)
+ [构建并发程序的传统材料](http://7xoeea.com1.z0.glb.clouddn.com/3%E6%9E%84%E5%BB%BA%E5%B9%B6%E5%8F%91%E7%A8%8B%E5%BA%8F%E7%9A%84%E4%BC%A0%E7%BB%9F%E6%9D%90%E6%96%99.html) __Executor对象__ __ExecutionContext对象__ __原子型基元__ __无锁编程__ __原子变量__ __ABA问题__ __惰性值__ __并发集合__ __并发队列__ __并发集__ __并发映射__ __并发遍历__ __创建和处理进程__ [练习](http://7xoeea.com1.z0.glb.clouddn.com/%E6%9E%84%E5%BB%BA%E5%B9%B6%E5%8F%91%E7%A8%8B%E5%BA%8F%E7%9A%84%E4%BC%A0%E7%BB%9F%E6%9D%90%E6%96%99%20%E7%BB%83%E4%B9%A0.html)
+ [使用Future和Promise对象编写异步程序](http://7xoeea.com1.z0.glb.clouddn.com/4%20%E4%BD%BF%E7%94%A8Future%E5%92%8CPromise%E5%AF%B9%E8%B1%A1%E7%BC%96%E5%86%99%E5%BC%82%E6%AD%A5%E7%A8%8B%E5%BA%8F.html) __Future类__ __Future对象的回调函数__ __Future计算和异常__ __Try类型__ __函数组合__ __Promise类__ __扩展Future API__ __阻塞操作__ [练习](http://7xoeea.com1.z0.glb.clouddn.com/%E4%BD%BF%E7%94%A8Future%E5%92%8CPromise%E5%AF%B9%E8%B1%A1%E5%86%99%E5%BC%82%E6%AD%A5%E7%A8%8B%E5%BA%8F%20%E7%BB%83%E4%B9%A0.html)
+ [数据并行集合](http://7xonn1.com1.z0.glb.clouddn.com/5%E6%95%B0%E6%8D%AE%E5%B9%B6%E8%A1%8C%E9%9B%86%E5%90%88.html) __并行操作__ __配置并行等级__ __度量性能__ __顺序集合和并行集合的差异__ __自定义并行集合__ __非可并行化集合__ __非可并行化操作__ __不确定的并行操作__ __可交换和可结合操作符__ __弱一致迭代器__
+ [使用Reactive Extensions编写并发程序](http://7xoeea.com1.z0.glb.clouddn.com/6%20%E4%BD%BF%E7%94%A8Reactive%20Extensions%E7%BC%96%E5%86%99%E5%B9%B6%E5%8F%91%E7%A8%8B%E5%BA%8F.html) __Observable对象__ __Observable对象和异常__ __Observable协定__ __自定义Observable对象__ __Subscrition特质__ __通过Future对象创建Observable对象__ __组合Observable对象__ __嵌套的Observable对象__ __retry组合子__  __Rx调度器__ __Subject特质__ __自顶向下的响应式编程__ [练习](http://7xoeea.com1.z0.glb.clouddn.com/6%20%E4%BD%BF%E7%94%A8Reactive%20Extensions%E7%BC%96%E5%86%99%E5%B9%B6%E5%8F%91%E7%A8%8B%E5%BA%8F%20%E7%BB%83%E4%B9%A0.html)
+ [基于软件的事务内存](http://7xoeea.com1.z0.glb.clouddn.com/7%20%E5%9F%BA%E4%BA%8E%E8%BD%AF%E4%BB%B6%E7%9A%84%E4%BA%8B%E5%8A%A1%E5%86%85%E5%AD%98.html) __原子变量的缺点__ __软件事务内存__ __事务引用__ __atomic语句__ __组合事务__ __事务与副作用__ __单操作事务__ __嵌套事务__ __事务和异常__ __重新尝试执行事务__ __通过超时设置重新尝试执行事务__ __事务集合__ __事务局部变量__ __事务数组__ __事务映射__ [练习](http://7xoeea.com1.z0.glb.clouddn.com/7%20%E8%BD%AF%E4%BB%B6%E7%9A%84%E4%BA%8B%E5%8A%A1%E5%86%85%E5%AD%98%20%E7%BB%83%E4%B9%A0.html)
+ [Actor](http://7xoeea.com1.z0.glb.clouddn.com/8%20Actor.html) __Actor模型__ __Akka框架__ __Actor系统__ __Actor类__ __Actor实例__ __消息__ __邮箱__ __Actor引用__ __分配器__ __生命周期__ __Actor监督__ __远程Actor对象__ [练习](http://7xoeea.com1.z0.glb.clouddn.com/8%20Actor%20%E7%BB%83%E4%B9%A0%28%E4%BF%AE%E6%AD%A32%29.html)
+ [实用并发技术](http://7xoeea.com1.z0.glb.clouddn.com/9%20%E5%AE%9E%E7%94%A8%E5%B9%B6%E5%8F%91%E6%8A%80%E6%9C%AF.html) __并发框架特点和用法__

## 八. Groovy语言程序设计

### [Groovy程序设计](https://www.amazon.cn/Groovy%E7%A8%8B%E5%BA%8F%E8%AE%BE%E8%AE%A1-%E7%BE%8E-Venkat-Subramaniam/dp/B00OUGT10A/ref=sr_1_1?ie=UTF8&qid=1475487877&sr=8-1&keywords=groovy)

#### Groovy起步

+ [面向Java开发者的Groovy](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC2%E7%AB%A0%20%E9%9D%A2%E5%90%91Java%E5%BC%80%E5%8F%91%E8%80%85%E7%9A%84Groovy.html) __安全导航操作符__ __异常处理__ __JavaBean__ __具名参数__ __可选形参__ __多赋值__ __实现接口__ __布尔求值__ __操作符重载__ __变长参数__ __注解__ __静态导入__ __陷阱__
+ [动态类型](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC3%E7%AB%A0%20%E5%8A%A8%E6%80%81%E7%B1%BB%E5%9E%8B.html) __动态类型__ __静态类型__  __可选类型__ __能力式设计__ __多方法__ __静态类型检查__ __静态编译__
+ [使用闭包](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC4%E7%AB%A0%20%E4%BD%BF%E7%94%A8%E9%97%AD%E5%8C%85.html) __闭包__ __环绕执行模式__ __协程__ __柯里化闭包__ __动态闭包__ __闭包委托__ __尾递归__ __记忆化__
+ [使用字符串](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC5%E7%AB%A0%20%E4%BD%BF%E7%94%A8%E5%AD%97%E7%AC%A6%E4%B8%B2) __字面常量__ __字符串表达式__ __正则表达式__ __惰性求值__ __变量值或引用__ __多行字符串__ __字符串快捷方法__
+ [使用集合类](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC6%E7%AB%A0%20%E4%BD%BF%E7%94%A8%E9%9B%86%E5%90%88%E7%B1%BB) __List__ __Map__

#### 使用Groovy

+ [探索GDK](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC7%E7%AB%A0%20%E6%8E%A2%E7%B4%A2GDK.html) __Object类的扩展__ __上下文的with方法__ __sleep方法__ __间接访问属性__ __间接调用方法__ __数组的扩展__ __java.lang的扩展__ __java.util扩展__
+ [使用脚本和类](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC7%E7%AB%A0%20%E6%8E%A2%E7%B4%A2GDK.html) __Java和Groovy的混合__ __运行Groovy代码__ __在Java中调用Groovy动态方法__ __在Groovy中使用Java类__ __从Groovy中使用Groovy脚本__ __从Java中使用Groovy脚本__
+ [处理XML](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC7%E7%AB%A0%20%E6%8E%A2%E7%B4%A2GDK.html) __解析XML__ __DOMCategory__ __XMLParser__ __XMLParser__ __创建XML__

#### MOP与元编程

+ [探索元对象协议](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC11%E7%AB%A0%20%E6%8E%A2%E7%B4%A2%E5%85%83%E5%AF%B9%E8%B1%A1%E5%8D%8F%E8%AE%AE.html) __元编程__ __Groovy对象__ __Groovy拦截器__ __查询方法与属性__ __动态访问对象__ 
+ [使用MOP拦截方法](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC12%E7%AB%A0%20%E4%BD%BF%E7%94%A8MOP%E6%8B%A6%E6%88%AA%E6%96%B9%E6%B3%95.html) __使用GroovyInterceptable拦截方法__ __使用MetaClass拦截方法__
+ [MOP方法注入](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC13%E7%AB%A0%20MOP%E6%96%B9%E6%B3%95%E6%B3%A8%E5%85%A5.html) __使用分类注入方法__ __使用ExpandoMetaClass注入方法__ __向具体的实例中注入方法__ __使用Mixin注入方法__ __在类中使用多个Mixin__
+ [MOP方法合成](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC14%E7%AB%A0%20MOP%E6%96%B9%E6%B3%95%E5%90%88%E6%88%90.html) __使用methodMissing合成方法__ __使用ExpandoMetaClass合成方法__ __为具体的实例合成方法__

#### 使用元编程

+ [Groovy生成器]()
+ [单元测试与模拟]()
+ [在Groovy中创建DSL]()

## 九. Spring框架

### [Spring Reference](https://spring.io/docs/reference)

### [Spring Guide](https://spring.io/guides)

### [Spring Project](https://spring.io/projects)

### [Spring入门经典](https://www.amazon.cn/Spring%E5%85%A5%E9%97%A8%E7%BB%8F%E5%85%B8-%E5%8D%A1%E5%88%A9%E6%96%AF%E5%9D%8E/dp/B016LTLAWA/ref=sr_1_1?ie=UTF8&qid=1481116584&sr=8-1&keywords=Spring%E5%85%A5%E9%97%A8%E7%BB%8F%E5%85%B8)

+ [使用Spring进行依赖注入](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC2%E7%AB%A0%20%E4%BD%BF%E7%94%A8Spring%E8%BF%9B%E8%A1%8C%E4%BE%9D%E8%B5%96%E6%B3%A8%E5%85%A5.html)
 __配置元数据__ __依赖解析__ __自动装配__ __显式Bean查找__ __Bean实例化__ __Bean作用域__ __延迟Bean创建__ __生命周期回调__ __Bean定义配置文件__
+ [使用Spring MVC构建Web应用程序]()

### [Spring实战(第4版)](https://www.amazon.cn/Spring%E5%AE%9E%E6%88%98-Craig-Walls-%E6%B2%83%E5%B0%94%E6%96%AF/dp/B01DN3VR6G/ref=sr_1_1?ie=UTF8&qid=1466427492&sr=8-1&keywords=spring)

#### 第一部分 Spring核心

+ [Spring之旅]()
+ [装配Bean](http://7xoeea.com1.z0.glb.clouddn.com/Spring%E5%AE%9E%E6%88%98%28%E8%A3%85%E9%85%8DBean%29.html) __声明bean__ __构造器注入__ __Setter方法注入__ __装配bean__ __控制bean的创建和销毁__
+ [高级装配]()

#### 第二部分 Web中的Spring

+ [构建SpringWeb应用程序](http://7xoeea.com1.z0.glb.clouddn.com/Spring%E5%AE%9E%E6%88%98%28%E6%9E%84%E5%BB%BASpringWeb%E5%BA%94%E7%94%A8%E7%A8%8B%E5%BA%8F%29.html) __映射请求到Spring控制器__ __透明地绑定表单参数__ __校验表单提交__

## [精通Spring企业级开发](https://www.evernote.com/shard/s501/nl/176057404/ccaa31d9-739c-43c8-a6bd-0360184abb00/)

## 十. 领域专用语言

### [领域专用语言实战](https://www.amazon.cn/%E9%A2%86%E5%9F%9F%E4%B8%93%E7%94%A8%E8%AF%AD%E8%A8%80%E5%AE%9E%E6%88%98-%E6%88%88%E6%96%BD/dp/B00FTWLPH6/ref=sr_1_1?ie=UTF8&qid=1481374316&sr=8-1&keywords=%E9%A2%86%E5%9F%9F%E4%B8%93%E7%94%A8%E8%AF%AD%E8%A8%80)

#### 领域专用语言入门

+ [初始DSL]()

## 十一. Linux命令行和Shell语言程序设计

### [Shell脚本学习指南](http://www.amazon.cn/Shell%E8%84%9A%E6%9C%AC%E5%AD%A6%E4%B9%A0%E6%8C%87%E5%8D%97-Arnold-Robbins/dp/B002A2LQR2/ref=sr_1_2?ie=UTF8&qid=1457183735&sr=8-2&keywords=Shell)

### [sed & awk](http://www.amazon.cn/sed-awk-Dale-Dougherty/dp/1565922255/ref=sr_1_6?ie=UTF8&qid=1457183831&sr=8-6&keywords=awk)

### [Linux命令行与shell脚本编程大全(第2版)](https://www.amazon.cn/Linux%E5%91%BD%E4%BB%A4%E8%A1%8C%E4%B8%8Eshell%E8%84%9A%E6%9C%AC%E7%BC%96%E7%A8%8B%E5%A4%A7%E5%85%A8-Richard-Blum/dp/B0096EXMS8/ref=sr_1_1?ie=UTF8&qid=1461073171&sr=8-1&keywords=shell)

### [Linux Shell脚本攻略](https://www.amazon.cn/Linux-Shell%E8%84%9A%E6%9C%AC%E6%94%BB%E7%95%A5-%E5%8D%B0-Sarath-Lakshman/dp/B00HD4RDS8/ref=sr_1_7?ie=UTF8&qid=1461073171&sr=8-7&keywords=shell)

## 十二.Haskell程序设计语言

[Haskell Documentation](https://www.haskell.org/documentation)

[Hoogλg(Haskell API Search Engine)](https://www.haskell.org/hoogle/?hoogle=)

### [新锐编程语言集萃:Haskell趣学指南](https://www.amazon.cn/%E6%96%B0%E9%94%90%E7%BC%96%E7%A8%8B%E8%AF%AD%E8%A8%80%E9%9B%86%E8%90%83-Haskell%E8%B6%A3%E5%AD%A6%E6%8C%87%E5%8D%97-%E5%88%A9%E6%B3%A2%E7%93%A6%E5%8D%A1/dp/B00HLA8UHC/ref=pd_sim_14_1?ie=UTF8&dpID=51LqhmU172L&dpSrc=sims&preST=_AC_UL160_SR130%2C160_&refRID=H87JA8BHJ78GCRE357M3)

+ [预备](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC1%E7%AB%A0%20%E5%90%84%E5%B0%B1%E5%90%84%E4%BD%8D%20%E9%A2%84%E5%A4%87.html) __函数__ __列表__ __元组__
+ [类型](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC2%E7%AB%A0%20%E7%9B%B8%E4%BF%A1%E7%B1%BB%E5%9E%8B.html) __显式类型声明__ __类型变量__ __类型类__
+ [函数语法](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC3%E7%AB%A0%20%E5%87%BD%E6%95%B0%E7%9A%84%E8%AF%AD%E6%B3%95.html) __模式匹配__ __哨卫__ __where__ __let__ __case表达式__
+ [递归](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC4%E7%AB%A0%20%E9%80%92%E5%BD%92.html) __递归__
+ [高阶函数](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC5%E7%AB%A0%20%E9%AB%98%E9%98%B6%E5%87%BD%E6%95%B0.html) __高阶函数__ __柯里函数__ __部分应用函数__ __截断__ __lambda__ __折叠__ __扫描__ __函数组合__ __Point-Free风格__
+ [模块](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC6%E7%AB%A0%20%E6%A8%A1%E5%9D%97.html) __模块__ __导入__ __限定导入__ __自定义模块__ __子模块__
+ [自定义类型和类型类](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC7%E7%AB%A0%20%E8%87%AA%E5%AE%9A%E4%B9%89%E7%B1%BB%E5%9E%8B%E5%92%8C%E7%B1%BB%E5%9E%8B%E7%B1%BB.html) __自定义类型__ __记录语法__ __类型参数__ __派生实例__ __类型别名__ __参数化类型别名__ __Either__ __递归数据结构__ __类型类__ __Functor类型类__ __树__ __函子__ __kind与无名类型__
+ [输入与输出](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC8%E7%AB%A0%20%E8%BE%93%E5%85%A5%E4%B8%8E%E8%BE%93%E5%87%BA.html) __纯粹与非纯粹的分离__ __组合IO操作__ __return__ __实用IO函数__
+ [applicative函子](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC11%E7%AB%A0%20applicative%E5%87%BD%E5%AD%90.html) __applicative函子__ __函子定律__ __IO函子__ __函数函子__ __MaybeApplicative函子__ __IOApplicative函子__ __列表Applicative函子__ __函数Applicative函子__
+ [Monoid](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC12%E7%AB%A0%20Monoid.html) __newtype__ __Monoid类型类__ __monoid定律__ 

## 十三. Clojure语言程序设计

### [Clojure编程乐趣](https://www.amazon.cn/Clojure%E7%BC%96%E7%A8%8B%E4%B9%90%E8%B6%A3-%E7%A6%8F%E6%A0%BC%E6%96%AF/dp/B00G6T9BB8/ref=sr_1_5?ie=UTF8&qid=1461511889&sr=8-5&keywords=clojure)

## 十四. 软件工程

### [重构 改善既有代码设计](http://www.amazon.cn/%E9%87%8D%E6%9E%84-%E6%94%B9%E5%96%84%E6%97%A2%E6%9C%89%E4%BB%A3%E7%A0%81%E7%9A%84%E8%AE%BE%E8%AE%A1-%E9%A9%AC%E4%B8%81%C2%B7%E7%A6%8F%E5%8B%92/dp/B011LPUB42/ref=sr_1_1?ie=UTF8&qid=1449756794&sr=8-1&keywords=%E9%87%8D%E6%9E%84+%E6%94%B9%E5%96%84%E6%97%A2%E6%9C%89%E4%BB%A3%E7%A0%81%E8%AE%BE%E8%AE%A1)

__重构(Refactoring)指对软件代码做任何更动以增加可读性或者简化结构而不影响输出结果__

+ [重构实例 重构原则 坏味道 测试 重构列表](http://7xoeea.com1.z0.glb.clouddn.com/%E9%87%8D%E6%9E%8412345.html)
+ [重新组织函数](http://7xoeea.com1.z0.glb.clouddn.com/%E9%87%8D%E6%9E%8461.html) __尽量提炼出短函数 避免引入过多临时变量 临时变量职责应单一化__
+ [在对象间搬移特性](http://7xoeea.com1.z0.glb.clouddn.com/%E9%87%8D%E6%9E%847.html) __尽量提炼出单一职责的类 类间关系不应该耦合过分 应该对客户端隔离变化仅展示不变的部分__
+ [重新组织数据](http://7xoeea.com1.z0.glb.clouddn.com/%E9%87%8D%E6%9E%848.html) __对数据进行重构__
+ [简化函数调用](http://7xoeea.com1.z0.glb.clouddn.com/%E9%87%8D%E6%9E%8410.html) __容易被理解和被使用的接口 是开发良好面向对象软件的关键__
+ [简化条件表达式](http://7xoeea.com1.z0.glb.clouddn.com/%E9%87%8D%E6%9E%849.html) __分解条件表达式重构很重要 因为其使得分支逻辑和操作细节分离__
+ [处理继承关系](http://7xoeea.com1.z0.glb.clouddn.com/%E9%87%8D%E6%9E%8411.html) __尽量将子类特性上移至超类 大部分场景委托优于继承__

### [重构与模式](http://www.amazon.cn/%E9%87%8D%E6%9E%84%E4%B8%8E%E6%A8%A1%E5%BC%8F-Joshua-Kerievsky/dp/B00A9YD7A2/ref=sr_1_1?ie=UTF8&qid=1456414401&sr=8-1&keywords=%E9%87%8D%E6%9E%84%E4%B8%8E%E6%A8%A1%E5%BC%8F)

+ [创建](http://7xoeea.com1.z0.glb.clouddn.com/%E5%88%9B%E5%BB%BA.html) __用Creation Method替代构造器__ __将创建知识搬移到Factory__ __用Factory封装类__ __用Factory Method引入多态创建__ __用Builder封装Composite__ __内联Singleton__
+ [简化]() __组合方法__ __用策略替代条件逻辑__ __将装饰功能搬移至Decorator__ __用State替换状态改变条件语句__ __用Composite替换隐含树__ __用Command替换条件调度程序__
+ [保护](http://7xoeea.com1.z0.glb.clouddn.com/%E4%BF%9D%E6%8A%A4.html) __用类替换类型代码__ __用Singleton限制实例化__  __引入Null Object__
+ [实用重构](http://7xoeea.com1.z0.glb.clouddn.com/%E5%AE%9E%E7%94%A8%E9%87%8D%E6%9E%84.html) __链构造函数__ __统一接口__ __提取参数__

### [敏捷软件开发(原则模式与实践)](http://www.amazon.cn/%E6%95%8F%E6%8D%B7%E8%BD%AF%E4%BB%B6%E5%BC%80%E5%8F%91-%E9%A9%AC%E4%B8%81/dp/B00116MMA8/ref=sr_1_1?ie=UTF8&qid=1451893899&sr=8-1&keywords=%E6%95%8F%E6%8D%B7%E5%BC%80%E5%8F%91)

#### 1.面向对象设计原则
##### 类设计原则
+ [单一职责原则(SRP)](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC8%E7%AB%A0%20%E5%8D%95%E4%B8%80%E8%81%8C%E8%B4%A3%E5%8E%9F%E5%88%99%28SRP%29.html) __就一个类而言,应该仅有一个引起它变化的原因__
+ [开放-封闭原则(OCP)](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC9%E7%AB%A0%20%E5%BC%80%E6%94%BE-%E5%B0%81%E9%97%AD%E5%8E%9F%E5%88%99%28OCP%29.html) __软件实体应该(类,模块,函数等)应该是可扩展的,但是不可修改__
+ [Liskov替换原则(LSP)](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC10%E7%AB%A0%20Liskov%E6%9B%BF%E6%8D%A2%E5%8E%9F%E5%88%99%28LSP%29.html) __子类型(SubType)必须能够替换掉它们的基类型(BaseType)__
+ [依赖倒置原则(DIP)](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC11%E7%AB%A0%20%E4%BE%9D%E8%B5%96%E5%80%92%E7%BD%AE%E5%8E%9F%E5%88%99%28DIP%29.html) __高层模块不应该依赖于底层模块,二者都应该依赖于抽象.抽象不应该依赖于细节,细节应该依赖于抽象__
+ [接口隔离原则(ISP)](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC12%E7%AB%A0%20%E6%8E%A5%E5%8F%A3%E9%9A%94%E7%A6%BB%E5%8E%9F%E5%88%99%28ISP%29.html) __不应该强迫客户依赖于它们不用的方法__
##### 包设计原则
+ [重用发布等价原则(REP)](https://www.evernote.com/shard/s501/sh/c4cfa5cf-8561-4c67-9b64-917faf1fe5d8/f4bb2dda9c04d24b355d750b98f91daa) __重用的粒度就是发布的粒度__
+ [共同封闭原则(CCP)](https://www.evernote.com/shard/s501/sh/c4cfa5cf-8561-4c67-9b64-917faf1fe5d8/f4bb2dda9c04d24b355d750b98f91daa) __包中的所有类对于同一个类性质的变化应该是共同封闭的.一个变化若对一个包产生影响,则将对该包中的所有类产生影响,而对其他的包不造成影响__
+ [共同重用原则(CRP)](https://www.evernote.com/shard/s501/sh/c4cfa5cf-8561-4c67-9b64-917faf1fe5d8/f4bb2dda9c04d24b355d750b98f91daa) __一个包中的所有类应该是共同重用的.如果重用了包中的一个类,那么就要重用包中的所有类__
+ [无环依赖原则(ADP)](https://www.evernote.com/shard/s501/sh/c4cfa5cf-8561-4c67-9b64-917faf1fe5d8/f4bb2dda9c04d24b355d750b98f91daa) __在包的依赖关系图中不允许存在环__
+ [稳定依赖原则(SDP)](https://www.evernote.com/shard/s501/sh/c4cfa5cf-8561-4c67-9b64-917faf1fe5d8/f4bb2dda9c04d24b355d750b98f91daa) __朝着稳定的方法进行依赖__
+ [稳定抽象原则(SAP)](https://www.evernote.com/shard/s501/sh/c4cfa5cf-8561-4c67-9b64-917faf1fe5d8/f4bb2dda9c04d24b355d750b98f91daa) __包的抽象程度应该和其稳定程度一致__

#### 2.面向对象设计模式

+ [命令模式和主动对象模式](https://www.evernote.com/shard/s501/nl/176057404/2e5e3f34-52f5-4384-aa25-87422158d0a4/) __解耦任务与执行策略__
+ [模版方法模式和策略模式 分离通用算法与具体上下文](https://www.evernote.com/shard/s501/nl/176057404/806ee18b-e54a-44d1-81a4-08d8a1882724/) __继承与委托__
+ [门面模式和中介者模式](https://www.evernote.com/shard/s501/nl/176057404/13c55c28-0193-4cdc-bcd6-92cc28432f5d/) __对对象组施加策略__
+ [单例模式和单态模式](https://www.evernote.com/shard/s501/nl/176057404/fc0c9d1f-482c-400a-8ed6-029d3507685a/) __单一对象__
+ 空对象模式 __Java 8的Option类型可以替代该模式__
+ [工厂模式](https://www.evernote.com/shard/s501/sh/61229ad0-d007-4fca-a128-6d53d1e6a619/bfad3e707cd594ec6ef581599beda3a8) __抽象创建类实例__
+ [抽象服务模块 适配器模式和桥接模式](https://www.evernote.com/shard/s501/nl/176057404/29c6f13e-07a9-463c-ba3f-00fb98477ce0/)
+ [组合模式](https://www.evernote.com/shard/s501/nl/176057404/0180afb2-3b94-4cfb-a521-fd3b1191160e/) __实现将一对多关系转换为一对一的关系__

### [程序员修炼之道:从小工到专家](http://www.amazon.cn/%E7%A8%8B%E5%BA%8F%E5%91%98%E4%BF%AE%E7%82%BC%E4%B9%8B%E9%81%93-%E4%BB%8E%E5%B0%8F%E5%B7%A5%E5%88%B0%E4%B8%93%E5%AE%B6-%E4%BA%A8%E7%89%B9/dp/B004GV08CY/ref=sr_1_1?ie=UTF8&qid=1455946791&sr=8-1&keywords=%E4%BB%8E%E5%B0%8F%E5%B7%A5%E5%88%B0%E4%B8%93%E5%AE%B6)

### [实现模式](https://www.amazon.cn/%E5%AE%9E%E7%8E%B0%E6%A8%A1%E5%BC%8F-Kent-Beck/dp/B00ADQPPLA/ref=sr_1_1?ie=UTF8&qid=1473253965&sr=8-1&keywords=%E5%AE%9E%E7%8E%B0%E6%A8%A1%E5%BC%8F)

+ [类](http://7xoeea.com1.z0.glb.clouddn.com/%E7%B1%BB.html) __类__ __简单的超类名__ __限定性的子类名__ __抽象接口__ __interface__ __抽象类__ __有版本的interface__ __值对象__ __特化__ __子类__ __实现器__ __内部类__ __条件语句__ __委派__ __可插拔选择器__ __匿名内部类__ __库类__
+ [行为](http://7xoeea.com1.z0.glb.clouddn.com/%E8%A1%8C%E4%B8%BA.html) __控制流__ __主体流__ __消息__ __选择性消息__ __双重分发__ __分解性消息__ __反置性消息__ __邀请性消息__ __解释性消息__ __异常流__ __卫述句__ __异常__ __已检查异常__ __异常传播__

### [Object-Oriented Analysis And Design With Applications(Third Edition)](http://www.amazon.cn/Object-oriented-Analysis-and-Design-With-Applications-Booch-Grady/dp/1500995193/ref=sr_1_2?ie=UTF8&qid=1453102147&sr=8-2&keywords=Object-Oriented+Analysis+And+Design+With+Applications)

### [Head First设计模式(中文版)](https://www.amazon.cn/Head-First%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F-%E5%BC%97%E9%87%8C%E6%9B%BC/dp/B0011FBU34/ref=sr_1_1?ie=UTF8&qid=1481421331&sr=8-1&keywords=Head+First)

__设计模式(design pattern)是对软件设计中普遍存在(反复出现)的各种问题,所提出的解决方案__

#### 1.[创建型模式](https://zh.wikipedia.org/wiki/%E5%89%B5%E5%BB%BA%E5%9E%8B%E6%A8%A1%E5%BC%8F) __创建型模式涉及到将对象实例化 这类模式都提供一个方法 将客户端从所需要实例化的对象中解耦__

+ [单件模式](http://7xonn1.com1.z0.glb.clouddn.com/5%20%E5%8D%95%E4%BB%B6%E6%A8%A1%E5%BC%8F%E4%BF%AE%E6%94%B9.html) __确保一个类只有一个实例,并提供对该实例的全局访问__
+ [工厂方法模式]() __定义一个接口用于创建对象,但是让子类决定初始化哪个类.工厂方法把一个类的初始化下放到子类__
+ [抽象工厂模式]() __为一个产品族提供了统一的创建接口.当需要这个产品族的某一系列的时候,可以从抽象工厂中选出相应的系列创建一个具体的工厂类__
+ [生成器模式](http://7xoeea.com1.z0.glb.clouddn.com/%E5%88%9B%E5%BB%BA%E5%92%8C%E9%94%80%E6%AF%81%E5%AF%B9%E8%B1%A1.html) __将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示__

#### 2.[行为型模式](https://zh.wikipedia.org/wiki/%E8%A1%8C%E7%82%BA%E5%9E%8B%E6%A8%A1%E5%BC%8F) __只要是行为模式就涉及到类和对象如何交互和分配职责__

+ [状态模式](http://7xonn1.com1.z0.glb.clouddn.com/10%20%E7%8A%B6%E6%80%81%E6%A8%A1%E5%BC%8F.html) __让一个对象在其内部状态改变的时候,其行为也随之改变.状态模式需要对每一个系统可能获取的状态创立一个状态类的子类.当系统的状态变化时,系统便改变所选的子类__
+ [策略模式](http://7xoeea.com1.z0.glb.clouddn.com/1%20%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F%E5%85%A5%E9%97%A8.html) __定义一个算法的系列，将其各个分装，并且使他们有交互性。策略模式使得算法在用户使用的时候能独立的改变__
+ [观察者模式](http://7xoeea.com1.z0.glb.clouddn.com/2%20%E8%A7%82%E5%AF%9F%E8%80%85%E6%A8%A1%E5%BC%8F.html) __在对象间定义一个一对多的联系性，由此当一个对象改变了状态，所有其他相关的对象会被通知并且自动刷新__
+ [迭代器模式](http://7xoeea.com1.z0.glb.clouddn.com/9%20%E8%BF%AD%E4%BB%A3%E5%99%A8%E4%B8%8E%E7%BB%84%E5%90%88%E6%A8%A1%E5%BC%8F.html) __提供一种方法顺序访问一个聚合对象中各个元素, 而又不需暴露该对象的内部表示__
+ [命令模式](http://7xoeea.com1.z0.glb.clouddn.com/6%20%E5%91%BD%E4%BB%A4%E6%A8%A1%E5%BC%8F.html) __将一个请求封装为一个对象,从而使你可用不同的请求对客户进行参数化 对请求排队或记录请求日志,以及支持可取消的操作__
+ [模板方法模式](http://7xoeea.com1.z0.glb.clouddn.com/8%20%E6%A8%A1%E6%9D%BF%E6%96%B9%E6%B3%95%E6%A8%A1%E5%BC%8F.html) __模板方法模式准备一个抽象类,将部分逻辑以具体方法及具体构造子类的形式实现,然后声明一些抽象方法来迫使子类实现剩余的逻辑. 不同的子类可以以不同的方式实现这些抽象方法,从而对剩余的逻辑有不同的实现.先构建一个顶级逻辑框架,而将逻辑的细节留给具体的子类去实现__
+ 空对象 __通过提供默认对象来避免空引用__
+ [责任链模式](http://7xoeea.com1.z0.glb.clouddn.com/%E8%B4%A3%E4%BB%BB%E9%93%BE%E6%A8%A1%E5%BC%8F.html) __为解除请求的发送者和接收者之间耦合 而使多个对象都有机会处理这个请求 将这些对象连成一条链 并沿着这条链传递该请求 直到有一个对象处理它__
+ [中介者模式](http://7xoeea.com1.z0.glb.clouddn.com/%E4%B8%AD%E4%BB%8B%E8%80%85%E6%A8%A1%E5%BC%8F.html) __包装了一系列对象相互作用的方式 使得这些对象不必相互明显作用 从而使它们可以松散偶合.当某些对象之间的作用发生改变时 不会立即影响其他的一些对象之间的作用 保证这些作用可以彼此独立的变化__
+ [备忘录模式](http://7xonn1.com1.z0.glb.clouddn.com/%E5%A4%87%E5%BF%98%E5%BD%95%E6%A8%A1%E5%BC%8F.html) __备忘录对象是一个用来存储另外一个对象内部状态的快照的对象 备忘录模式的用意是在不破坏封装的条件下 将一个对象的状态捉住 并外部化 存储起来 从而可以在将来合适的时候把这个对象还原到存储起来的状态__
+ [访问者模式]() __封装一些施加于某种数据结构元素之上的操作 一旦这些操作需要修改 接受这个操作的数据结构可以保持不变 访问者模式适用于数据结构相对未定的系统 它把数据结构和作用于结构上的操作之间的耦合解脱开 使得操作集合可以相对自由的演化__

#### 3.[结构型模式](https://zh.wikipedia.org/wiki/%E7%B5%90%E6%A7%8B%E5%9E%8B%E6%A8%A1%E5%BC%8F) __结构型模式可以把类或对象组合到更大的结构中__

+ [组合模式](http://7xoeea.com1.z0.glb.clouddn.com/9%20%E8%BF%AD%E4%BB%A3%E5%99%A8%E4%B8%8E%E7%BB%84%E5%90%88%E6%A8%A1%E5%BC%8F.html) __把多个对象组成树状结构来表示局部与整体，这样用户可以一样的对待单个对象和对象的组合__
+ [适配器模式]() __将某个类的接口转换成客户端期望的另一个接口表示.适配器模式可以消除由于接口不匹配所造成的类兼容性问题__
+ [外观模式]() __为子系统中的一组接口提供一个一致的界面 外观模式定义了一个高层接口，这个接口使得这一子系统更加容易使用__
+ [代理模式]() __为其他对象提供一个代理以控制对这个对象的访问__
+ [装饰者模式]() __向某个对象动态地添加更多的功能 修饰模式是除类继承外另一种扩展功能的方法__
+ [桥接模式]() __将一个抽象与实现解耦 以便两者可以独立的变化__
+ [蝇量模式](http://7xoeea.com1.z0.glb.clouddn.com/%E8%9D%87%E9%87%8F%E6%A8%A1%E5%BC%8F.html) __又称享元模式 通过共享以便有效的支持大量小颗粒对象__


### [代码大全(第2版)](http://www.amazon.cn/%E4%BB%A3%E7%A0%81%E5%A4%A7%E5%85%A8-%E5%8F%B2%E8%92%82%E5%A4%AB%E2%80%A2%E8%BF%88%E5%85%8B%E5%BA%B7%E5%A5%88%E5%B0%94/dp/B0061XKRXA/ref=sr_1_1?ie=UTF8&qid=1453880816&sr=8-1&keywords=%E4%BB%A3%E7%A0%81%E5%A4%A7%E5%85%A8)

### [Gradle实战](http://www.amazon.cn/%E5%AE%9E%E6%88%98Gradle-%E6%9C%AC%E6%9D%B0%E6%98%8E%C2%B7%E9%A9%AC%E6%96%AF%E5%8F%AF/dp/B014PX21SG/ref=sr_1_1?ie=UTF8&qid=1452781265&sr=8-1&keywords=Gradle%E5%AE%9E%E6%88%98)

## 十五. Spark框架

### [An Architecture for Fast and General Data Processing on Large Clusters(中文版)](http://www.chinacloud.cn/upload/2015-01/15012705072318.pdf)

### [Spark Latest Document](http://spark.apache.org/docs/latest/)

### [Spark Scala API](http://spark.apache.org/docs/latest/api/scala/index.html#org.apache.spark.package)

### [Spark Programming Guide](http://spark.apache.org/docs/latest/programming-guide.html)

### [Spark Streaming Programming Guide](http://spark.apache.org/docs/latest/streaming-programming-guide.html)

### [Spark SQL, DataFrames and Datasets Guide](http://spark.apache.org/docs/latest/sql-programming-guide.html)

### [Learning Spark](http://www.amazon.cn/Learning-Spark-Lightning-Fast-Big-Data-Analysis-Karau-Holden/dp/1449358624/ref=sr_1_13?ie=UTF8&qid=1451892979&sr=8-13&keywords=spark)

### [Spark Hign Performance](https://www.amazon.cn/%E5%9B%BE%E4%B9%A6/dp/1491943203/ref=sr_1_1?ie=UTF8&qid=1503822473&sr=8-1&keywords=spark+high+performance)

+ [Spark工作原理](http://7xonn1.com1.z0.glb.clouddn.com/Spark%E5%B7%A5%E4%BD%9C%E5%8E%9F%E7%90%86.html)

## 十六. Netty框架

### [Netty Project Office Website](http://netty.io/index.html)

### [Netty API Document](http://netty.io/5.0/api/index.html)

### [Netty权威指南](http://www.amazon.cn/Netty%E6%9D%83%E5%A8%81%E6%8C%87%E5%8D%97-%E6%9D%8E%E6%9E%97%E9%94%8B/dp/B00WFSXDRM/ref=sr_1_1?ie=UTF8&qid=1452781245&sr=8-1&keywords=Netty%E6%9D%83%E5%A8%81%E6%8C%87%E5%8D%97)

+ [NIO入门](https://github.com/dongjiaqiang/my_reading_notes/blob/master/netty_guide/nio_introduction.md)

### [Netty in Action](http://www.amazon.com/Netty-Action-Norman-Maurer/dp/1617291471/ref=sr_1_1?ie=UTF8&qid=1455435844&sr=8-1&keywords=netty+in+action)

## 十七. Akka框架

### [Akka in Action](http://www.amazon.cn/Akka-in-Action-Roestenburg-Raymond/dp/1617291013/ref=sr_1_6?ie=UTF8&qid=1453968934&sr=8-6&keywords=Akka)

### [Akka Scala Documentation](http://doc.akka.io/docs/akka/2.4.2/AkkaScala.pdf?_ga=1.124319052.735885341.1458093107)

#### 2.概述

+ [Actor系统(Actor System)]()

#### 3.Actors

+ [参与者(Actor)](http://7xoeea.com1.z0.glb.clouddn.com/3.1%20Actors%28%E5%8F%82%E4%B8%8E%E8%80%85%29.html)
+ [容错(Fault Tolerance)](http://7xoeea.com1.z0.glb.clouddn.com/3.3%20Fault%20Tolerance%28%E5%AE%B9%E9%94%99%29.html)
+ [派发器(Dispatchers)](http://7xoeea.com1.z0.glb.clouddn.com/3.4%20Dispatchers%28%E6%B4%BE%E5%8F%91%E5%99%A8%29.html)
+ [邮箱(Mailboxes)](http://7xoeea.com1.z0.glb.clouddn.com/3.5%20%E9%82%AE%E7%AE%B1.html)
+ [路由(Routing)](http://7xoeea.com1.z0.glb.clouddn.com/3.6%20Rounting%28%E8%B7%AF%E7%94%B1%29.html)
+ [有限状态机(FSM)](http://7xoeea.com1.z0.glb.clouddn.com/3.7%20FSM%28%E6%9C%89%E9%99%90%E7%8A%B6%E6%80%81%E6%9C%BA%29.html)

#### 4.Futures和Agents

+ [Futures]()
+ [Agents](http://7xoeea.com1.z0.glb.clouddn.com/4.2%20Agents.html)

#### 6.实用工具

+ [事件总线(Event Bus)](http://7xoeea.com1.z0.glb.clouddn.com/6.1%20%E4%BA%8B%E4%BB%B6%E6%80%BB%E7%BA%BF.html)
+ [日志(Logging)](http://7xoeea.com1.z0.glb.clouddn.com/6.2%20%E6%97%A5%E5%BF%97.html)
+ [调度器(Scheduler)](http://7xoeea.com1.z0.glb.clouddn.com/6.3%20%20%E8%B0%83%E5%BA%A6%E5%99%A8.html)
+ [持续时间(Duration)]()

### [响应式架构 消息模式Actor实现与Scala,Akka应用集成](https://www.amazon.cn/%E5%93%8D%E5%BA%94%E5%BC%8F%E6%9E%B6%E6%9E%84-%E6%B6%88%E6%81%AF%E6%A8%A1%E5%BC%8FActor%E5%AE%9E%E7%8E%B0%E4%B8%8EScala-Akka%E5%BA%94%E7%94%A8%E9%9B%86%E6%88%90-%E6%B2%83%E6%81%A9%C2%B7%E5%BC%97%E5%86%9C/dp/B01HIPQT54/ref=sr_1_11?ie=UTF8&qid=1474982537&sr=8-11&keywords=scala)

+ [Actor模型和企业级软件概述](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC1%E7%AB%A0%20Actor%E6%A8%A1%E5%9E%8B%E5%92%8C%E4%BC%81%E4%B8%9A%E7%BA%A7%E8%BD%AF%E4%BB%B6%E6%A6%82%E8%BF%B0.html) __Actor模型__ __响应性__ __韧性__ __灵活性__ __消息驱动__ __Akka框架__ __对象性能模型__
+ [通过Actor对象传递消息](http://7xoeea.com1.z0.glb.clouddn.com/%E7%AC%AC4%E7%AB%A0%20%E9%80%9A%E8%BF%87Actor%E5%AF%B9%E8%B1%A1%E4%BC%A0%E9%80%92%E6%B6%88%E6%81%AF.html)
 __消息通道__ __消息__ __管道和过滤器__ __消息路由器__ __消息端点__

### [Akka Project Office Website](http://akka.io/docs/?_ga=1.124319052.735885341.1458093107)

### [Akka Java Documentation](http://doc.akka.io/docs/akka/2.4.2/AkkaJava.pdf?_ga=1.90689884.735885341.1458093107)

### [Akka Scala API Document](http://doc.akka.io/api/akka/2.4.2/?_ga=1.168867175.735885341.1458093107#package)

### [Akka Java API Document](http://doc.akka.io/japi/akka/2.3.14/?_ga=1.90689884.735885341.1458093107)

## 十八. Flume框架

### [Apache Flume Office Website](http://flume.apache.org/index.html)

### [Apache Flume API Documents](http://flume.apache.org/releases/content/1.6.0/apidocs/)

### [基于Flume的美团日志收集系统架构和设计](http://tech.meituan.com/mt-log-system-optimization.html)

### [Flume 1.6.0 User Guide](http://flume.apache.org/FlumeUserGuide.html)

### [Flume 1.6.0 Developer Guide](http://flume.apache.org/FlumeDeveloperGuide.html)

### [cloudera/flume](https://github.com/cloudera/flume)

### [javachen/mt-flume](https://github.com/javachen/mt-flume)

### [Apache Flume 源码分析]()

### [Flume:构建高可用、可扩展的海量日志采集系统](http://www.amazon.cn/Flume-%E6%9E%84%E5%BB%BA%E9%AB%98%E5%8F%AF%E7%94%A8-%E5%8F%AF%E6%89%A9%E5%B1%95%E7%9A%84%E6%B5%B7%E9%87%8F%E6%97%A5%E5%BF%97%E9%87%87%E9%9B%86%E7%B3%BB%E7%BB%9F-%E5%93%88%E9%87%8C%C2%B7%E5%8F%B2%E7%91%9E%E5%BE%B7%E5%93%88%E4%BC%A6/dp/B012DRHR6W/ref=sr_1_1?ie=UTF8&qid=1457868734&sr=8-1&keywords=flume)

## 十九. Zookeeper框架

### [Zookeeper:分布式过程协同技术详解](https://www.amazon.cn/ZooKeeper-%E5%88%86%E5%B8%83%E5%BC%8F%E8%BF%87%E7%A8%8B%E5%8D%8F%E5%90%8C%E6%8A%80%E6%9C%AF%E8%AF%A6%E8%A7%A3-Flavio-Junqueira/dp/B01C8INQYS/ref=sr_1_1?s=books&ie=UTF8&qid=1481462424&sr=1-1&keywords=%E5%88%86%E5%B8%83%E5%BC%8F%E8%BF%87%E7%A8%8B%E5%8D%8F%E5%90%8C%E6%8A%80%E6%9C%AF%E8%AF%A6%E8%A7%A3)

+ [简介和了解zk](http://7xoeea.com1.z0.glb.clouddn.com/Zookeeper%28%E5%88%86%E5%B8%83%E5%BC%8F%E8%BF%87%E7%A8%8B%E5%8D%8F%E5%90%8C%E6%8A%80%E6%9C%AF%29%20%E7%AE%80%E4%BB%8B%E5%92%8C%E4%BA%86%E8%A7%A3Zk.html)
+ [Zookeeper的API](http://7xoeea.com1.z0.glb.clouddn.com/Zookeeper%E7%9A%84API.html)
+ [处理状态变化](http://7xoeea.com1.z0.glb.clouddn.com/%E5%A4%84%E7%90%86%E7%8A%B6%E6%80%81%E5%8F%98%E5%8C%96.html)

## 二十. Redis

### [Redis实战](https://www.amazon.cn/Redis%E5%AE%9E%E6%88%98-%E7%BA%A6%E8%A5%BF%E4%BA%9A-L-%E5%8D%A1%E5%B0%94%E6%A3%AE/dp/B016YLS2LM/ref=sr_1_1?ie=UTF8&qid=1468035205&sr=8-1&keywords=redis)

#### 1. 入门

+ [Redis实战(使用Redis构建Web应用)](http://7xoeea.com1.z0.glb.clouddn.com/Redis%E5%AE%9E%E6%88%98%28%E4%BD%BF%E7%94%A8Redis%E6%9E%84%E5%BB%BAWeb%E5%BA%94%E7%94%A8%29.html) __登陆cookie__ __购物车cookie__ __缓存生成的网页__ __缓存数据库行__ __分析网页访问记录__

#### 2. 核心概念
+ [Redis实战(Redis命令)](http://7xoeea.com1.z0.glb.clouddn.com/Redis%E5%AE%9E%E6%88%98%28Redis%E5%91%BD%E4%BB%A4%29.html) __字符串命令__ __列表命令__ __集合命令__ __散列命令__ __有序集合命令__ __发布命令__ __订阅命令__ __其他命令__ 
+ [Redis实战(基于搜索的应用程序)]() __使用Redis进行搜索__ __对搜索结果进行排序__ __实现广告定向__ __实现职业搜索__

## 二十一. 算法

### [算法设计与分析基础(第3版)](https://www.amazon.cn/dp/B00S4HCQUI/ref=sr_1_2?ie=UTF8&qid=1485853125&sr=8-2&keywords=%E7%AE%97%E6%B3%95%E8%AE%BE%E8%AE%A1) 

### [算法导论](http://www.amazon.cn/%E7%AE%97%E6%B3%95%E5%AF%BC%E8%AE%BA-Thomas-H-Cormen/dp/B00AK7BYJY/ref=sr_1_1?ie=UTF8&qid=1454814064&sr=8-1&keywords=%E7%AE%97%E6%B3%95%E5%AF%BC%E8%AE%BA)

#### 高级数据结构

##### [B树]()

### [数据结构与算法分析:Java语言描述(第2版)](http://www.amazon.cn/%E6%95%B0%E6%8D%AE%E7%BB%93%E6%9E%84%E4%B8%8E%E7%AE%97%E6%B3%95%E5%88%86%E6%9E%90-Java%E8%AF%AD%E8%A8%80%E6%8F%8F%E8%BF%B0-%E9%9F%A6%E6%96%AF/dp/B001N6R9JK/ref=sr_1_2?ie=UTF8&qid=1456149814&sr=8-2&keywords=Data+structures+in+Java)

## 二十二. Kafka框架

### [Apache Kafka Office Website](http://kafka.apache.org/)

### [Apache KafkaProducer API Document](http://kafka.apache.org/090/javadoc/index.html?org/apache/kafka/clients/producer/KafkaProducer.html)

### [Apache KafkaConsumer API Document](http://kafka.apache.org/090/javadoc/index.html?org/apache/kafka/clients/consumer/KafkaConsumer.html)

## 二十三. Storm框架

### [Apache Storm Office Website](http://storm.apache.org/)
