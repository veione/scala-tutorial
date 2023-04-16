package chapter06

/**
 *
 * @author veione
 * @date 2023/4/16
 * @version 1.0
 */
object Test14_TraitMixin {
  def main(args: Array[String]): Unit = {
    val stu = new Student14
    stu.study()
    stu.increase()

    stu.play()
    stu.increase()

    stu.dating()
    stu.increase()

    println("===============================")
    // 动态混入
    val stuWithTalent = new Student14 with Talent {
      override def singing(): Unit = println("student is singing")

      override def dancing(): Unit = println("student is dancing")
    }

    stuWithTalent.sayHello()
    stuWithTalent.play()
    stuWithTalent.study()
    stuWithTalent.dating()
    stuWithTalent.singing()
    stuWithTalent.dancing()
  }
}

// 再定义一个特质
trait Knowledge {
  var amount: Int = 0

  def increase(): Unit
}

trait Talent {
  def singing(): Unit

  def dancing(): Unit
}

class Student14 extends Person13 with Young with Knowledge {
  // 重写冲突的属性 父类的name和特质name冲突

  override val name: String = "student"

  // 实现抽象方法
  def dating(): Unit = println(s"student $name is dating")

  def study(): Unit = println(s"student $name is studying")

  //重写父类方法
  override def sayHello(): Unit = {
    super.sayHello()
    println(s"hello from: student $name")
  }

  // 实现特质中的抽象方法
  override def increase(): Unit = {
    amount += 1
    println(s"student $name knowledge increased $amount")
  }
}