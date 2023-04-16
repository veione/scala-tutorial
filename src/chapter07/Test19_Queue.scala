package chapter07

import scala.collection.immutable.Queue
import scala.collection.mutable

/**
 *
 * @author veione
 * @date 2023/4/16
 * @version 1.0
 */
object Test19_Queue {
  def main(args: Array[String]): Unit = {
    val queue: mutable.Queue[String] = new mutable.Queue[String]()

    queue.enqueue("a", "b", "c")
    println(queue.dequeue())
    println(queue)

    queue.enqueue("d", "e")
    println(queue.dequeue())
    println(queue)
    println("==================")

    // 不可变队列
    val queue2 = Queue("a","b", "c")
    val queue3 = queue2.enqueue("d")
    println(queue2)
    println(queue3)
  }
}
