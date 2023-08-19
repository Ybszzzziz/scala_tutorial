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
    value.next = head;
    head = value
  }

}
