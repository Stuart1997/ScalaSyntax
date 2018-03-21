package syntax

object Syntax extends App {
  val oneTwoThree =  List(1,2,3)
  val fourFiveSix = List(4,5,6)

  def concatenateTwoLists[A](list1: List[A], list2: List[A]): List[A] = {
    val concatenatedList = list1 ::: list2
    concatenatedList
  }

  def mapList(listToMap: List[Int]): List[Int] = {
    val mappedList = listToMap.map(_ * 10)
    mappedList
  }

  class ListType
  case class Integers(intList: List[Int]) extends ListType
  case class Strings(strList: List[String]) extends ListType

  def patternMatching(list: ListType): Any = list match {
    case x: Integers => x.intList.head
    case y: Strings => y.strList.head
    case _ => list
  }

  //I don't think this can be tested as notAString's actual type is not recognised in the specs
  val notAString: String = 59
  implicit def toString(nonString: Any): String = {
    nonString.toString
  }

  trait Game {
    val name: String
    val price: Int
    val platform: List[String]

    def play(name: String): String = {
      s"Now playing: $name"
    }
  }

  case class Singleplayer(name: String, price: Int, platform: List[String], noOfMissions: Int) extends Game
  case class Multiplayer(name: String, price: Int, platform: List[String], maxPlayers: Int) extends Game

  val sp = Singleplayer("Metro Exodus", 40, List("PC", "PS4", "XB1"), 15)
  val mp = Multiplayer("PUBG", 30, List("PC", "XB1"), 100)

  //sp.play(sp.name)
  //mp.play(mp.name)
}
