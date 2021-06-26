package difficulty_1

import java.lang.Math.toRadians
import kotlin.math.ceil
import kotlin.math.sin

fun main() {
    val (h, v) = readLine()!!.split(" ").map(String::toInt)

    println(ceil(h / sin(toRadians(v.toDouble()))).toInt())
}