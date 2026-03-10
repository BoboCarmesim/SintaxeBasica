fun main() {
    val numeros = arrayOf(1,2,3,4)
    var soma = 0
    for (num in numeros){
        if (num % 2 == 0){
            soma += num
        }
    }
    println("Soma dos pares é de $soma")
}