import kotlin.math.sqrt

fun main() {
    try {
        var s:String? = null
        //s = "davi"
        println("O tamanho do String e: ${s!!.length}")

        var a:Int = 10/0
        println("o resultado é $a")

        var b = -9.0
        var c:Double = sqrt(b)
        if (b< 0){
            throw IllegalArgumentException()
        }

        var x = 1
        if(x == 1){
            throw  Exception(" o valor de x não pode ser 1")
        }

    } catch (e: NullPointerException){
        println("A variavel está vazia")
    } catch (e: ArithmeticException){
        println("não existe divisão por zero")
    } catch (e: IllegalArgumentException){
        println(" não existe raiz de numero negativo")
    } catch (e: Exception){
        println("Exececao mais geral")
        println(e.message)
    } finally {
        //finally vai executar sempre
        println("finalizando o bloco de tratamento de dados")
    }

}
