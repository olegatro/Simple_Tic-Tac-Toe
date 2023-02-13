fun main() {
    val input = readln().toInt()

    println(
        when (input) {
            1, 3, 4 -> "No!"
            2 -> "Yes!"
            else -> "Unknown number"
        }
    )
}