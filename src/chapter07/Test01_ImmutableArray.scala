package chapter07

/**
 *
 * @author veione
 * @date 2023/4/16
 * @version 1.0
 */
object Test01_ImmutableArray {
  def main(args: Array[String]): Unit = {
    // 1.创建数组
    val arr: Array[Int] = new Array[Int](5)
    // 另一种方式创建
    val arr2 = Array(1, 2, 3, 4, 5)

    // 2.访问数组中的元素
    println(arr(0))
    println(arr(1))
    println(arr(4))
    //    println(arr(5))
    arr(0) = 12
    arr(4) = 57
    println(arr.mkString(","))

    // 数组的遍历
    for (i <- 0 until arr2.length) println(arr2(i))
    for (i <- arr.indices) println(arr(i))
    for (ele <- arr) println(ele)

    // 迭代器
    val iter = arr2.iterator
    while (iter.hasNext) {
      println(iter.next())
    }

    // 调用foreach方法
    arr2.foreach(println)

    // 添加元素
    // :+ 后置添加元素
    val newArr = arr :+ 102
    println(newArr.mkString("-"))
    println(arr.mkString("-"))

    // 前置添加元素 +:
    val newArr2 = 30 +: newArr
    println(newArr2.mkString("-"))
    println(newArr.mkString("-"))

    val newArr4 = 19 +: newArr :+ 20 :+ 30 :+ 40
    println(newArr4.mkString(","))
  }
}
