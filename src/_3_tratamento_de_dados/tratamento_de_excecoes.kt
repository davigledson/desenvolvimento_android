import kotlin.math.sqrt

fun main() {
    val numerador = 10
    val denominador = 0
    try {
     val res = numerador/denominador
     println("Resultado da divisçao: $res")
    }catch (e: ArithmeticException){
        println("Erro: não existe divisão por zero!")
    }
    val numero = -4.0

    try {
        val res2 = sqrt(numero)
        if(numero <0){
            throw IllegalArgumentException()
        }
        println("Resultado da radiciação $res2")
    }catch (e: IllegalArgumentException){
        println("Não existe raiz real de numeros negativos")
    }

}
