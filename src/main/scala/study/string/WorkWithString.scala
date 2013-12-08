package study.string

import scala.collection.immutable.StringOps._ 

object WorkWithString {
  
  val str = "scala developer"
  
  //take() --take first elements
  def  takeFirst(i: Int) = str.take(i)  

  //*  --concatenate current string n times
  def curConcat(i: Int) = str.*(2)
}