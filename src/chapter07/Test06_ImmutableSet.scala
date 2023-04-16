package chapter07

/**
 *
 * @author veione
 * @date 2023/4/16
 * @version 1.0
 */
object Test06_ImmutableSet {
  def main(args: Array[String]): Unit = {
    // 1.创建Set
    val set1 = Set(10, 20, 30)
    println(set1)

    println("================")

    // 2.添加元素
    val set2 = set1 + 20
    println(set1)
    println(set2)
    println("================")

    // 3.合并Set
    val set3 = Set(19, 20, 30, 21, 48, 89)
    val set4 = set2 ++ set3
    println(set2)
    println(set3)
    println(set4)
    println("================")
    // 2.删除元素
    val set5 = set3 - 20
    println(set3)
    println(set5)
  }
}
