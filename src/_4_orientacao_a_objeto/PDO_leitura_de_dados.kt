class Pessoa_(val an_nas:Int, var nome:String){
var idade = 2023 - an_nas
    fun saudacao(){
        println("seja bem vindo ${this.nome}")
    }
    fun acordar(x: Boolean = true){
        if(x == true){
            println(" ${this.nome} está acordado")
        } else {
            println("${this.nome} está dormindo")
        }
    }
}
fun main() {
    //objeto |variavel |intancia
    println("Digite o ano em que voce nasceu")
    var x = readlnOrNull()?.toInt() ?: 0
    println("Digite o seu nome completo")
    var y = readln()
    println("voce está acordado")
    //var d = readlnOrNull()?.toBoolean() ?: false
    var d = readln()
var pessoa: Pessoa_ = Pessoa_( x,y)
    println(pessoa.an_nas)
    println(pessoa.nome)
    println("voce tem ${pessoa.idade}")
    pessoa.saudacao()
    if(d == "sim"){
        pessoa.acordar(true)
    } else if (d == "não" || d == "NÂO" || d == "Não"){
        pessoa.acordar(false)
    }

}
