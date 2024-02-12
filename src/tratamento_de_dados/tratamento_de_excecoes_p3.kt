import java.io.File
import java.io.FileNotFoundException
import java.util.Scanner

fun ler_arquivos(){
 val arquivo = File("C:\\Users\\davig\\Documents\\Java\\desenvolvimento_android\\src\\tratamento_de_dados\\passo_a_passo.txt")
 try {
     Scanner(arquivo).use { l ->
         while(l.hasNext()){
             println(l.next())
         }
         l.close()
     }
 } catch (e: FileNotFoundException){
     println("Falha ao ler o arquivo")
     //e.printStackTrace()

 }
}
fun main() {
    ler_arquivos()
}

