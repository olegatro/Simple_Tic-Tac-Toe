fun main() {
    val string: String = readln()
    val result = string[string.lastIndex] + string.substring(1, string.lastIndex) + string[0]

    println(result)
}