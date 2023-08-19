package OOP.generics

/**
 * @author Yan
 * @create 2023-08-19 18:21
 * */
class Stack[T] {
  private var elements: List[T] = Nil
  private var count = 0

  def push(x: T) = {
    elements = x :: elements
    count += 1
  }

  def peek: T = elements.head

  def pop(): T = {
    val currentTop = peek
    elements = elements.tail
    count -= 1
    currentTop
  }

  def size(): Int = count

}

object StackExample {
  def main(args: Array[String]): Unit = {
    val stack = new Stack[Int];
    stack.push(1);
    stack.push(2);
    stack.push(3);
    while (stack.size() != 0) println(stack.pop())
  }
}
