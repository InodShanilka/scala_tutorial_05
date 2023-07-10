import scala.io.StdIn.readInt
object q6 {
  def main(args: Array[String]): Unit = {
    print("Enter a number to get fibonacci sequence : ")
    var number = readInt()
  fibonacciSeq((number))
  }

  def fibonacci(num:Int): Int = num match{
    case 0 => 0
    case 1 => 1
    case _ => fibonacci(num -1) + fibonacci(num -2)
  }
  def fibonacciSeq(num: Int): Unit = {
    if(num>0) fibonacciSeq(num-1)
    println(fibonacci(num))
  }
}
