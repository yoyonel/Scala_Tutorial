package String

/**
  * Scala String can be defined as a sequence of characters.
  * Java classes are available in Scala,
  * hence Scala makes use of java strings(java.lang.String) without creating a separate string class.
  *
  * https://www.youtube.com/watch?v=WQTbZ4vk4CY
  */
object String {

  val str1: String = "Hello World"
  val str2: String = " YoYo"

  def main(args: Array[String]): Unit = {
    // String.length()
    println("len(\"" + str1 + "\") = " + str1.length)
    // String.concat(...)
    println(str1.concat(str2))
    println(str1 + str2)

    // Format strings
    val num1 = 75
    val num2 = 100.25
    val result = printf("(%d -- %f -- %s)", num1, num2, str1)
    println(result)
    printf("(%d -- %f -- %s)", num1, num2, str1)
    println("(%d -- %f -- %s)".format(num1, num2, str1))
  }

}
