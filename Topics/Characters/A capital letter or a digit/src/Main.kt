fun main() {
    val letter = readln()

    println(letter in "A".."Z" || letter in "1".."9")
}