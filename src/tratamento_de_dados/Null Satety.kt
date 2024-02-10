fun main(){
    var str: String? = null
    println(str?.length) //Kotlin identifica e assume o tratamento do erro
    //println(str!!.length) // Eu assumo o erro
    str = "testando minha string"
    println(str!!.length) // Eu assumo o erro
    println("testando meu code")
}

