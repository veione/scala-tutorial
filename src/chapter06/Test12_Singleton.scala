package chapter06

/**
 *
 * @author veione
 * @date 2023/4/16
 * @version 1.0
 */
object Test12_Singleton {
  def main(args: Array[String]): Unit = {
    val stu1 = Student12.getInstance()
    stu1.printInfo()

    val stu2 = Student12.getInstance()
    stu2.printInfo()

    println(stu1)
    println(stu2)

    println(stu2.eq(stu1))
    println(stu2.equals(stu1))
  }
}

class Student12 private(val name: String, val age: Int) {
  def printInfo(): Unit = {
    println(s"student name = $name, age = $age, school = ${Student12.school}")
  }
}

// 饿汉式
//object Student12 {
//  val school: String = "中南大学"
//  private val student: Student12 = new Student12("alice", 20)
//
//  def getInstance(): Student12 = student
//}

// 懒汉式
object Student12 {
  val school: String = "中南大学"
  private var student: Student12 = _

  def getInstance(): Student12 = {
    if (student == null) {
      student = new Student12("Bob", 20)
    }
    student
  }
}
