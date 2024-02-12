fun main() {
    //Any, Unit, Nothing
    a( 10)
    b()
}
fun a(valor: Any){
    println("Imprimindo o valor $valor" )
}

fun b():Unit{
    println("Funçao sem retorno (void)" )
}
fun c():Nothing{
    TODO("funcao ainda a ser completada")
    println("Função ainda a ser completada" )
}

