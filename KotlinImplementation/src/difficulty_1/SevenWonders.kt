package difficulty_1

import java.util.*
import java.util.function.Function
import java.util.stream.Collectors
import kotlin.math.pow

fun main() {
    val input = readLine()
    val cards = input!!.split("")
    var sum = 0

    sum += cards.filter { it == "T" }.size.toDouble().pow(2.00).toInt()
    sum += cards.filter { it == "C" }.size.toDouble().pow(2.00).toInt()
    sum += cards.filter { it == "G" }.size.toDouble().pow(2.00).toInt()

    if(input.contains("T") && input.contains("C") && input.contains("G")) sum += 7

    println(sum)
}