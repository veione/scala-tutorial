package chapter06

/**
 *
 * @author veione
 * @date 2023/4/16
 * @version 1.0
 */
object Test11_Object {
  def main(args: Array[String]): Unit = {
    //    val stu = new Student11("bob", 20)
    //    stu.printInfo()

    val stu = Student11.newStudent("bob", 23)
    stu.printInfo()

    val stu2 = Student11("alice", 20)
    stu2.printInfo()
  }
}

//定义类(构造私有化)
class Student11 private(val name: String, val age: Int) {
  def printInfo(): Unit = {
    println(s"student name = $name, age = $age, school = ${Student11.school}")
  }
}

// 伴生对象
object Student11 {
  val school: String = "中南大学"

  // 定义一个类的对象实例的创建方法
  def newStudent(name: String, age: Int): Student11 = new Student11(name, age)

  // Scala中自动调用该方法,属于工厂调用方法，不需要new，直接通过类名括号传递参数即可，Scala会自动调用apply方法
  def apply(name: String, age: Int) = new Student11(name, age)
}