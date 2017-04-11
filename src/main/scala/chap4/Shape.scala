package chap4


/**
  * Created by prithvirajbilla on 4/11/17.
  */
trait Shape {
  def sides: Int
  def perimeter: Double
  def area: Double
}

case class Circle(radius: Double) extends Shape {
  override def sides: Int = Int.MaxValue

  override def perimeter: Double = math.Pi*2*radius

  override def area: Double = math.Pi*radius*radius/2
}


case class Rectangle(l: Double, b: Double) extends Shape {
  override def sides: Int = 4

  override def perimeter: Double = 2*(l+b)

  override def area: Double = l*b
}

case class Square(a: Double) extends Shape {
  override def sides: Int = 4

  override def perimeter: Double = 4*a

  override def area: Double = a*a
}


object Draw {
  def apply(shape: Shape): String = shape match  {
    case Circle(radius) => s"A circle of radius $radius"
    case Rectangle(l,b) => s"A rectangle of width $l cm and height $b cm"
    case Square(a) => s"A square of side $a cm"

  }
}