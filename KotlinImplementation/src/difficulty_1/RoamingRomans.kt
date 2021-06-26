package difficulty_1

import kotlin.math.round

fun main() {
    val x = readLine()!!.toDouble()

    println(round(x *  1000 * 5280 / 4854).toInt())
}