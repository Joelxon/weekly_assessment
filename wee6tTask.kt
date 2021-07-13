
fun main(){
    println(inLove(22,17))
    println(inLove(22,18))
    println(inLove(22,22))
}

fun inLove(flowerA: Int, flowerB: Int): Boolean{
    return flowerA % 2 !== flowerB % 2;
}