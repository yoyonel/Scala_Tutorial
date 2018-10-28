package Functions

/**
  * Scala is a functional language, in the sense that every function is a value.
  * If functions are values, and values are objects, it follows that functions themselves are objects.
  *
  * https://www.youtube.com/watch?v=Tadg1OVTH5E&t=1s
  */
object Functions {
  /**
    *
    * @param x: first integer argument
    * @param y: second integer argument
    * @return
    */
  def add(x: Int, y: Int) : Int = {
//    return x + y  // Keyword return is redundant
    x + y
  }

  def subtract(x: Int, y: Int) : Int = {
    x - y
  }

  def multiply(x: Int, y: Int) : Int = x * y

  def divide(x: Int, y: Int) : Int = x / y

  object Math {
    def add(x: Int, y: Int) : Int = x + y

    def square(x: Int) : Int = x * x
  }

  def main(args: Array[String]): Unit = {
    println(add(32, 10))
    println(subtract(52, 10))
    println(multiply(21, 2))
    println(divide(84, 2))

    // because that an object, we don't have to initialize the object before using the function (inside, add)
    println(Math.add(32, 10))
    // Syntaxical sugar
    println(Math square 6)
  }
}
