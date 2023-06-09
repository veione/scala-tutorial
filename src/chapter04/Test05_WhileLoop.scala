package chapter04

/**
 *
 * @author veione
 * @date 2023/4/9
 * @version 1.0
 */
object Test05_WhileLoop {

  def main(args: Array[String]): Unit = {
    // while
    var a: Int = 10
    while (a >= 1) {
      println("this is a while loop: " + a)
      a -= 1
    }

    var b: Int = 10
    do {
      println("this is a do-while loop: " + b)
      b -= 1
    } while (b > 0)
  }
}
