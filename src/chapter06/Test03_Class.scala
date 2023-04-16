package chapter06

import scala.beans.BeanProperty

/**
 *
 * @author veione
 * @date 2023/4/16
 * @version 1.0
 */
object Test03_Class {
  def main(args: Array[String]): Unit = {
    //创建一个对象
    val student = new Student()
    //    student.name // 不能访问private属性
    println(student.age)
    println(student.sex)
    student.sex = "male"
    println(student.sex)
  }
}

// 定义一个类
class Student {
  // 定义属性
  private var name: String = "alice"
  @BeanProperty
  val age: Int = 18
  // 下划线表示赋值初始空值
  var sex: String = _
}