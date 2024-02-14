class Matematica(){
    //só pode ter um
    companion object {
        val PI = 3.14
        fun adc(){

        }
        init {
            println("Iniciando compation")
        }
    }
    object objeto1{
        var PI = 3.14
        fun adc(){}
        init {
            println("Iniciando obj 1")
        }
    }
    object objeto2{
        var PI = 3.14
        fun adc(){}
        init {
            println("Iniciando obj 2")
        }
    }
    object objeto3{
        var PI = 3.14
        fun adc(){}
        init {
            println("Iniciando obj 3")
        }
    }
}

fun main() {

    println(Matematica.PI)
    var a:Matematica = Matematica()
   println("Acessando obj ${Matematica.objeto1.PI}")
    println("Acessando obj ${Matematica.objeto2.PI}")
    println("Acessando obj ${Matematica.objeto3.PI}")
    Matematica.PI //companion
    Matematica.PI //obj 01
    Matematica.PI //obj 02
    Matematica.PI //obj 03
    Matematica.PI //não imprime
    Matematica.PI //não imprime

}

