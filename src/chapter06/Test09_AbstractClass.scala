package chapter06

/**
 *
 * @author veione
 * @date 2023/4/16
 * @version 1.0
 */
object Test09_AbstractClass {
  def main(args: Array[String]): Unit = {
    val stu = new Student9
    stu.eat()
    stu.sleep()
  }
}

//定义抽象类
abstract class Person9 {
  //非抽象属性
  var name: String = "person"

  // 抽象属性
  var age: Int

  //非抽象方法
  def eat(): Unit = {
    println("person eat")
  }

  //抽象方法
  def sleep(): Unit
}

//定义具体的实现子类
class Student9 extends Person9 {
  override var age: Int = 18

  override def sleep(): Unit = {
    println("student sleep")
  }

  override def eat(): Unit = {
    super.eat()
    println("student eat")
  }

  //重写非抽象属性和方法,必须要用override关键字
  //  override val name: String = "student"
  name = "student"
}