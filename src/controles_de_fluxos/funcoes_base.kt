fun Impressao(){ //void - funcao sem retorno (retona um procedimento)
    println("Funçao sem parametro e sem retorno")
}
fun soma(a:Int,b:Int):Int{ //funcao com parametro e com retorno do tipo inteiro
    return a+b
}
fun main(){
 Impressao()

    var x = 10
    var y = 10
    println(soma(x,y))
    soma_2(x,y)
}

fun soma_2(a:Int,b:Int){ // funcao com parametro e sem retorno
    println("soma = ${a+b}")
}


