package chapter06

/**
 *
 * @author veione
 * @date 2023/4/16
 * @version 1.0
 */
object Test04_ClassForAccess {

}

//定义一个父类
class Person {
  private val idCard: String = "32348324"
  protected var name: String = "alice"
  var sex: String = "female";
  private[chapter06] var age: Int = 18

  def printInfo() = {
    println(s"Person: $idCard $name, $sex, $age")
  }
}
