fun main () {
    for (numbers in 1..100) {
        if (numbers % 3 == 0 && numbers % 5 == 0) {
            println("FizzBuzz")
        } else
            if (numbers % 5 == 0) {
                println("Buzz")
            } else
                if (numbers % 3 == 0) {
                    println("Fizz")
                } else {
                    println(numbers)

                }
    }

    //Reverse of a String

    var str: String = "Professional Programmer Adabe"
    var reverseString = reverseString(str)
    println(reverseString)
}

fun reverseString (str: String) : String{
    var reverse: String = ""
    for (r in str.length - 1
            downTo 0) {
        reverse += str[r]
    }
    return reverse
}
