package chapter06

/**
 *
 * @author veione
 * @date 2023/4/16
 * @version 1.0
 */
object Test17_Extends {
  def main(args: Array[String]): Unit = {
    //1.类型的检测和转换
    val student:Student17 = new Student17("alice", 18)
    student.sayHello()

    val person: Person17 = new Student17("bob", 20)
    person.sayHello()

    println("student is Student17 = " + student.isInstanceOf[Student17])
    println("student is Person17 = " + student.isInstanceOf[Person17])
    println("person is Student17 = " + person.isInstanceOf[Student17])
    println("person is Person17 = " + person.isInstanceOf[Person17])

    val stu2 = new Person17("allen", 20)
    stu2.sayHello()
    println("person is Student17 = " + stu2.isInstanceOf[Student17])
    println("person is Person17 = " + stu2.isInstanceOf[Person17])

    println(classOf[Student17])

    // 2.测试枚举类
    println(WorkDay.MONDAY, WorkDay.TUESDAY)
  }
}


class Person17(val name: String, val age: Int) {
  def sayHello(): Unit = {
    println("hi from person " + name)
  }
}

class Student17(name: String, age: Int) extends Person17(name, age) {
  override def sayHello(): Unit = {
    println("hi from student " + name)
  }
}

// 定义枚举类
object WorkDay extends Enumeration {
  val MONDAY = Value(1, "Monday")
  val TUESDAY = Value(2, "Tuesday")
}

// 定义应用类对象
object TestApp extends App {
  println("app start")

  // 使用type关键字定义别名
  type MyString = String
  val name: MyString = "peter"
  println(name)
}