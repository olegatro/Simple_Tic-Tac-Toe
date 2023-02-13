fun main() {
    val length: Int = readln().toInt()
    val listOfList: MutableList<MutableList<Int>> = mutableListOf()
    var maxCount: Int = 0

    repeat(length) {
        val number: Int = readln().toInt()

        if (listOfList.size > 0 && listOfList.last().last() <= number) {
            listOfList.last().add(number)
        } else {
            listOfList.add(mutableListOf(number))
        }
    }

    for (list in listOfList) {
        if (list.size > maxCount) {
            maxCount = list.size
        }
    }

    println(maxCount)
}