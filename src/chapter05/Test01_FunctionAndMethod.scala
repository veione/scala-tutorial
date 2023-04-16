package chapter05

/**
 *
 * @author veione
 * @date 2023/4/9
 * @version 1.0
 */
object Test01_FunctionAndMethod {

  def main(args: Array[String]): Unit = {
    // 定义函数
    def sayHi(name: String): Unit = {
      println("hi, " + name)
    }

    // 调用函数
    sayHi("张三")

    // 调用对象的方法
    Test01_FunctionAndMethod.sayHi("李四")

    // 获取方法返回值
    val result = Test01_FunctionAndMethod.sayHello("王五")
    println(result)
  }

  //定义对象的方法
  def sayHi(name: String): Unit = {
    println("Hi, " + name)
  }

  def sayHello(name: String): String = {
    return "Hello, " + name
  }
}
