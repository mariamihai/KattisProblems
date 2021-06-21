package difficulty_1

import kotlin.math.pow

fun main() {
    val nrIterations = readLine()!!.toDouble()

    println((2.0.pow(nrIterations) + 1).pow(2.0).toInt())
}