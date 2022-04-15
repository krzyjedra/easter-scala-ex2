object EvenFibonacciNumbers extends App {

  def indexFibonacciCalculation(n: Long): Long = {
    if (n <= 0) 0
    else if (n == 1) 1
    else indexFibonacciCalculation(n - 1) + indexFibonacciCalculation(n - 2)
  }

  var sum: Long = 0
    (0 to 35)
    .map(a => indexFibonacciCalculation(a))
    .toList
    .filter(a => a % 2 == 0 && a < 4000000)
    .foreach(sum += _)

  println(sum)
}

