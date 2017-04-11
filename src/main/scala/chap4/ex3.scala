package chap4

/**
  * Created by prithvirajbilla on 4/11/17.
  */
object ex3 {
  trait Shape {
    def sides: Int
    def perimeter: Double
    def area: Double
  }

  class Circle(val radius: Double) extends Shape {
    override def sides: Int = Int.MaxValue

    override def perimeter: Double = math.Pi*2*radius

    override def area: Double = math.Pi*radius*radius/2
  }



  trait Rectangular extends Shape {
    val l: Double
    val b: Double
    override def sides: Int = 4

    override def perimeter: Double = 2*(l+b)

    override def area: Double = l*b

  }
  class Rectangle(val l: Double, val b: Double) extends Rectangular
  class Square(val a: Double) extends Rectangular{
    val l = a
    val b = a
  }
}
