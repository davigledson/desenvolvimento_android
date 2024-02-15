abstract class mamifero(var nome:String){
    //serve como models para outras classes( herança)
    abstract fun habitar()
    abstract fun fale()
    abstract fun acordar()
    abstract fun alimentacao()
    fun tempo(){
        println("tempo de vida do $nome")
    }


}

class dog(nome:String):mamifero(nome){
    override fun alimentacao() {
        println("alimentacao do cachorro")
    }

    override fun habitar() {
       println("habitat do cachorro")
    }

    override fun fale() {
       println("au au")
    }

    override fun acordar() {
        println("cachorro acordando")
    }
}
fun main() {
var d:dog = dog("cachorro")
    d.tempo()
    d.acordar()
    d.alimentacao()
    d.habitar()
}