package chapter04;

/**
 * @author veione
 * @version 1.0
 * @date 2023/4/9
 */
object Test03_Practice_Pyramid {

  def main(args: Array[String]): Unit = {
    for (i <- 1 to 9) {
      val stars = 2 * i - 1
      val spaces = 9 - i
      println(" " * spaces + "*" * stars)
    }

    for (i <- 1 to 9; stars = 2 * i - 1; spaces = 9 - i) {
      println(" " * spaces + "*" * stars)
    }

    for (stars <-  1 to 17 by 2; spaces = (17 - stars) / 2) {
      println(" " * spaces + "*" * stars)
    }
  }
}
