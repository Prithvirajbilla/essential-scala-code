package chap4

/**
  * Created by prithvirajbilla on 4/11/17.
  */

case class Finite(res: Int) extends DivisionResult
case class Infinite() extends DivisionResult

sealed trait DivisionResult


object divide {

  def apply(a: Int,b:Int): DivisionResult = if (b == 0) Infinite() else Finite(a/b)

}
