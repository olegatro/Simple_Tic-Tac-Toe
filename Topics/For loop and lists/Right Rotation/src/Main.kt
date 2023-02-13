fun main() {
    val size: Int = readln().toInt()
    val numberList: MutableList<Int> = mutableListOf()
    val resultList: MutableList<Int> = mutableListOf()

    repeat(size) {
        numberList.add(readln().toInt())
    }

    val position: Int = readln().toInt()
    val shift: Int = position % size
    var index: Int = size - shift

    repeat(size) {
        if (index == numberList.size) {
            index = 0
        }

        resultList.add(numberList[index])

        index++
    }

    println(resultList.joinToString(" "))
}