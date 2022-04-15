import org.scalatest._
import flatspec._
import matchers._

class EvenFibonacciNumbersSpec extends AnyFlatSpec with should.Matchers {

 import EvenFibonacciNumbers._

"indexFibonacciCalculation" should "be " in {
indexFibonacciCalculation(3) shouldBe 2
}
}
