package chap4

sealed trait IntList {
  def length: Int = this match {
    case End => 0
    case Pair(head, tail) => 1 + tail.length
  }
}

final case object End extends IntList
final case class Pair(head: Int, tail: IntList) extends IntList


sealed trait Tree

final case class Node(l: Tree, r: Tree) extends Tree

final case class Leaf(element: Int) extends Tree


object Tree {
  def sum(tree: Tree): Int = {
    tree match {
      case Leaf(element) => element
      case Node(l,r) => sum(l)+ sum(r)
    }
  }

  def double(tree: Tree): Tree = {
    tree match {
      case Leaf(element) => Leaf(2*element)
      case Node(l,r) => Node(double(l),double(r))
    }
  }
}

