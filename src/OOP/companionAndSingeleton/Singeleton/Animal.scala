package OOP.companionAndSingeleton.Singeleton

/**
 * @author Yan
 * @create 2023-08-18 11:00
 * */
object Animal {
  var name = "notset"
  var age = -1

  def setAge(age: Int): Unit = this.age = age

  def getAge: Int = age;

  def setName(name: String): Unit = this.name = name

  def getName: String = name;


  def main(args: Array[String]): Unit = {
    Animal.setAge(10);
    Animal.setName("wrick")
    println(Animal)
  }

  override def toString = s"Animal($name, $age)"
}
