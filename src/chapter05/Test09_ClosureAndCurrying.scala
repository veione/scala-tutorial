package chapter05

/**
 *
 * @author veione
 * @date 2023/4/9
 * @version 1.0
 */
object Test09_ClosureAndCurrying {
  def main(args: Array[String]): Unit = {
    def add(a: Int, b: Int): Int = {
      a + b
    }

    // 1.考虑固定一个加数的场景
    def addByFour(b: Int): Int = {
      4 + b
    }

    def addByFive(b: Int): Int = {
      5 + b
    }

    // 3. 将固定参数作为另一个参数传入，但是是作为"第一层参数"传入
    def addByFour1(): Int => Int = {
      val a = 4

      def addB(b: Int): Int = {
        a + b
      }

      addB
    }

    def addByA(a: Int): Int => Int = {
      def addB(b: Int): Int = {
        a + b
      }

      addB
    }

    println(addByA(35)(24))

    val addByFour2 = addByA(4)
    val addByFive2 = addByA(5)
    println(addByFour2(13))
    println(addByFive2(20))

    // 4. lambda表达式简写
    def addByA1(a: Int): Int => Int = {
      (b: Int) => {
        a + b
      }
    }

    def addByA2(a: Int): Int => Int = {
      b => a + b
    }

    def addByA3(a: Int): Int => Int = {
      a + _
    }

    def addByA4(a: Int): Int => Int = a + _

    val addByFour4 = addByA4(4)
    val addByFive4 = addByA4(5)
    println(addByFour4(13))
    println(addByFive4(20))

    // 5. 柯里化(将匿名函数声明在函数圆括号的后面)
    def addCurrying(a: Int)(b: Int): Int = a + b

    println(addCurrying(13)(14))
  }
}
