package chap3

/**
  * Created by prithvirajbilla on 4/10/17.
  */
class Counter(val n: Int) {
  def inc(i:Int = 1) = new Counter(n+i)
  def dec(i: Int = 1) = new Counter(n-i)
  def count = n
  def adjust(adder: Adder) = new Counter(adder.add(n))
}
class Adder(amount: Int) {
  def add(in: Int) = in + amount
}

object ExampleCounter extends App {
  val ans = new Counter(10).inc().dec().inc().inc().count
  println(ans)
}
