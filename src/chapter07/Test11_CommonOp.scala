package chapter07

/**
 *
 * @author veione
 * @date 2023/4/16
 * @version 1.0
 */
object Test11_CommonOp {
  def main(args: Array[String]): Unit = {
    val list = List(1, 3, 5, 7, 2, 89)
    val set = Set(23, 34, 423, 25)

    // (1).获取集合长度
    println(list.length)

    // (2).获取集合的大小
    println(set.size)

    // (3).循环遍历
    set.foreach(println)

    // (4).迭代器
    for (ele <- list.iterator) println(ele)

    // (5).生成字符串
    println(list)
    println(set)
    println(list.mkString("--"))

    // (6).是否包含
    println(list.contains(89))
    println(set.contains(23))
  }
}
