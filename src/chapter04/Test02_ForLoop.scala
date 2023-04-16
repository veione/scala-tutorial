package chapter04

/**
 *
 * @author veione
 * @date 2023/4/9
 * @version 1.0
 */
object Test02_ForLoop {

  def main(args: Array[String]): Unit = {
    //java for语法: for(int i = 0; i < 10; i++) { System.out.println(i + "hello, world"); }

    // 1. 范围遍历
    for (i <- 1 to 10) {
      println(i + ", Hello, World")
    }

    //实际调用
    for (i <- 1.to(10)) {
      println(i)
    }

    // 左开右闭区间1~N-1
    for (i <- 1 until 10) {
      println(i)
    }

    // 增加步长
    for (i <- 1 to 10 by 2) {
      println(i)
    }

    for (i <- Range.inclusive(1, 10, 3)) {
      println(i)
    }

    //倒序
    for (i <- 1 to 10 reverse) {
      println(i)
    }

    for (i <- 1.0 to 10.0 by 0.5) {
      println(i)
    }

    //集合遍历
    for (i <- Array(10, 20, 30, 40, 50, 60)) {
      println("集合数组遍历:" + i)
    }

    for (i <- List(10, 20, 30, 40)) {
      println("集合List遍历：" + i)
    }
    for (i <- Set(10, 20, 30)) {
      println("集合Set遍历：" + i)
    }

    //循环守卫(类似Java的continue)
    for (i <- 1 to 3 if i != 2) {
      println("=====>" + i)
    }

    println("===================================")

    //嵌套循环
    for (i <- 1 to 3) {
      for (j <- 1 to 3) {
        println("i = " + i + ", j = " + j)
      }
    }
    println("===================================")
    //嵌套循环简写
    for (i <- 1 to 3; j <- 1 to 3) {
      println("i = " + i + ", j = " + j)
    }

    println("===================================")
    //循环引入变量
    for (i <- 1 to 10; j = 10 - i) {
      println("i = " + i + ", j = " + j)
    }

    //另外一种写法
    for {
      i <- 1 to 10; j = 10 - i
    } {
      println("i = " + i + ", j = " + j)
    }

    println("===================================")
    //循环返回值 yield关键表示生成一个序列返回
    val a = for (i <- 1 to 10 if i % 2 != 0) yield i * i
    println("a = " + a)
  }
}
