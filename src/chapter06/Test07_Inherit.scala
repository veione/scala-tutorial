package chapter06

/**
 *
 * @author veione
 * @date 2023/4/16
 * @version 1.0
 */
object Test07_Inherit {
  def main(args: Array[String]): Unit = {
    val student1 = new Student7("alice", 18)
    val student2 = new Student7("bob", 20, "432473289429")

    student1.printInfo()
    student2.printInfo()

    val teacher = new Teacher
    teacher.printInfo()

    def personInfo(person: Person7): Unit = {
      person.printInfo()
    }

    println("============================")

    val person = new Person7
    personInfo(student1)
    personInfo(teacher)
    personInfo(person)
  }
}

//定义一个父类
class Person7 {
  var name: String = _
  var age: Int = _

  println("1.父类的主构造器调用")

  def this(name: String, age: Int) {
    this()
    println("2.父类的辅助构造器被调用")
    this.name = name
    this.age = age
  }

  def printInfo(): Unit = {
    println(s"Person: $name $age")
  }
}

//定义子类
class Student7(name: String, age: Int) extends Person7(name, age) {
  private var stuNo: String = _
  println("3.子类的主构造器被调用")

  def this(name: String, age: Int, stuNo: String) {
    this(name, age)
    this.stuNo = stuNo
    println("4.子类的辅助构造器被调用")
  }

  override def printInfo(): Unit = {
    println(s"Student: $name $age $stuNo")
  }
}

class Teacher extends Person7 {
  override def printInfo(): Unit = {
    println("Teacher")
  }
}