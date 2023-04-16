package chapter07

import scala.collection.mutable

/**
 *
 * @author veione
 * @date 2023/4/16
 * @version 1.0
 */
object Test16_MergeMap {
  def main(args: Array[String]): Unit = {
    val map1 = Map("a" -> 1, "b" -> 3, "c" -> 6)
    val map2 = mutable.Map("a" -> 6, "b" -> 2, "c" -> 9, "d" -> 3)

    //    println(map1 ++ map2)

    val map3: mutable.Map[String, Int] = map1.foldLeft(map2)(
      (mergeMap, kv) => {
        val key = kv._1
        val value = kv._2
        mergeMap(key) = mergeMap.getOrElse(key, 0) + value
        mergeMap
      })
    println(map3)
  }
}
