package Closures

/**
  * A closure is a function which uses one or more variables declared outside this function.
  *
  * https://en.wikipedia.org/wiki/Closure_(computer_programming)
  * https://www.youtube.com/watch?v=Be6HXqHrU-s
  */
object Closures {

//  val number = 10
  var number = 10

  val add = (x: Int) => {
    x + number
  }

  val add2 = (x: Int) => {
    number = x + number
    number
  }

  def main(args: Array[String]): Unit = {
    println("add(20) = " + add(20))

    number = 100
    println("number = " + number)

    println("add(20)) = " + add(20))

    println("add2(20)) = " + add2(20))
    println("=> number = " + number)
    println("add2(20)) = " + add2(20))
  }

}
