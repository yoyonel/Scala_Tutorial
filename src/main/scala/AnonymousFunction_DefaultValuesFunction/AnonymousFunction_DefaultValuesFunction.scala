package AnonymousFunction_DefaultValuesFunction

/**
  * Scala is a functional language, in the sense that every function is a value.
  * If functions are values, and values are objects, it follows that functions themselves are objects.
  * Functions in Scala are treated as first class citizens.
  * In this video we will kook at Scala - Default Parameter Values for a Functions and Anonymous Functions.
  *
  * https://www.youtube.com/watch?v=CHc_hzNKYOI
  */
object AnonymousFunction_DefaultValuesFunction {
  object Math {
    def add(x: Int = 32, y: Int = 10) : Int = x + y
    def square(x: Int) : Int = x * x

    def +(x: Int = 32, y: Int = 10) : Int = add(x, y)
    def **(x: Int) : Int = square(x)
  }

  // Doesn't return anything => Unit describe this (~ void)
  def print(x: Int, y: Int) : Unit = {
    println(x+y)
  }

  def main(args: Array[String]): Unit = {
    println(Math.add()) // x=default(x)=32, y=default(y)=10
    println(Math.add(42)) // x=42, y=default(y)=10
    println(Math square 6)

    print(100, 200)

    println(Math.+())   // 32 + 10
    println(Math.**(7)) // 49
    println(Math ** 8)  // 64

    // Declare a functor
    // Using anonymous function (notation: '=>')
    val add = (x : Int, y : Int) => x + y
    println(add(32, 10))
  }
}
