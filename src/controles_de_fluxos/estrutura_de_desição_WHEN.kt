fun main(){
    var cargo:String = "gerente"
    when(cargo){
        "presidente" -> println(6000f)
        "gerente" -> println(4500f)
        "presidente" -> println(3000f)
        "coordenador" -> println(3000f)
        "analista" -> println(3000f)
        "estagiario" -> println(3000f)
        else -> println("Cargo não identificado")

    }

    var imc:Float = 30f
    when(imc){
        10f -> println("imc está 10 ou abaixo")
        20f -> println("imc está 20 ou maior que 11")
        30f -> println("imc está 30 ou maior que 21")
        else -> println("IMC está acima do normal")

    }

}

