import scala.io.StdIn.readInt
object q2 {
    def main(args: Array[String]): Unit = {
      print("Enter a number to get the prime sequence : ")
      var number = readInt()
      primeSeq(number)
    }

    def GCD(a:Int,b:Int): Int = b match{
      case x if x==0 => a
      case x if x>a => GCD(x,a)
      case x => GCD(x,a%x)
    }
    def prime(p:Int,n:Int=2): Boolean = n match{
      case x if x==p => true
      case x if GCD(p,x)>1 => false
      case x => prime(p,x+1)
    }
    def primeSeq(n:Int): Unit = {
      if (n>1) {
        for(a <- 2 to n)
          if (prime(a) == true) println(a)
      }
      else println("No prime numbers")

    }

}
