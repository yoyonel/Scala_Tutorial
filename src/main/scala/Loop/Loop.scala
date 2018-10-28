package Loop

object Loop {
  def main(args: Array[String]): Unit = {

    for (i <- 1 to 5) {
      println("[to] i using to " + i);
    }

    for (i <- 1 until 5) {
      println("[until] i using to " + i)
    }

    for (i <- 1 to 9; j <- 1 to 3) {
      println("i using multiple ranges " + i + " " + j)
    }

    val lst = List(1, 2, 3, 5, 4, 6, 78, 9, 6, 5)

    for (i <- lst) {
      println("i using list " + i)
    }

    for (i <- lst; if i < 6) {
      println("i using Filters " + i)
    }

    // Loop as an expression -> { } and yield
    val result = for {
      i <- lst
      if i < 6
    } yield {
        i * i
    }
    println("result = " + result)
  }
}
