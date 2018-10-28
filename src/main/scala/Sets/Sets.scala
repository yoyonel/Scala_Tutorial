package Sets

/**
  * In Scala sets are the un-ordered collections of unique elements of same data types.
  * Scala Sets can be mutable or immutable.
  *
  * https://www.youtube.com/watch?v=l1pFcHa82L8
  */
object Sets {

  val myset: Set[Int] = Set(1, 2, 5, 7, 9, 4)
  val mymutableset = scala.collection.mutable.Set(1, 2, 5, 7, 9, 4)

  def main(args: Array[String]): Unit = {
    println(myset)
    println(myset + 10) // Unordered insertion
    println(myset(8)) // 8 is in myset ? false
    println(myset(4)) // 4 is in myset ? true

    println("myset.head = " + myset.head)
    println("myset.tail = " + myset.tail)
    println("myset.isEmpty = " + myset.isEmpty)
  }

}
