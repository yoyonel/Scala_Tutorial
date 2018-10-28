package If_Else_Statements

object If_Else_Statements {
  def main(args: Array[String]): Unit = {
    val x = 20

    var res = ""

    if (x == 20) {
      res = "x == 20"
    }
    else {
      res = "x != 20"
    }

    println(res)

    println(if (x != 20) "x != 20" else "x == 20")
  }
}
