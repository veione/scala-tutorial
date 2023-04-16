/**
 * 包对象
 * 在Scala中可以为每个包定义一个同名的包对象，定义在包对象中的成员，作为其对应包下所有class和object的共享变量，可以被直接访问
 *
 * @author veione
 * @date 2023/4/16
 * @version 1.0
 */
package object chapter06 {
  //定义当前包共享的属性和方法
  val commonValue = "veione"

  def commonMethod() = {
    println("我是一个包对象的公共方法")
  }
}
