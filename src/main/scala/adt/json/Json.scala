package adt.json

sealed trait Json
final case class JsNumber(value: Double) extends Json
final case class JsString(value: String) extends Json
final case class JsBoolean(value: Boolean) extends Json
case object JsNull extends Json
sealed trait JsSequence extends Json
final case class SeqCell(head: Json, tail: JsSequence) extends JsSequence
case object SeqEnd extends JsSequence
sealed trait JsObject extends Json
final case class ObjectCell(key: String, value: Json, tail: JsObject) extends JsObject
case object ObjectEnd extends JsObject



object Main extends App {
  // TODO: Create and stringify some JsValues
  List
}
