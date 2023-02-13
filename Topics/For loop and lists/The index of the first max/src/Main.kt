fun main() {
    val size: Int = readln().toInt()
    val list: MutableList<Int> = mutableListOf()
    var resultIndex: Int = 0
    var resultValue: Int = 0

    repeat(size) {
        list.add(readln().toInt())
    }

    for (index: Int in list.indices) {
        val value: Int = list[index]

        if (value > resultValue) {
            resultIndex = index
            resultValue = value
        }
    }

    println(resultIndex)
}