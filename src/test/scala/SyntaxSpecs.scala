import org.scalatest.{FlatSpec, Matchers, WordSpec}
import syntax._

class SyntaxSpecs extends WordSpec with Matchers {
  "concatenateTwoLists" should {
    "initialise a new list by combining two existing lists using ::: to concatenate them" in {
      val oneAndTwo = List(1,2)
      val threeAndFour = List(3,4)
      val result = Syntax.concatenateTwoLists(oneAndTwo, threeAndFour)
      val expectedResult = List(1,2,3,4)

      result shouldBe expectedResult
    }
  }

  "mapList" should {
    "iterate through each element in the list and perform a multiplication on each" in {
      val sixNumbers = List(1, 2, 3, 4, 5, 6)
      val result = Syntax.mapList(sixNumbers)
      val expectedResult = List(10, 20, 30, 40, 50, 60)

      result shouldBe expectedResult
    }
  }
}
