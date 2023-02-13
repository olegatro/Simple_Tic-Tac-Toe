fun main() {
    val n: Int = readln().toInt()
    var result: Int = 0
    var first: Int = 0
    var second: Int = 0

    if (n == 1) {
        result = readln().toInt()
    }

    if (n > 1) {
        repeat(n) {
            val number: Int = readln().toInt()

            if (number > first) {
                second = first
                first = number
            } else if (number > second) {
                second = number
            }
        }

        result = first * second
    }

    println(result)
}
