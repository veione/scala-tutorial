package chapter05

/**
 *
 * @author veione
 * @date 2023/4/9
 * @version 1.0
 */
object Test10_Recursion {
  def main(args: Array[String]): Unit = {
    println(fact(5))
    println(tailFact(5))
    println(fibonacci(10))
  }

  // 递归实现计算阶乘
  def fact(n: Int): Int = {
    if (n == 0) return 1
    fact(n - 1) * n
  }

  // 尾递归实现
  def tailFact(n: Int): Int = {
    @annotation.tailrec
    def loop(n: Int, cur: Int): Int = {
      if (n == 0) return cur
      loop(n - 1, cur * n)
    }

    loop(n, 1)
  }

  // 尾递归实现斐波那契数列计算
  def fibonacci(n: Int): Int = {
    @annotation.tailrec
    def loop(i: Int, prev: Int, cur: Int): Int =
      if (i >= n) cur
      else loop(i + 1, cur, prev + cur)

    if (n <= 1) 0
    else if (n == 2) 1
    else loop(2, 0, 1)
  }

}
