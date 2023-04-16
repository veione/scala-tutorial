package chapter06

/**
 *
 * @author veione
 * @date 2023/4/16
 * @version 1.0
 */
object Test13_Trait {
  def main(args: Array[String]): Unit = {
    val student = new Student13
    student.sayHello()
    student.dating()
    student.play()
  }
}

// 定义一个父类
class Person13 {
  val name: String = "Person"
  val age: Int = 18

  def sayHello(): Unit = {
    println("hello from: " + name)
  }

  def increase(): Unit = {
    println("person increased")
  }
}

// 定义一个特质
trait Young {
  // 可以定义抽象和非抽象的属性
  val name: String = "young"

  // 声明抽象和非抽象的方法
  def play(): Unit = {
    println("young people is playing")
  }

  def dating(): Unit
}

class Student13 extends Person13 with Young {
  // 重写冲突的属性 父类的name和特质name
  override val name: String = "student"

  // 实现抽象方法
  def dating(): Unit = println(s"student $name is dating")

  def study(): Unit = println(s"student $name is studying")

  //重写父类方法
  override def sayHello(): Unit = {
    super.sayHello()
    println(s"hello from: student $name")
  }
}
