fun main() {
    val input = readln()

    println(
        when (input) {
            "gryffindor" -> "bravery"
            "hufflepuff" -> "loyalty"
            "slytherin" -> "cunning"
            "ravenclaw" -> "intellect"
            else -> "not a valid house"
        }
    )
}