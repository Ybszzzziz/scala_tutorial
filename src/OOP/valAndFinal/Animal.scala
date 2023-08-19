package OOP.valAndFinal

/**
 * @author Yan
 * @create 2023-08-18 11:06
 * */
class Animal {
  val age = 2;
}

class Cat extends Animal{
  override val age = 3
  def printAge = println(age)

  def  main(args: Array[String]): Unit = {
    val cat: Cat = new Cat
    cat.printAge
  }
}

object Cat{
  def main(args: Array[String]): Unit = {
    val cat: Cat = new Cat

  }
}

