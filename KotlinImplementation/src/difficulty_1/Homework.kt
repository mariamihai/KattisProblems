package difficulty_1

fun main() {
    var sum = 0
    val problemRanges = readLine()!!.split(";")

    sum += problemRanges.filter { !it.contains("-") }.size
    problemRanges.filter { it.contains("-") }
        .forEach {
            val (startValue, endValue) = it.split("-").map(String::toInt)
            sum += endValue - startValue + 1
        }

    println(sum)
}