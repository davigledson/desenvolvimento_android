class Silvestre (var nome:String){
 var atk:Int = 0
    //construtor secundario
    constructor(nome:String, atak:Int):this(nome){
        this.atk = atak
    }

    fun ap(){
        println("meu animal é ${this.nome} e seu ataque é ${this.atk}")
    }

}
fun main() {
    var s1 = Silvestre("agora")
    var s2 = Silvestre("serpente",1000)
    s1.ap()
    s2.ap()
}