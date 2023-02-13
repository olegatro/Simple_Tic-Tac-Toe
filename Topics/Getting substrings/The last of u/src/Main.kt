fun main() {
    val string = readln()
    val firstSubstring = string.substringBeforeLast('u')
    val lastSubstring = string.substringAfterLast('u').uppercase()

    val result = firstSubstring + "u" + lastSubstring

    println(result)
}