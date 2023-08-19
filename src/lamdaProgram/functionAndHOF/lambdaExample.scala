package lamdaProgram.functionAndHOF

/**
 * @author Yan
 * @create 2023-08-19 20:07
 * */
object lambdaExample {
  def main(args: Array[String]): Unit = {
//    val money = transferMoney(100, amount => amount * 0.05)
//    println(money)
  }


}

object Test1 {
  def main(args: Array[String]): Unit = {
//    applyFuncOnRange(1, 10, quarterMaker)
    println(transferMoney(100, bankFee))
  }
  def bankFee(amount: Double): Double = amount * 0.05

  def transferMoney(money: Double, bankFee: Double => Double): Double = {
    money + bankFee(money)
  }

  def quarterMaker(value: Int): Double = value.toDouble / 4

  def addTwo(value: Int): Int = value + 2

  def applyFuncOnRange(begin: Int, end: Int, func: Int => AnyVal): Unit = {
    for (i <- begin to end)
      println(func(i))
  }



}

object Test2 {
  def main(args: Array[String]): Unit = {
    val returnFunc = transferMoney(2000)
    println(returnFunc(1000))
  }

  def transferMoney(money: Double) = {
    if (money > 1000)
      (money: Double) => "add Fee: " + money * 0.05
    else
      (money: Double) => "add Fee: " + money * 0.1
  }
}
object curryImplement extends Curry {
   def curry[A, B, C](f: (A, B) => C): A => B => C = (a: A) => (b: B) => f(a, b)

   def uncurry[A, B, C](f: A => B => C): (A, B) => C = (a: A, b: B) => f(a)(b)
}

trait Curry {
  def curry[A, B, C] (f: (A, B) => C): A => B => C
  def uncurry[A, B, C] (f: A => B => C): (A, B) => C
}

object Test3 {
  def main(args: Array[String]): Unit = {
    def add(x: Int, y: Long): Double = x.toDouble + y

    val addSpicy = curryImplement.curry(add)
    println(addSpicy(2)(3L))
    val increment = addSpicy(2)
    println(increment(1L))
    val unspicedAdd = curryImplement.uncurry(addSpicy)
    println(unspicedAdd(1, 3L))
  }
}

