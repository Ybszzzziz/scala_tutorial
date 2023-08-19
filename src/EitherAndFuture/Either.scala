package EitherAndFuture

import java.net.URL
import scala.io.Source

/**
 * @author Yan
 * @create 2023-08-19 21:37
 * */
object Either {
  def getData(dataUrl: URL): Either[String, Source] = {
    if (dataUrl.getHost.contains("xxx"))
      Left ("Requested URL is blocked or prohibited")
    else
      Right (Source.fromURL(dataUrl))
  }
  def main(args: Array[String]): Unit = {
    val either1 = getData(new URL("http://www.xxx.com"))
    val either2 = getData(new URL("https://www.baidu.com"))
    println(either1)
    println(either2)
  }


}
