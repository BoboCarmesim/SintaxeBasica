fun main() {
    val numeros = arrayOf(5,8,2,10,3)
    var maior =  numeros[0]
    for (num in numeros){
        if (num > maior){
            maior = num
        }
    }
    println("Maior numero é $maior")
}