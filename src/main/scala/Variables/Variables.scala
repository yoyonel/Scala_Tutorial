package Variables

object Variables {
  def main(args: Array[String]): Unit = {
    // https://www.youtube.com/watch?v=6xRsw_6fc18&t=2s
    /**
      * Data Types Byte : 8 bit signed value. Range from -128 to 127
      * Short : 16 bit signed value. Range -32768 to 32767 Int : 32 bit signed value. Range -2147483648 to 2147483647
      * Long : 64 bit signed value. -9223372036854775808 to 9223372036854775807
      * Float : 32 bit IEEE 754 single-precision float
      * Double : 64 bit IEEE 754 double-precision float Char : 16 bit signed Unicode character. Range from U+0000 to U+FFFF
      * String : A sequence of Chars
      * Boolean : Either the literal true or the literal false Unit: Corresponds to no value : void
      * Null: null or empty reference
      * Nothing : The subtype of every other type; includes no values Any: The supertype of any type; any object is of type
      * Any : Java's Object class
      * AnyRef: The supertype of any reference type
      */

    var a : Int = 12
    a += 30
    println("a: " + a)

    val b: Int = 32
    // b += 10 // error: reassignment to val
    println("b: " + b)

    //var c: Int  // error: local variables must be initialized

    val c = true  // autocast c to Boolean
    println("c: " + c)

    val d = 42.0  // autocast d to Double
    println("d: " + d)

    val e = 42.0f  // autocast e to Float
    println("e: " + e)

    // Multiple expressions for initialized variable/value
    // tempory variables in local scope of initialization
    val x = { val x0 = 10; val x1: Float = 10; x0 + x1}
    // println("x1: " + x1) // not found: value x1
    println("x: " + x)
    // multiple lines expressions
    val y = {
      val y0: Float = 32
      val y1: Float = 10
      y0 + y1
    }
    println("y: " + y)

    // Lazy initialization/load
    lazy val z = 1234
    println("z*2: " + z*2)  // z initialize here when used
  }
}
