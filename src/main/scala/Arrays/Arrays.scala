package Arrays

/**
  * Basic syntax and capabilities of Arrays in Scala.
  * Arrays are mutable, indexed collections of values.
  * `Array[T]` is Scala's representation.
  *
  * https://www.youtube.com/watch?v=Br7-ry5swIg
  */
object Arrays {
  // Declare a new array 'myarray' with 4 elements of type integer
  val myarray : Array[Int] = new Array[Int](4)
  //
  val myarray2 = new Array[Int](5)
  // Init (allocated) with values
  val myarray3 = Array(1, 2, 3, 4, 5, 6, 8)

  def main(args: Array[String]): Unit = {
    // 0-Indexed
    myarray(0) = 20
    myarray(1) = 50
    myarray(2) = 10
    myarray(3) = 30
    println("myarray = " + myarray) // myarray = [I@365185bd
    // Iterating through array
    println("for (x <- myarray) ...")
    for (x <- myarray) {
      println(x)
    }
    //
    println("for (i <- 0 to (myarray.length - 1)) ...")
    for (i <- 0 to (myarray.length - 1)) {
      println(myarray(i))
    }
    // https://stackoverflow.com/questions/6833501/efficient-iteration-with-index-in-scala
    println("myarray.foreach (println)")
    myarray.foreach (println)

    // Just allocated but not initialized (setting values)
    myarray2.foreach (println)  // by default get default value of type (Integer = 0)

    //
    println("Size of myarray3 = " + myarray3.length)  // = 7

    // Concat arrays
    // https://alvinalexander.com/scala/how-to-merge-sequences-collections-scala-cookbook
    val concat_myarray_myarray3 = myarray ++ myarray3
    println("Concat myarray and myarray3")
    concat_myarray_myarray3.foreach (println)
  }
}
