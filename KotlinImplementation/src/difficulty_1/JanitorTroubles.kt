package difficulty_1

import kotlin.math.sqrt

fun main() {
    val (s1, s2, s3, s4) = readLine()!!.split(" ").map(String::toInt)

    val sp = (s1 + s2 + s3 + s4) / 2
    println(sqrt((sp - s1) * (sp - s2) * (sp - s3) * (sp - s4) * 1.0))
}
