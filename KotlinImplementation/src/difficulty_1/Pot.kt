package difficulty_1

import kotlin.math.pow

fun main() {
    val N = readLine()!!.toInt()
    var X = 0.0

    for (i in 1..N) {
        val nr = readLine()!!.toInt()
        X += Math.pow(nr / 10 * 1.0, nr % 10 * 1.0)
    }

    println(X.toInt())
}