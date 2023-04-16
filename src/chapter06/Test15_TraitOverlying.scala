package chapter06

/**
 *
 * @author veione
 * @date 2023/4/16
 * @version 1.0
 */
object Test15_TraitOverlying {
  def main(args: Array[String]): Unit = {
    val stu = new Student15
    stu.increase()

    // 钻石问题特质叠加
    val myFootBall = new MyFootBall
    println(myFootBall.describe())
  }
}

// 定义球类特质
trait Ball {
  def describe(): String = "ball"
}

// 定义颜色特质
trait ColorBall extends Ball {
  var color: String = "red"

  override def describe(): String = color + "-" + super.describe()
}

//定义种类特质
trait CategoryBall extends Ball {
  var category: String = "foot"

  override def describe(): String = category + "-" + super.describe()
}

// 定义一个自定义球的类
class MyFootBall extends CategoryBall with ColorBall {
  //super[CategoryBall] 指定父类特质
  override def describe(): String = "my ball is " + super.describe()
}

// 再定义一个特质
trait Knowledge15 {
  var amount: Int = 0

  def increase(): Unit = {
    println("knowledge increased")
  }
}

trait Talent15 {
  def singing(): Unit

  def dancing(): Unit

  def increase(): Unit = {
    println("talent increased")
  }
}

// 当父类和其它特质出现相同方法时，特质会采用最右边的特质为准
class Student15 extends Person13 with Talent15 with Knowledge15 {
  override def dancing(): Unit = println("dancing")

  override def singing(): Unit = println("singing")

  override def increase(): Unit = {
    // 指定调用父类方法
    super[Person13].increase()
  }
}