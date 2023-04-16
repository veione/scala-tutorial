//package chapter06
//
///**
// *
// * @author veione
// * @date 2023/4/16
// * @version 1.0
// */
//object Test02_PackageObject {
//
//  def main(args: Array[String]): Unit = {
//    commonMethod()
//    println(commonValue)
//  }
//}

package chapter06 {
  object Test02_PackageObject {
    def main(args: Array[String]): Unit = {
      commonMethod()
      println(commonValue)
    }
  }
}

package ccc {
  package ddd {
    object Test02_PackageObject {
      def main(args: Array[String]): Unit = {
        println(school)
      }
    }
  }

}

// 定义一个包对象
package object ccc {
  val school = "中南大学"
}
