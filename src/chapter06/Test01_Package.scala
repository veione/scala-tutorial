/**
 * 导包说明：
 * 1、和Java一样，可以在顶部使用import导入，在这个文件中的所有类都可以使用。
 * 2、局部导入，什么时候用，什么时候导入。在其作用范围内部都可以使用。
 * 3、通配符导入:import java.uti._
 * 4、给类起别名：import java.util.{ArrayList=>JL}
 * 5、导入相同包的多个类: import java.util.{HashSet,ArrayList}
 * 6、屏蔽类：import java.util.{ArrayList=>_,_}
 * 7、导入包的绝对路径：new _root_.java.util.HashMap
 * ```scala
 * package java {
 *    package util {
 *      class HashMap {
 *
 *      }
 *    }
 * }
 *
 * Scala中默认的三个导入：
 * 1、import java.lang._
 * 2、import scala._
 * 3、import scala.Predef._
 * ```
 */
//用嵌套风格定义包
package com {

  import com.atguigu.scala.Inner

  //在外层中定义单例对象
  object Outer {
    var out: String = "out"

    def main(args: Array[String]): Unit = {
      println(Inner.in)
    }
  }
  package atguigu {
    package scala {
      // 内层定义单例对象
      object Inner {
        val in: String = "in"

        def main(args: Array[String]): Unit = {
          println(Outer.out)
          Outer.out = "outer"
          println(Outer.out)
        }
      }
    }

  }

}

//在同一文件中定义多个包
package aaa {
  package bbb {

    import com.Outer
    import com.atguigu.scala.Inner

    object Test01_Package {
      def main(args: Array[String]): Unit = {
        println(Inner.in)
        println(Outer.out)
      }
    }
  }
}
