package OOP.companionAndSingeleton.companion

/**
 * @author Yan
 * @create 2023-08-18 10:43
 * */
class Animal {
  var animalName: String = "notset"

  def setAnimalName(name: String): Unit = {
    animalName = name
  }

  def getAnimalName: String = animalName

  def isAnimalSet: Boolean = if (animalName == "notset") false else true





}
object Animal{
  def main(args: Array[String]): Unit = {
    val obj: Animal = new Animal;
    var flag: Boolean = false;
    obj.setAnimalName("dog");
    flag = obj.isAnimalSet;
    println(flag); // true
    obj.setAnimalName("notset");
    println(obj.isAnimalSet);
  }
}

object RunAnimalExample{
  def main(args: Array[String]): Unit = {
    val animalObj = new Animal
    animalObj.setAnimalName("black")
    print(animalObj.isAnimalSet)
  }
}

