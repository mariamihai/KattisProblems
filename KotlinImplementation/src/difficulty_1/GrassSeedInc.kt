package difficulty_1

fun main() {
    val C = readLine()!!.toDouble()
    val L = readLine()!!.toInt()

    var total = 0.0

    for(i in 1..L) {
        val (w, l) = readLine()!!.split(' ').map(String::toDouble)
        total += w * l
    }

    println(total * C)
}