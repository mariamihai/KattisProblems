package difficulty_1

fun main() {
    val P = readLine()!!.toInt()

    for(i in 1..P) {
        val (K, N) = readLine()!!.split(' ').map(String::toInt)
        println("${K} ${N * (N + 1) / 2 + N}")
    }
}