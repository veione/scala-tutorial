package chapter04

/**
 *
 * @author veione
 * @date 2023/4/9
 * @version 1.0
 */
object Test03_Practice_MulTable {

  def main(args: Array[String]): Unit = {
    for (i <- 1 to 9) {
      for (j <- 1 to i) {
        print(s"${j} * ${i} = ${i * j}\t")
      }
      println()
    }

    for (i <- 1 to 9; j <- 1 to i) {
      print(s"${j} * ${i} = ${i * j}\t")
      if (j == i)
        println()
    }
  }
}
