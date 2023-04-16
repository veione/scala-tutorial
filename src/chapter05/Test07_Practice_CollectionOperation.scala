package chapter05

/**
 *
 * @author veione
 * @date 2023/4/9
 * @version 1.0
 */
object Test07_Practice_CollectionOperation {

  def main(args: Array[String]): Unit = {
    val arr: Array[Int] = Array(10, 20, 30, 40, 50, 60)

    // 对数组进行处理，将操作抽象出来，处理完毕之后的结果返回一个新的数组
    def arrayOperation(arr: Array[Int], op: Int => Int): Array[Int] = {
      for (ele <- arr) yield op(ele)
    }

    // 定义一个加1操作
    def addOne(ele: Int) = ele + 1

    // 调用函数
    val newArray: Array[Int] = arrayOperation(arr, addOne)
    println(newArray.mkString(","))

    // 传入匿名函数，实现元素翻倍
    val newArray2 = arrayOperation(arr, _ * 2)
    println(newArray2.mkString(","))
  }
}
