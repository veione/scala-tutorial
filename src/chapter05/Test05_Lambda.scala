package chapter05

/**
 *
 * @author veione
 * @date 2023/4/9
 * @version 1.0
 */
object Test05_Lambda {

  def main(args: Array[String]): Unit = {
    val fun = (name: String) => println(name)
    fun("张三")

    println("======================")

    // 定义一个函数，以函数作为参数输入
    def f(func: String => Unit): Unit = {
      func("张三")
    }

    f(fun)
    f((name: String) => Unit)
    println("======================")

    // 匿名函数至简原则
    // (1)参数的类型可以省略，会根据形参进行自动推导
    f((name) => {
      println(name)
    })

    // (2)类型省略之后，发现只有一个参数，则圆括号可以省略;其它情况:没有参数和参数超过1的永远不能省略
    f(name => {
      println(name)
    })

    // (3)匿名函数如果只有一行，则大括号也可以省略
    f(name => println(name))

    // (4)如果参数只出现一次，则参数省略且后面参数可以用_代替
    f(_ => println)
    f(println(_))

    // (5) 如果可以推断出,当前传入的println是一个函数体,而不是调用语句,可以直接省略下划线
    f(println)

    println("==============================")

    // 实际示例，定义一个"二元运算"函数，只操作1和2两个数，但是具体运算通过参数传入
    def dualFunctionOneAndTwo(fun: (Int, Int) => Int): Int = {
      fun(1, 2)
    }

    val add = (a: Int, b: Int) => a + b
    val minus = (a: Int, b: Int) => a - b

    println(dualFunctionOneAndTwo(add))
    println(dualFunctionOneAndTwo(minus))

    // 匿名函数简化
    println(dualFunctionOneAndTwo((a: Int, b: Int) => a + b))
    println(dualFunctionOneAndTwo((a: Int, b: Int) => a - b))

    println(dualFunctionOneAndTwo((a, b) => a + b))
    println(dualFunctionOneAndTwo(_ + _))
    println(dualFunctionOneAndTwo(_ - _))

    // 如果是 b - a 则需要指定 或者是反过来加入一个-号
    println(dualFunctionOneAndTwo((a, b) => b - a))
    println(dualFunctionOneAndTwo(-_ - _))

  }
}
