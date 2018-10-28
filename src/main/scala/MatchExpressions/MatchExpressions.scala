package MatchExpressions

object MatchExpressions {
  def main(args: Array[String]): Unit = {
    /**
      * In Scala match expressions are used to select between a list of alternatives
      * same as multiple if-statements or select statement, if you are familiar with java.
      *
      * https://www.youtube.com/watch?v=GuGRsmuczWU
      */
    val age = 37 // OK
    //      val age = 100 // Exception: scala.MatchError: 100

    // Match as statement
    age match {
      case 18 => println(age)
      case 25 => println(age)
      case 30 => println(age)
      case 37 => println(age)

      case _ => println("default")
    }

    // Match as expression
    val result = age match {
      case 18 => age
      case 25 => age
      case 30 => age
      case 37 => age

      case _ => "default"
    }

    println("result = " + result)

    val i = 7
    // Multiple cases
    i match {
      case 1 | 3 | 5 | 7 | 9  => println("i=" + i + " is an odd number")
      case 2 | 4 | 6 | 8 | 10 => println("i=" + i + " is an even number")
    }
  }
}
