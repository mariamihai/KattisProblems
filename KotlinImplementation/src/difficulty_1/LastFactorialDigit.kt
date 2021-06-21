package difficulty_1

fun main() {
    val n = readLine()!!.toInt()

    for(case in 1..n) {
        val nr = readLine()!!.toInt()

        var result = 1

        for(factor in 2..nr) {
            result *= factor
            result %= 10
        }

        println(result)
    }
}