interface Selvagem{
     fun atacar(){
         println("o animal está preste a atacar")
     }
}
interface quatro_patas{
    fun locomocao(){
        println("O animal locomove em 4 patas")
    }
}
//interface não tem inicializadores de variaveis
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
//kottin não permite heranças multiplas
class dog(nome:String):mamifero(nome),Selvagem, quatro_patas{
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

    override fun atacar() {
        println("O cachorro está atacando")
    }
}
fun main() {
var d:dog = dog("cachorro")
    d.tempo()
    d.acordar()
    d.alimentacao()
    d.habitar()
    d.atacar()
    d.locomocao()
}