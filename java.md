## java语言面向对象程序设计
- 包裹类型

- 类变量与类函数 (static关键字)
    - 变量或函数属于类而不属于对象

- 容器类
    - ArrayList
    - HashSet
    - HashMap
~~~
public string toString(){
    return "";
}
// System.out.println(..) 可直接将类的内容输出
（调用toString()函数）
~~~

- for-each循环

- Object类
    - 所有的类都继承自Object类 单根结构
    - toString() equals()
    - = 只能判断两个类是否指向同一个对象 equals()可以用来判断内容是否相同（override）

- 面向对象程序设计原则（优化）
    - 消除代码复制
    - 封装
    - 增加可扩展性
    - 用封装降低类与类的耦合
    - 使用容器增加灵活性
    - 框架+数据

- 抽象(abstract)
    - 抽象类无法产生对象，但可以定义变量（管理子类）
    - 抽象类 抽象函数
    - 表达概念而非实体

- 数据和表现分离
    - 程序的业务逻辑与表现无关

- 接口
    - 接口是纯抽象类
    - 所有的成员函数都是抽象函数
    - 所有的成员变量都是public static final
    - interface(声明接口) 取代class的位置
    - implements（实现接口）
    - 类可以实现多个接口
    - 接口可以继承接口但不能继承类
    - 接口不能实现接口

- 面向接口的程序方式
    - 设计程序时先定义接口再实现类
    - 在函数间传入传出的是接口而不是具体的类

- 内部类
    - 在类（或函数）的内部定义一个新的类

- 匿名类
    - new对象的时候给出类的定义形成匿名类
    - 匿名类可以继承某类，也可以实现某接口

- 异常
    - 抛出异常：throw
    - 抛出子类异常会被捕捉夫类异常的catch捕捉
  ~~~
  try{
    //code
  } catch(...){

  } catch(...e){
     ...
     throw e;
  }
  ~~~

  ~~~
  class OpenException extends Throwable{

  }
  // 如果函数可能抛出异常，需要在函数头部加以声明
  public static void readFile() throws OpenException {
        if(open==-1) {
            throw new OpenException();
        }
  }
  ~~~
  - 可以throw的类
    - 任何继承了Throwable类的对象
    - Exception类继承了Throwable
    - throw new Exception()
    - throw new Exception("HELP");                    

- 异常声明与继承关系
  - 当覆盖一个函数时，子类不能抛出比父类更多的异常
  - 在子类的构造函数中，必须声明父类可能抛出的全部异常