package Exception

import java.io.{FileNotFoundException, FileReader}
import java.io.IOException

/**
 * @author Yan
 * @create 2023-08-19 21:30
 * */
object TryCatch {
  def main(args: Array[String]): Unit = {
    try{
      val reader = new FileReader("test.txt")
    } catch {
      case ex: FileNotFoundException => println("File Not Found")
      case ex: IOException => println("IOException")
    } finally {
      println("Finally block ~~")
    }

  }
}
