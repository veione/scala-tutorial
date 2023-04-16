package chapter02

/**
 *
 * @author veione
 * @date 2022/12/8
 * @version 1.0
 */
object Test07_DataType {

  def main(args: Array[String]): Unit = {
    //byte short int long AnyRef AnyVal
    val a1: Byte = 20
    val a2: Byte = (a1 + 20).toByte
    //    val a3 : Byte = 128
    println(a2)

    val a4 = 100 //默认是int
    println(a4)
    val a5: Long = 432483924329L
    println(a5)

    val a6: Float = 3.1415925F
    println(a6)

    val c1: Char = 'H'
    val c2: Char = '9'
    val c3 = '\t'
    val c4 = '\n'
    println("abc" + c3 + "def")
    println(s"abc${c3}def")
    println("abc" + c4 + "def")
    println(s"abc${c4}def")
    println(s"abc${c3}${c4}def")

    //转义字符
    val c5 = '\\'
    val c6 = '\"'

    //字符变量底层保存ASCII码
    val i1: Int = c1
    println("i1:" + i1)
    val i2: Int = c2
    println("i2:" + i2)

    val c7: Char = (i1 + 1).toChar
    println(c7)

    //布尔类型
    val isTrue: Boolean = true
    println(isTrue)

    //Unit类型、Null类型和Nothing类型
    //Unit：表示无值，和其它语言中void等同。用作不返回任何结果的方法的结果类型。Unit只有一个实例值，写成()。
    //Null：null,Null类型只有一个实例值null
    //Nothing：Nothing类型在Scala的类层级最低端；它是任何其它类型的子类型。当一个函数，我们确定没有正常的返回值，
    //可以用Nothing来指定返回类型，这样有一个好处，就是我们可以把返回的值（异常）赋给其他的函数或者变量（兼容性）。

    //5.空类型
    //5.1 空值Unit
    def m1(): Unit = {
      println("m1被调用执行")
    }

    val a: Unit = m1()
    println("a" + a) // ()

    //5.2 空引用Null
    //    val n: Int = null //error
    var student: Student = new Student("alice", 20)
    student = null
    println(student) //null

    //5.3 Nothing
    def m2(n: Int): Int = {
      if (n == 0)
        throw new NullPointerException();
      else
        n
    }

    val b: Int = m2(0)
    println(b)
  }
}
