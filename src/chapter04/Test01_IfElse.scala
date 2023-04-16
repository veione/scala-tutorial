package chapter04

import scala.io.StdIn

/**
 *
 * @author veione
 * @date 2023/4/9
 * @version 1.0
 */
object Test01_IfElse {

  def main(args: Array[String]): Unit = {
    println("请输入您的年龄：")
    val age: Int = StdIn.readInt()

    //1.单分支
    if (age >= 18) {
      println("成年")
    }

    //2.双分支
    if (age >= 18) {
      println("成年")
    } else {
      println("未成年")
    }

    //3.多分支
    if (age < 18) {
      println("成年")
    } else if (age < 30) {
      println("青年")
    } else {
      println("老年")
    }

    //4.分支语句返回值
    val result: Any = if (age < 18) {
      println("成年")
      "成年"
    } else if (age < 30) {
      println("青年")
      "青年"
    } else {
      println("老年")
      "老年"
    }
    println("result : " + result)

    // java中的三元运算符 (age >= 18) ? "成年" : "未成年"

    val res: String = if (age >= 18) "成年" else "未成年"
    println("res = " + res)
  }
}
