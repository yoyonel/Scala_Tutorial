package HigherOrderFunctions

/**
  * Higher-order functions in Scala are those functions that take other functions as parameters,
  * or whose result is a function (i.e are able to return functions) or do both. e.g. map & filter in Scala.
  *
  * Higher-order functions are able to take function an argument and return function as result
  * https://en.wikipedia.org/wiki/Higher-order_function
  */
object HigherOrderFunctions {

  def math(x: Double, y: Double, f: (Double, Double)=>Double): Double = f(x, y)

  def math2(x: Double, y: Double, z: Double, f: (Double, Double)=>Double): Double = f(f(x, y), z)

  def main(args: Array[String]): Unit = {
    val result_add = math(32, 10, (x, y)=>x + y)
    println(result_add)
    val result_mul = math(32, 10, (x, y)=>x * y)
    println(result_mul)
    val result_min = math(32, 10, (x, y)=>x min y)
    println(result_min)
    val result_max = math(32, 10, (x, y)=>x max y)
    println(result_max)

    val result_math2 = math2(32, 5, 5, (x, y)=>x+y)
    println(result_math2)

    // Wildcard '_' notation
    // => Add "something" with "something" ("something" = _)
    val result_math2_wildcard = math2(32, 5, 5, _ + _)
    println(result_math2_wildcard)
  }
}
