package chap3

class Director(val firstName: String,
               val lastName: String,
               val yearOfBirth: Int) {
  def name = firstName + " " + lastName
}

object Director {
  def apply(firstName: String, lastName: String, yearOfBirth: Int): Director =
    new Director(firstName, lastName, yearOfBirth)

  def older(director1: Director, director2: Director): Director =
    if (director1.yearOfBirth < director2.yearOfBirth) director1 else director2
}

class Film(val name: String,
           val yearofRelease: Int,
           val imdbRating: Double,
           val director: Director) {
  def directorsAge = 2017 - director.yearOfBirth + 1

  def isDirectedBy(thatDirector: Director): Boolean =
    if (director.name == thatDirector.name && director.yearOfBirth == thatDirector.yearOfBirth)
      true
    else false

}

object Film {
  def apply(name: String,
            yearOfRelease: Int,
            imdbRating: Double,
            director: Director): Film =
    new Film(name, yearOfRelease, imdbRating, director)

  def newer(film1: Film, film2: Film): Film =
    if (film1.yearofRelease < film2.yearofRelease) film1 else film2

  def highestRating(film1: Film, film2: Film): Double = {
    val rating1 = film1.imdbRating
    val rating2 = film2.imdbRating
    if (rating1 > rating2) rating1 else rating2
  }

  def oldestDirectorAtTheTime(film1: Film, film2: Film): Director =
    if (film1.directorsAge > film2.directorsAge) film1.director
    else film2.director
}

object ExampleFilm extends App {
  val eastwood = new Director("Clint", "Eastwood", 1930)
  println(eastwood.name)
}
