import scala.io.StdIn.readInt
object q3 {
  def main(args: Array[String]): Unit = {
    print("Enter a number to get the addition till : ")
    var number = readInt()
    print(sum(number))
  }

  def sum(num:Int): Int = {
    if (num <= 0)  return 0
    else num + sum(num-1)

  }
}
