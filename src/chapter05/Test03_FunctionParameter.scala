package chapter05

/**
 *
 * @author veione
 * @date 2023/4/9
 * @version 1.0
 */
object Test03_FunctionParameter {

  def main(args: Array[String]): Unit = {
    // (1)可变参数
    def f1(str: String*): Unit = {
      println(str)
    }

    f1("张三")
    f1("张三", "李四", "王五")

    // (2)如果参数列表中存在多个参数，那么可变参数一般放置在最后
    def f2(str1: String, str2: String*): Unit = {
      println("str1 = " + str1 + ", str2 = " + str2)
    }

    f2("张三")
    f2("张三", "李四", "王五", "赵六")

    // (3)参数默认值，一般将没有默认值的参数放置在参数列表的后面
    def f3(name: String = "Nobody"): Unit = {
      println("正在处理用户 " + name)
    }

    f3()
    f3("张三")

    // (4)带名参数
    def f4(name: String = "Nobody", age: Int): Unit = {
      println(s"${age}岁的${name}在敲代码")
    }

    f4("张三", 20)
    f4(age = 23, name = "李四")
    f4(age = 24)

  }
}
