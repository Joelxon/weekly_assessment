fun main() {

    reverseNumberToArray(348597)
    reverseNumberToArray(258)

}

fun reverseNumberToArray(positiveNum: Int) {
    var task: Int = positiveNum
    val array = ArrayList<Int>()
    do {
        array.add(task % 10)
        task /= 10
    } while (task > 0)
    println(array)

}

