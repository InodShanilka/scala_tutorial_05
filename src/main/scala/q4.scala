import scala.io.StdIn.readInt
object q4 {
  def main(args: Array[String]): Unit = {
    print("Enter a number to determine odd or even : ")
    var number = readInt()
    determine(number)
  }

  def determine(num:Int): Unit = {
    if (num == 0) print("Even")
    else if (num == 1) print("Odd")
    else determine(num - 2)
  }
}
