package chap4

sealed trait Feline {
  val color:String
  val sound: String
}

class Tiger(val color: String) extends Feline {

  override val sound: String = "roar"
}

class Lion(val color: String, val maneSize: Int) extends Feline {
  override val sound: String = "roar"
}

class Panther(val color: String) extends Feline {
  override val sound: String = "roar"
}

class Cat(val color: String, val favouriteFood: String) extends Feline {
  override val sound: String = "meow"
}


