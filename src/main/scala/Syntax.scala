package syntax

object Syntax extends App {
  val oneTwoThree =  List(1,2,3)
  val fourFiveSix = List(4,5,6)

  def concatenateTwoLists[A](list1: List[A], list2: List[A]): List[A] = {
    val concatenatedList = list1 ::: list2
    concatenatedList
  }
  val oneToSix = concatenateTwoLists(oneTwoThree, fourFiveSix) //1,2,3,4,5,6

  def mapList(listToMap: List[Int]): List[Int] = {
    val mappedList = listToMap.map(_ * 10)
    mappedList
  }
  val tenToSixty = mapList(oneToSix) //10,20,30,40,50,60
}
