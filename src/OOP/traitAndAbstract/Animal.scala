package OOP.traitAndAbstract

/**
 * @author Yan
 * @create 2023-08-18 15:03
 * */
trait Animal {
  val name: String
  val age: Int
  val color: String

  def shout():Unit

}

class Cat extends Animal {
  override val name: String = "cat"
  override val age: Int = 12
  override val color: String = "red"
  override def shout(): Unit = println(s"$name 的年龄是$age")

}

object Cat {
  def main(args: Array[String]): Unit = {
    val cat: Cat = new Cat
    cat.shout();
  }
}
