private class F(){ //estara disponivel somente no arquivo
    var teste = "Clases F privada"
}
open class Eletronico(marca:String){
    //public, private, protected
    private fun ativarCorrente(){ //estára disponivel somente na classe a que pertence

    }
   protected fun relogio(){
        println("classes associadas ")
    }
    fun ligar(){
        println("ligar")
    }
    fun desligar(){
        println("desligar")
    }
    var modelo:String = "Teste de heraça"
    private var f:String = "variavel privada"
}
class Computador(marca:String):Eletronico(marca){
    fun instalarSofware(){
        println("instalando")
    }
    fun Varredura(){
        println("Varrendo")

    }
}

fun main() {
    var c:Computador = Computador("Dell")
    c.ligar()
    c.Varredura()
    c.instalarSofware()
    println(c.modelo)
    //c.ativarCorrente
    var t:F = F()
    println(t.teste)
}
