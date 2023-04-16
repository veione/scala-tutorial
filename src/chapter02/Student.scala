package chapter02

/**
 *
 * @author veione
 * @date 2022/12/8
 * @version 1.0
 */
class Student(val name: String, var age: Int) {

  def printInfo(): Unit = {
    println(s"欢迎${age}岁的${name}来到长沙")
  }
}
