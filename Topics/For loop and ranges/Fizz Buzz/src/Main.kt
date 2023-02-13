fun main() {
    val rangeStart: Int = readln().toInt()
    val rangeEnd: Int = readln().toInt()

    for (number in rangeStart..rangeEnd) {
        if (number % 3 == 0 && number % 5 == 0) {
            println("FizzBuzz")
        } else if (number % 5 == 0) {
            println("Buzz")
        } else if (number % 3 == 0) {
            println("Fizz")
        } else {
            println(number)
        }
    }
}