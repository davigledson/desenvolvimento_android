fun main() {
    var str:String? = null
    str = "davi"
    if( str == null){
        println("Variavel nula")
    } else {
        println(str)
    }

    //operador Elvis
    println(str ?: "nula") //semelhante ao operador ternario
}

