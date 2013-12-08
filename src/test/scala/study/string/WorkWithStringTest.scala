package study.string

import collection.mutable.Stack
import org.scalatest._

class WorkWithStringTest extends FlatSpec with Matchers {

    "takeFirst" should "return 'scala'" in {
       WorkWithString.takeFirst(5)  should be("scala")
    }
  
}