package chapter05

/**
 *
 * @author veione
 * @date 2023/4/9
 * @version 1.0
 */
object Test13_Lazy {
  def main(args: Array[String]): Unit = {
    lazy val result: Int = sum(13, 14)
    println("1.函数调用")
    println("2.result=" + result)
    println("4.result=" + result)

    def sum(i: Int, j: Int): Int = {
      println("3. sum调用")
      i + j
    }
  }
}
