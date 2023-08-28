def calculateAverage(temperaturesCelsius: List[Double]): Double = {
  val temperaturesFahrenheit = temperaturesCelsius.map(c => (c * 9/5) + 32)
  val totalFahrenheit = temperaturesFahrenheit.reduce(_ + _)
  totalFahrenheit / temperaturesCelsius.length
}

// Example usage
val temperaturesCelsius = List(0, 10, 20, 30)
val averageFahrenheit = calculateAverage(temperaturesCelsius)
println(s"Average Fahrenheit temperature: $averageFahrenheit")
