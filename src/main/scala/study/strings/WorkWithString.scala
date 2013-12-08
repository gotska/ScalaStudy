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
  
  //codePointAt --get symbol code
   def getCharCode(i: Int) = str.codePointAt(i)
   
  //collect
  def collect1(l: List[Any]):List[String] = { 
 
   val mixedList = List("a", 1, "b",  42.0)          //> mixedList  : List[Any] = List(a, 1, b, 42.0)

	val results = mixedList collect {
	  case s: String => "String:" + s
	  case i: Int => "Int:" + i.toString
	}
   results
  }
  
}