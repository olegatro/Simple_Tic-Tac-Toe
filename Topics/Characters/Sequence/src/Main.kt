fun main() {
    val symbol1: Char = readln().first()
    val symbol2: Char = readln().first()
    val symbol3: Char = readln().first()

    println((symbol1 < symbol2 && symbol2 < symbol3) && (((symbol1 + 1) == symbol2) && ((symbol2 + 1) == symbol3)))
}
