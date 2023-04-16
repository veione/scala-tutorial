package chapter07

import scala.collection.mutable

/**
 *
 * @author veione
 * @date 2023/4/16
 * @version 1.0
 */
object Test07_MutableSet {
  def main(args: Array[String]): Unit = {
    //1.创建Set
    val set1: mutable.Set[Int] = mutable.Set(13, 23, 52, 12, 78)
    println(set1)

    println("=================")

    //2.添加元素
    val set2 = set1 + 11
    println(set1)
    println(set2)

    set1 += 80
    println(set1)

    // 内部使用的方法是：+=
    set1.add(10)
    println(set1)

    val flag1 = set1.add(20)
    println(flag1)
    println(set1)
    val flag2 = set1.add(20)
    println(flag2)
    println(set1)

    val flag3 = set1.remove(20)
    println(flag3)
    val flag4 = set1 -= 20
    println(flag4)
    println(set1)

    val set3 = Set(30, 23, 56, 39)

    val set4 = set1 ++ set3
    println(set1)
    println(set3)
    println(set4)
  }
}
