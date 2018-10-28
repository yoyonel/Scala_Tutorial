package PartiallyApplyFunctions
import java.util.Date

/**
  * https://www.youtube.com/watch?v=afOjfMiicxI&t=97s
  */
object PartiallyApplyFunctions {

  def log(date: Date, msg: String) : Unit = {
    println(date + "   " + msg)
  }

  def main(args: Array[String]): Unit = {
    val sum = (a: Int, b: Int, c: Int) => a + b + c

    // Fix first 2 arguments
    val f = sum(10, 20, _: Int)

    // Fix first argument
    val f2 = sum(10, _: Int, _: Int)

    println(sum(10, 20, 30))
    println(f(30))
    println(f2(20, 30))

    val date = new Date()
    val newLog = log(date, _ : String)
    newLog("Message 1")
    newLog("Message 2")
    newLog("Message 3")
  }
}
