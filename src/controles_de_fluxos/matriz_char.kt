fun main(){
    val linhas = 3
    val colunas = 3
    val matriz: Array<Array<Char>> = Array(linhas){Array(colunas) {' '}}
    var c:Char = 'a'

    for(i in 0 until  linhas){
        for(j in 0 until colunas){
            matriz[i][j] = c
            c++
        }
    }
    println("Matriz:")
    for(i in 0 until  linhas){
        for(j in 0 until colunas){
            println("${matriz[i][j]} ")
        }
        println()
    }

    println("Outra forma de  impressão de Matriz:")
    for( linha in matriz){
        for(valor in linha){
            println("${valor} ")
        }
        println()
    }
}


