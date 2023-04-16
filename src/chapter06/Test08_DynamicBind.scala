package chapter06

/**
 *
 * @author veione
 * @date 2023/4/16
 * @version 1.0
 */
object Test08_DynamicBind {
  def main(args: Array[String]): Unit = {
    val student8: Person8 = new Student8
    println(student8.name)
    student8.hello()
  }
}

class Person8 {
  val name: String = "Person"

  def hello(): Unit = {
    println("Hello person")
  }
}

class Student8 extends Person8 {
  override val name: String = "student"

  override def hello(): Unit = {
    println("hello student")
  }
}
