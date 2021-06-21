package difficulty_1

fun main() {
    val N = readLine()!!.toInt()
    var qaly = 0.0

    for(i in 1..N) {
        val (q, y) = readLine()!!.split(' ').map(String::toDouble)
        qaly += q * y
    }

    println(qaly)
}