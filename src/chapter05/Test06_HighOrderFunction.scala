package chapter05

/**
 *
 * @author veione
 * @date 2023/4/9
 * @version 1.0
 */
object Test06_HighOrderFunction {

  def main(args: Array[String]): Unit = {
    def f(n: Int): Int = {
      println("f调用")
      n + 1
    }

    val result: Int = f(123)
    println(result)

    // 1.函数可以作为值进行传递
    val f1: Int => Int = f //明确指定函数类型
    val f2 = f _
    val f3 = f(_)
    println(f1)
    println(f1(10))
    println(f2)
    println(f2(20))
    println(f3)
    println(f3(30))

    // 2. 函数作为参数进行传递
    // 定义二元计算函数
    def dualEval(op: (Int, Int) => Int, a: Int, b: Int): Int = {
      op(a, b)
    }

    def add(a: Int, b: Int): Int = {
      a + b
    }

    println(dualEval(add, 12, 36))
    println(dualEval((a, b) => a + b, 10, 20))
    println(dualEval(_ + _, 30, 20))

    // 3.函数作为函数的返回值返回
    def f5(): Int => Unit = {
      def f6(a: Int): Unit = {
        println("f6调用：" + a)
      }

      f6 // 将函数直接返回
    }

    val f6 = f5()
    println(f6(10))
    println(f6)

    println(f5()(20))
  }
}
