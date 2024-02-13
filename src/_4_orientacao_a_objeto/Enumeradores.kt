enum class Prioridade{
    baixo,medio,alto

}
fun x(p:Prioridade){
}
enum class Animais{
    gato,cachorro, tucano
}

enum class Prioridade2(val v:Int){
    B(0), M(7), A(10)
}

enum class Prioridade3(val value:Int){
    A(10){
        override fun toString(): String{
            return "Prioridade Alto com o valor $value"
        }
    },
    B(5){
        override fun toString(): String{
            return "Prioridade Media com o valor $value"
        }
    },
    C(0){
        override fun toString(): String{
            return "Prioridade Baixa com o valor $value"
        }
    }

}

fun main(){
    x(Prioridade.alto) //forma de acessar um valor de uma classe do tipo Enum
    for(p in Prioridade.entries) //values
    {
            println("$p ")
    }
    println()
    for(p in Animais.values()){
        println("$p ")
    }
    println()
    for(p in Prioridade2.values()){
        println(" $p = ${p.v} ")
    }
    println()
    for(p in Prioridade3.entries){
        println("$p ")
    }

}