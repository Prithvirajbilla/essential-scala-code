package chap4

/**
  * Created by prithvirajbilla on 4/11/17.
  */
object ex444 {

  sealed trait TrafficLight {
    def next: TrafficLight
  }

  case object Red extends TrafficLight {
    override def next: TrafficLight = Green
  }
  case object Green extends TrafficLight {
    override def next: TrafficLight = Yellow
  }
  case object Yellow extends TrafficLight {
    override def next: TrafficLight = Red
  }

  sealed trait Calculation
  final case class Success(result: Int) extends Calculation
  final case class  Failure(reason: String) extends Calculation

  object Calculator {
    def +(calc: Calculation, operand: Int): Calculation =
      calc match {
        case Success(result) => Success(result + operand)
        case Failure(reason) => Failure(reason)
      }
    def -(calc: Calculation, operand: Int): Calculation =
      calc match {
        case Success(result) => Success(result - operand)
        case Failure(reason) => Failure(reason)
      } }

}
