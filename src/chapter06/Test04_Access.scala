package chapter06

/**
 *
 * @author veione
 * @date 2023/4/16
 * @version 1.0
 */
object Test04_Access {
  def main(args: Array[String]): Unit = {
    //创建对象
    val person: Person = new Person
    //    person.idCard //error
    //    person.name // error
    println(person.age)
    println(person.sex)
    person.printInfo()equals()

    val worker: Worker = new Worker
    worker.printInfo()
  }
}

// 定义一个子类
class Worker extends Person {
  override def printInfo(): Unit = {
    println("Worker: ")
    //    println(idCard) //error
    name = "bob"
    age = 24
    sex = "male"
    println(s"Worker $name $age, $sex")
  }
}