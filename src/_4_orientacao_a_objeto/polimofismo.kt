//interface dev{ //interface ou abstract
//    var salario:Float
//    //fun bonus():Float

//class mobile(override var salario:Float):dev{
//    override fun bonus():Float {
//        return salario * 0.7f
//    }
//}
//class game(override var salario: Float):dev{
//    override fun bonus():Float {
//        return salario * 0.6f
//    }
//}
//class back(override var salario: Float):dev{
//    override fun bonus():Float {
//        return salario * 0.5f
//    }
//
//
//}
//SEM POLIMORFISMO
//fun mostrar_bonus(m:mobile){
//    println(m.bonus())
//}
//fun mostrar_bonus(g:game){
//    println(g.bonus())
//}
//fun mostrar_bonus(b:back){
//    println(b.bonus())
//}

//COM POLIMORFISMO
//fun mostrar_bonus(d:dev){
//    println(d.bonus())
//}
//
//}
abstract class dev(var salario:Float) {

    abstract fun bonus():Float
    class mobile(salario: Float) : dev(salario) {
        override fun bonus(): Float {
            return salario * 0.7f
        }
    }

    class game(salario: Float) : dev(salario) {
        override fun bonus(): Float {
            return salario * 0.6f
        }
    }

    class back(salario: Float) : dev(salario) {
        override fun bonus(): Float {
            return salario * 0.5f
        }
    }


}
//COM POLIMORFISMO
fun mostrar_bonus(d:dev){
    println(d.bonus())
}
fun main() {
    mostrar_bonus(dev.game(1000f))
    mostrar_bonus(dev.back(1000f))
    mostrar_bonus(dev.mobile(1000f))

}
