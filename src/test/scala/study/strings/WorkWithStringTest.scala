package study.strings

import org.scalatest._

class WorkWithStringTest extends FlatSpec with Matchers {

    "takeFirst(5)" should "return 'scala'" in {
       WorkWithString.takeFirst(5)  should be("scala")
    }
  
    "curConcat(2)" should "return 'scala developerscala developer'" in {
       WorkWithString.curConcat(2)  should be("scala developerscala developer")
    }
    
    "curConcat()" should "return 'scaladeveloper'" in {
       WorkWithString.concat("scala", "developer")  should be("scaladeveloper")
    }
    
    "compareByLengths()" should "return 'true'" in {
       WorkWithString.thisLessThat("a", "b")  should be(true)
    }
    
    "cap()" should "return 'Scala developer'" in {
       WorkWithString.cap  should be("Scala developer")
    }
    
    "getChar(6)" should "return 'd'" in {
       WorkWithString.getChar(6) should be('d')
    }
    
     "getCharCode(4)" should "return '97'" in {
       WorkWithString.getCharCode(4) should be(97)
    }
     
     "collect1(4)" should "return '97'" in {
       val mixedList = List("a", 1, "b",  42.0)
       WorkWithString.collect1(mixedList) should be(97)
    }
}