object EvenFibonacciNumbers extends App {

  def indexFibonacciCalculation(n: Long): Long = {
    if (n <= 0) 0
    else if (n == 1) 1
    else indexFibonacciCalculation(n - 1) + indexFibonacciCalculation(n - 2)
  }

  def fibonacciList(n: Long): List[Long] = {
    if (n <= 0) Nil
    else if (n == 1) List(indexFibonacciCalculation(0))
    else if (n == 2) List(indexFibonacciCalculation(n - 2), indexFibonacciCalculation(n - 1))
    else (n == 3) List(indexFibonacciCalculation(n ))
  }

 print(fibonacciList(5))

//  val fibonacciNumbers = List.range(0, 4000000)

//  def fibonacciSum()
  //    if (n < 4000000) ???
  //    else ???
  //    val fibonacciList = List(1,2,3,5,8,13)
  //    var sum = 0
  //    val a = fibonacciList.filter(a => a % 2 == 0).foreach(sum += _)

}

