fun vetor_inteiros(){
    var numeros = intArrayOf(0,1,2,3,4,5,6,7,8,9)
    for (i in 0..numeros.size-1){
        print("${numeros[i]} ")
    }
    print("acessando o numero ${numeros[6]}")
}
fun vetor_inteiros2(){
    var n = Array(10,{i->i})
    for (i in n){
        print("${n[i]} ")
    }
}

fun vetor_str(){
var a = arrayOf("Fortaleza", "São Paulo","Barauna ")
    for (i in 0 .. (a.size-1)){
        print("${a[i]} ")
    }
    print("\n")
    println("Acessando o primeiro elemento ${a[1]}")
}
fun vetor_bool(){
    var a = booleanArrayOf(true,false,true,false)
    for (i in  0 ..(a.size-1)){
        print("${a[i]} ")
    }
}
fun main(){
 vetor_inteiros()
    println("\n")
    vetor_inteiros2()
    println("\n")
    vetor_bool()
    println("\n")
    vetor_str()

}
