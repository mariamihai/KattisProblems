package difficulty_1

fun main() {
    val (N, K) = readLine()!!.split(' ').map(String::toInt)
    var sumRatings = 0

    for(i in 1..K)
        sumRatings += readLine()!!.toInt()

    println("${((N - K) * -3 + sumRatings) * 1.0 / N} ${((N - K) * 3 + sumRatings) * 1.0 / N}")
}