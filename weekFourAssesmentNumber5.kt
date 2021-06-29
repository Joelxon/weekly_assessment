fun main() {
    var result1 = evenlySpaced(2,4,6)
    var result2 = evenlySpaced(4,6,2)
    var result3 = evenlySpaced(4,6,3)
    println(result1)
    println(result2)
    println(result3)
}

fun evenlySpaced(a: Int, b: Int, c: Int): Boolean{
    var large = a.coerceAtLeast(b.coerceAtLeast(c))
    var small = a.coerceAtMost(b.coerceAtMost(c))
    var medium = (a + b + c) - large - small
    return (large - medium) == (medium - small)
}