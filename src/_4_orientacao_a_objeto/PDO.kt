class Pessoa(val an_nas:Int, var nome:String){
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
var pessoa: Pessoa = Pessoa( 2003,"davi")
    println(pessoa.an_nas)
    println(pessoa.nome)
    println("voce tem ${pessoa.idade}")
    pessoa.saudacao()
    pessoa.acordar(false)
}
