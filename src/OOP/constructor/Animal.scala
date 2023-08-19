package OOP.constructor

/**
 * @author Yan
 * @create 2023-08-18 14:57
 * */
class Animal (animalName: String, animalAge: Int){
  // 辅助构造器
  def this(animalName: String) = this(animalName, 0)

  override def toString: String = s"$animalName --> $animalAge"

}

object Animal {
  def main(args: Array[String]): Unit = {
    val cat: Animal = new Animal("cat")
    println(cat)
  }
}
