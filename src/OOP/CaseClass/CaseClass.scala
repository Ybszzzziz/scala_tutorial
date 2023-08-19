package OOP.CaseClass

import java.util.ArrayList

/**
 * @author Yan
 * @create 2023-08-19 9:52
 * */
object CaseClass {
  def main(args: Array[String]): Unit = {
//    val nail = Character("Nail", true)
//    val joyce = nail.copy(name = "Joyce")
//    println(nail == joyce)
//    println(nail.equals(joyce))
//    println(nail.equals(nail))
//    println(nail.hashCode())
//    joyce match {
//      case Character(x, true) => print(s"$x is a hacker")
//      case Character(x, false) => print(s"$x is not a hacker")
//    }
//    val animals = new ArrayList[String]
//    animals.add("dog")
//    animals.add("dog")
//    animals.add("dog")
//    animals.add("shit")
//    for (animal <- animals) {
//      println(animal)
//    }
    println(matchInteger(3))
    def matchInteger(x: Int): String = x match {
      case 1 => "one"
      case 2 => "two"
      case _ => "greater than two"
}



  }
  implicit def add(implicit a: Int, b: Int): Int = a + b;
  case class Character(name: String, isHacker: Boolean)
}
