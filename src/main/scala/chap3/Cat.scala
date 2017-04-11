package chap3

class Cat(val name: String, val color: String, val food: String)

object Example{
  val oswald = new Cat("Oswald","Black","Milk")
  val henderson = new Cat("Henderson","Ginger","chips")
  val quentin = new Cat("quentin","Tabby and white","curry")
}


object Chipshop {
  def willServe(cat: Cat): Boolean = {
    if(cat.food == "chips") true
    else false
  }
}

