fun main(){
    for(i in 1..20){
        println("${i} ")
    }

    println("\n")
    for(i in 20 downTo 1){ //decrecente
        println("${i} ")
    }
    val str = "Criação de aplicativos Android"

    for(i in str){
        println("${i} ")
    }

    println("\n")

    for(i in 1 ..20 step 2){
        println("${i} ")
    }

    println("\n")
    for(i in 20 downTo  1 step 3){
        println("${i} ")
    }
}

