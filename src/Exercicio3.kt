fun main (){
    val idade = 13

    val status = if (idade >= 60) {
        println("Idoso")
    } else if (idade >= 12) {
        println("Adolecente")
    } else if (idade >= 18) {
        println("Adulto")
    }else {
        println("Criança")
    }
}