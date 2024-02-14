open class eletronicos(var marca:String){
    private fun corrente(ativo:Boolean){

    }
   open fun ligar(){
        corrente (true)
    }
   open fun desligar(){
        corrente(false)
    }



} class PC(marca:String):eletronicos(marca){
     fun salvar(){

        }

    //override é a sobreestrica
    override fun desligar(){
        salvar()
        super.desligar()
    }

    override fun ligar(){
         super.ligar()
    }
}

class SmartTV(marca: String):eletronicos(marca){
    override fun ligar() {
        super.ligar()
    }

    override fun desligar() {
        super.desligar()
    }
}


//sobrecarga de metodos
//escrever a msm nomecratura mas com parametros diferentes
fun salvar(){}
fun  salvar(a:Int){}
fun salvar(a:Int,b:Int){}
fun salvar(a:Int,b:String){}
fun main() {
var pc = PC("dell")
    pc.ligar()
    pc.salvar()
    pc.desligar()

}