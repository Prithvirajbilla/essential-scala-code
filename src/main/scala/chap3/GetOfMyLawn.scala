package chap3

/**
  * Created by prithvirajbilla on 4/10/17.
  */

object GetOfMyLawn {
  case class Director(firstName: String, lastName: String, yearOfBirth: Int)

  case class Film(name: String, yearofRelease: Int, imdbRating: Double, director: Director)

  object Dad {
    def rate(film: Film): Double = {
      film match {
        case Film(_,_,_,Director("clint","eastwoord",_)) => 10.0
        case Film(_,_,_,Director("John","McTiernan",_)) => 7.0
        case _ =>  3.0
      }
    }
  }
}
