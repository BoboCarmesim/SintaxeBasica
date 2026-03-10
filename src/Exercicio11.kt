fun celsiusParaFahrenheit(celsius: Double): Double {
    return (celsius * 1.8) + 32
}

fun main() {
    val tempCelsius = 35.0
    val tempFahrenheit = celsiusParaFahrenheit(tempCelsius)

    println("$tempCelsius°C equivale a $tempFahrenheit°F")
}