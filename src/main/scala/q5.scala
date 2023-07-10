import scala.io.StdIn.readInt
object q5 {
  def main(args: Array[String]): Unit = {
    print("Enter a number to get the addition of all even numbers till : ")
    var number = readInt()
  print(sumEven(number))
  }

  def sumEven(num: Int): Int = {
      if (num >= 0) {
        if (num % 2 == 0) num + sumEven(num - 2)
        else sumEven(num - 1)
      }
      else return 0
  }
}
