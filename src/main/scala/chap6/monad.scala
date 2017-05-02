package chap6

/**
  * Created by prithvirajbilla on 5/2/17.
  */
object monad extends App {

  import scala.util.Try
  val opt1 = Some(1)
  val opt2 = Some(2)
  val opt3 = Some(3)

  val seq1 = Seq(1)
  val seq2 = Seq(2)
  val seq3 = Seq(3)

  val try1 = Try(1)
  val try2 = Try(2)
  val try3 = Try(3)

  println(opt1 ++ opt2 ++ opt3)
  val ans = seq1 ++ seq2 ++ seq3
  println(ans)
}
