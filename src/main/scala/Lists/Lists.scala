package Lists

/**
  * basic syntax and capabilities of Lists in Scala.
  * Arrays and Lists
  * Arrays are a fixed length and occupy sequential locations in memory.
  * This makes random access (for example, getting the 37th element) very fast--O(1) .
  * Lists are composed of values linked together.
  * All access starts from the head (first element) and follows links. Random access takes linear time.
  * Lists are immutable
  * Lists, like Strings, are immutable
  * Because all access is via the head, creating a “new” list is a fast operation.
  * List operations
  * Basic fast (constant time) operations
  * list.head (or list head) returns the first element in the list
  * list.tail (or list tail) returns a list with the first element removed
  * value :: list returns a list with value appended to the front
  * list.isEmpty (or list isEmpty ) tests whether the list is empty
  * Some slow (linear time) operations
  * list(i) returns the ith element (starting from 0) of the list
  * list.last (or list last) returns the last element in the list
  * list.init (or list init) returns a list with the last element removed
  * This involves making a complete copy of the list
  * list.length (or list length) returns the number of elements in the list
  * list.reverse (or list reverse) returns a new list with the elements in reverse order
  * In practice, the slow operations are hardly ever needed
  *
  * https://www.youtube.com/watch?v=sa32HlWC3f8
  */
object Lists {

  val myList : List[Int] = List(1, 2, 5, 8, 6, 9, 4)
  val names: List[String] = List("bob", "Max", "Tom")
  def main(args: Array[String]): Unit = {
    println(myList)
    println(names)

    // Lists are immutable
//    myList(0) = 0 // Error:(38, 5) value update is not a member of List[Int]

    //
    println(0 :: myList)  // Append a value to myList
    println(myList) // Contains of myList is unchanged

    // Nil : empty List
    println("Nil = " + Nil)
    println(1 :: 5 :: 9 :: Nil) // construct a List from pre-append to Nil

    // First value of the list: head, tail
    println("head of myList = " + myList.head)
    println("tail of myList = " + myList.tail)  // the rest remaining without the head

    // Is Empty ?
    println("myList is empty ? " + myList.isEmpty)

    // Reverse
    println("Reverse myList = " + myList.reverse)

    // Fill List creation
    println(List.fill(5)(2))  // List of 2's (5 times)

    // Max of myList
    println("Max of myList = " + myList.max)

    // Iterate on List
    println("Elements in myList")
    myList.foreach( println )
    // For example sum of elements in myList
    var sum : Int = 0
    myList.foreach(sum += _)
    println("Sum of myList = " + sum)
    // For loop iterate on element on 'names' List
    for (name <- names) {
      println(name)
    }
  }
}
