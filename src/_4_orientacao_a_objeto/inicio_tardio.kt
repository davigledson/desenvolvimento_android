class Robo{
    lateinit var nome:String
    fun ligar(){
    nome = "Iniciando o robo"
    }
    fun iniciar_tardio(){
        if(this::nome.isInitialized){
            nome = "iniciando tardamente"
            println(nome)
        }
    }
}
fun main(){
    var bot:Robo = Robo()
    println(bot.ligar())
    bot.iniciar_tardio()
    println(bot.nome)
}