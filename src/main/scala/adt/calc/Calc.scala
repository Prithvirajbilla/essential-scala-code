package adt.calc

sealed trait Calc
final case class Success(result: Int) extends Calc
final case class  Failure(reason: String) extends Calc
// TODO: Implement Calc

object Interpreter extends Calc{
  // TODO: Implement a simple interpreter for Calc
  def square(x: Double) = x*x
  def cube(x: Double) = x*square(x)
}

object Main extends App {
  // TODO:
  // - Calculate and print: 1.1 + 2.2 * 3.3
  // - Calculate and print: 1.1 * 2.2 + 3.3

  // TODO:
  // - Implement squaring a number using Calc
  // - Use your implementation to calculate 1.1 * 1.1
  Interpreter.square(1.1)

  // TODO:
  // - Implement pythagoras' theorem using Calc
  // - Use your implementation to calculate the hypotenuse of a 3x4 triangle


  // TODO:
  // - Implement factorials using Calc
  // - Use your implementation to calculate 10!
}
