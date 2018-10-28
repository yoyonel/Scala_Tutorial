package StringInterpolation

object String_Interpolation {
  def main(args: Array[String]): Unit = {
    /**
      * https://www.youtube.com/watch?v=_tLEX80p5-k
      * In Scala it’s common to inject variables in strings like this with the different types of string interpolation:
      *
      * Scala supports basically three kinds of String Interpolation:
      * s String Interpolator -  Prepending s to any string literal allows the usage of variables directly in the string
      *
      * f String Interpolator - Prepending f to any string literal allows the creation of simple formatted strings.
      * It is  similar to C languages style printf .
      * When using the f interpolator, all variable references should be followed by a printf style format string, like %d, %s, %f etc.
      *
      * raw String Interpolator - The raw interpolator is similar to the s interpolator except that it performs “No escaping of literals within the string”
      */
    val name = "yoyo"
    val age = 37
    val f_age = 37.5
    println(name + " is " + age + " years old")

    // s string interpolation
    println(s"$name is $age years old")

    /**
      * f string interpolation
      * var_name + type
      * %s: string
      * %d: int
      * like C syntax (for types)
      */
    println(f"$name%s is $age%d years old")

//    println(f"$name%s is $f_age%d years old") // type mismatch; found: Double required: Int
    println(f"$name%s is $f_age%f years old") // type mismatch; found: Double required: Int

    println(s"Hello \nworld")
    println(raw"Hello \nworld") // raw format: doesn't interpret '\n'
  }
}
