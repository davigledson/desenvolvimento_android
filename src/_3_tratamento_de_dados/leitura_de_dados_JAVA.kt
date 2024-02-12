import java.util.Scanner

fun ler_int(){
    var scanner = Scanner(System.`in`)
    println("Digite um numero inteiro")
    val num = scanner.nextInt()
    println("Voce digitou: $num" )
    //scanner.close()
}

fun ler_double(){ //no java utliza a virgura em vez do ponto
    var scanner = Scanner(System.`in`)
    println("Digite um numero double")
    val num = scanner.nextDouble()
    println("Voce digitou: $num" )
    //scanner.close()
}

fun ler_string(){
    var scanner = Scanner(System.`in`)
    println("Digite uma  string")
    val num = scanner.next()
    println("Voce digitou: $num" )
    //scanner.close()
}

fun ler_float(){
    var scanner = Scanner(System.`in`)
    println("Digite um numero float")
    val num = scanner.nextFloat()
    println("Voce digitou: $num" )
    //scanner.close()
}
fun ler_boolean(){
    var scanner = Scanner(System.`in`)
    println("Digite um valor boleano")
    val num = scanner.nextBoolean()
    println("Voce digitou: $num" )
    scanner.close()
}
fun main() {
    //ler_int()
    //ler_double()
    ler_string()

    ler_float()
    ler_boolean()
}

