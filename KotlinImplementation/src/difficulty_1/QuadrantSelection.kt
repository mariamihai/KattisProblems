package difficulty_1

fun main() {
    val x : Int = readLine()!!.toInt()
    val y : Int = readLine()!!.toInt()

    if( x > 0) {
        if (y > 0) println(1) else println(4)
    } else {
        if (y > 0) println(2) else println(3)
    }
}
