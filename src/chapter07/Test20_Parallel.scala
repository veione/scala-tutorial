package chapter07

import scala.collection.immutable
import scala.collection.parallel.immutable.ParSeq

/**
 *
 * @author veione
 * @date 2023/4/16
 * @version 1.0
 */
object Test20_Parallel {
  def main(args: Array[String]): Unit = {
    val result: immutable.IndexedSeq[Long] = (1 to 100).map(
      x => Thread.currentThread.getId
    )
    println(result)

    val result2: ParSeq[Long] = (1 to 100).par.map(
      x => Thread.currentThread.getId
    )
    println(result2)
  }
}
