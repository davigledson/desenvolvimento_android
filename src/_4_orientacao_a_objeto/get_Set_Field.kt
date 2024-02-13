//funcao SET - atribui um valor ao campo correspondente
//funcao GET - retornar o valor do campo correspondente
//Funçao Field - Evitar chamadas infinitas

class Planeta (var nome:String) {
    private var id = 1
    var tamanho = 1000
    var fala = "terra"
        get() {
            println("Acessando GET")
            return field
        }
        set(value) {
            println("Acessando SET")
            field = value
        }
}
class Planeta2 {
    var nome: String = ""
        get(){
            println("meu valor é $field")
            return field
        }

        set(value){
            if (value ==""){
                println("todo planeta tem um nome")
            } else {
                field = value
            }
        }

}
fun main() {
    var p: Planeta = Planeta("terra")
    println("Imprimido o tamanho ${p.tamanho}")
    var a: Planeta = Planeta("Marte")
    a.fala
    a.fala = "Novo planeta marte"
    a.fala
println("-----------------------------------")
    var p2:Planeta2 = Planeta2()
    p2.nome = ""
    println(p2.nome)
    p2.nome = "Júpiter"
    println(p2.nome)
}
