class OBJ{
    fun amanhecer(n:Int){
        if(n<4 && n>=0){
            println("Está de madrugada")
        } else{
            println("Está de dia")
        }
    }
    fun acordar(a:Int){
        if (a ==0){
        println("Está dormindo")

        } else{
            println("Está acordado")
        }
    }
}
fun main() {
    var obj:OBJ = OBJ()
    obj.amanhecer(1)
    obj.acordar(0)
    println("----------------------------------")
    with(obj){
        amanhecer(1)
        acordar(0)
    }
}