package chapter04

import scala.util.control.Breaks._

/**
 *
 * @author veione
 * @date 2023/4/9
 * @version 1.0
 */
object Test06_Break {

  def main(args: Array[String]): Unit = {
    //1.采用抛出异常的方式退出循环
    try {
      for (i <- 0 until 5) {
        if (i == 3)
          throw new RuntimeException
        println(i)
      }
    } catch {
      case e: Exception => //什么都不做，只是退出循环
    }

    //2.使用Scala中的break方法实现异常的抛出和捕获
    breakable(
      for (i <- 0 until 5) {
        if (i == 3)
          break
        println(i)
      }
    )

    println("这是循环外的代码")
  }
}
