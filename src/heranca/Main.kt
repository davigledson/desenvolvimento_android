open class Eletronico(marca:String){
    fun ligar(){
        println("ligar")
    }
    fun desligar(){
        println("desligar")
    }
    var modelo:String = "Teste de heraça"
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
}
