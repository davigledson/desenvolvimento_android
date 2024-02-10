fun main() {
    var str:String? = null
    str = "Felipe"
    if(str != null){
        println("Caiu no IF")
    }
    str.let {
        println("Caiu na função LET")
    }

}

