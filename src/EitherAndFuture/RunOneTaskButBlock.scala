package EitherAndFuture

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.{Await, Future}
import scala.concurrent.duration._
/**
 * @author Yan
 * @create 2023-08-19 21:48
 * */
object RunOneTaskButBlock {
  def main(args: Array[String]): Unit = {
    implicit val baseTime = System.currentTimeMillis()
    val testFuture = Future {
      Thread.sleep(300)
      2 + 2
    }
    val finalOutPut = Await.result(testFuture, 2 second)
    println(finalOutPut)
  }

}
