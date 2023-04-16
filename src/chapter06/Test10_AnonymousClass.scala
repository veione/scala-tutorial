package chapter06

/**
 *
 * @author veione
 * @date 2023/4/16
 * @version 1.0
 */
object Test10_AnonymousClass {
  def main(args: Array[String]): Unit = {
    val person: Person10 = new Person10 {
      override var name: String = "alice"

      override def eat(): Unit = {
        println("person eat")
      }
    }

    println(person.name)
    person.eat()
  }
}

//定义抽象类
abstract class Person10 {
  var name: String

  def eat(): Unit
}
