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
}