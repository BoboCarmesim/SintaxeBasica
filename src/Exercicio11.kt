fun celFaren(celcius: Double): Double {
    return (celcius * 1.8) + 32
}

fun main() {
    val tempCel = 35.0
    val tempF = celFaren(tempCel)

    println("$tempCel°C equivale a $tempF°F")
}