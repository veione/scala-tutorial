package chapter07

import scala.collection.mutable.ListBuffer

/**
 *
 * @author veione
 * @date 2023/4/16
 * @version 1.0
 */
object Test05_ListBuffer {
  def main(args: Array[String]): Unit = {
    // 1.创建可变列表
    val list1: ListBuffer[Int] = new ListBuffer[Int]()
    val list2 = ListBuffer(12, 53, 75)

    println(list1)
    println(list2)

    println("=====================")

    // 2.添加元素, 内部使用符号：++=
    list1.append(15, 62)
    // 前面添加元素，内部使用符号：++=:
    list1.prepend(20)

    list1.insert(1, 20, 28)

    println(list1)
    println(list2)

    31 +=: 96 +=: list1 += 24 += 11
    println(list1)

    // 3.合并列表
    val list3 = list1 ++ list2
    println(list3)
    println(list1)
    println(list2)

    println("===============")

    list1 ++= list2
    println(list1)
    println(list2)

    println("=============")
    list2 ++= list1
    println(list1)
    println(list2)

    // 4.修改元素
    list2(3) = 20
    list2.update(0, 89)
    println(list2)

    // 4.删除元素
    list2.remove(2)
    list2 -= 20
    println(list2)
  }
}
