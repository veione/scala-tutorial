package chapter05

import scala.util.control.Breaks

/**
 *
 * @author veione
 * @date 2023/4/9
 * @version 1.0
 */
object Test11_ControlAbstraction {
  def main(args: Array[String]): Unit = {
    // 1.传值参数
    def f0(a: Int): Unit = {
      println("a = " + a)
      println("a = " + a)
    }
    f0(23)

    def f1(): Int = {
      println("f1调用")
      12
    }
    //把f1()函数的返回值传递过去
    f0(f1())

    // 2.传名参数，传递的不再是具体的值而是代码块 ( => 表示代码块,需要返回一个Int类型的值)
    def f2(a: => Int): Unit = {
      println("a: " + a)
      println("a: " + a)
    }
    // breakable这个api也是用的代码块的方式
    // Breaks.breakable()
    f2(24)
    f2(f1())
    f2({
      println("这是一个代码块")
      100
    })
  }
}
