package study.strings

import scala.collection.immutable.StringOps._ 

object WorkWithString {
  
  val str = "scala developer"
  
  // take() --take first elements
  def  takeFirst(i: Int) = str.take(i)  

  // *  --concatenate current string n times
  def curConcat(i: Int) = str.*(2)
  
  // ++  --concatenate two strings
  def concat(s1: String, s2: String) = s1 ++ s2
  
  // < --Returns true if this is less than that(for ordering)
  def thisLessThat (s1: String, s2: String) = s1 < s2
  
  // capitalize --capitalize first char
  def cap = str.capitalize
  
  // charAt --get char by index (gap does not considered)
  def getChar(i: Int) = str.charAt(i)
  
}