fun main() {
    var counter: Int = 0
    var number: Int = readln().toInt()

    while (number > 0) {
        counter++

        number = readln().toInt()
    }

    println(counter)
}