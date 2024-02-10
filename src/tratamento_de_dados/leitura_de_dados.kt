fun main() {
    val s = readLine() //por padrão = string
    var num = readLine()?.toInt() ?: 0
    var num2 = readlnOrNull()?.toInt() ?: 0
    var num3 = readlnOrNull()?.toDouble() ?: 0.0
    var num4 = readlnOrNull()?.toFloat() ?: 0.0f
    var num5 = readlnOrNull()?.toBoolean() ?: false
    println(s+1)
}
