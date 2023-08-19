package OOP.generics

/**
 * @author Yan
 * @create 2023-08-19 19:47
 * */
class GenericLinkedList[T] {
  private class Node[T] (elem: T) {
    var next: Node[T] = _
    override def toString: String = elem.toString
  }

  private var head: Node[T] = _

  def add(num: T): Unit = {
    val value = new Node(num)
    value.next = head
    head = value
  }

  private def printNodes(value: Node[T]): Unit = {
    if (value != null) {
      println(value)
      printNodes(value.next)
    }
  }

  def printAll(): Unit = printNodes(head)

}

object instanceOfList {
  def main(args: Array[String]): Unit = {
    var list: GenericLinkedList[Int] = new GenericLinkedList[Int]
    list.add(1);
    list.add(4);
    list.add(2);
    list.add(3);
    list.printAll();
  }
}
