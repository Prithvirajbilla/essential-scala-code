package chap6

/**
  * Created by prithvirajbilla on 5/2/17.
  */
object SetOperations extends  App {

  def union(first: Set[Int], second: Set[Int]): Set[Int] = {
    first.foldLeft(second){ (set, elt) => (set + elt) }
  }
  def union[A](map1: Map[A, Int], map2: Map[A, Int]): Map[A, Int] = { map1.foldLeft(map2){ (map, elt) =>
    val (k, v) = elt
    val newV = map.getOrElse(k, v)
    map + (k -> newV)
  } }
}
