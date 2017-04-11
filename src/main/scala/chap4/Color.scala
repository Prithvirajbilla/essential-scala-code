package chap4

sealed trait Color {
  val r:Double
  val g:Double
  val b:Double


  def isLight:Boolean = (0.2126 *r + 0.7152*g + 0.0722*b) < 255/2
  def isDark:Boolean = !isLight

}

case object Red extends Color {
  override val r: Double = 255
  override val g: Double = 0
  override val b: Double = 0
}

case object Yellow extends Color {
  override val r: Double = 255
  override val g: Double = 255
  override val b: Double = 0
}

case object Pink  extends Color {
  override val r: Double = 255
  override val g: Double = 192
  override val b: Double = 203
}


case class CustomColor(r:Double,g:Double,b:Double) extends Color

