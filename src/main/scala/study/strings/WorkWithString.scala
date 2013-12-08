package study.strings

import scala.collection.immutable.StringOps._ 

object WorkWithString {
  
  val str = "scala developer"
  
  //take() --take first elements
  def  takeFirst(i: Int) = str.take(i)  

  //*  --concatenate current string n times
  def curConcat(i: Int) = str.*(2)
  
  //++  --concatenate two strings
  def concat(s1: String, s2: String) = s1 ++ s2
  
  
}