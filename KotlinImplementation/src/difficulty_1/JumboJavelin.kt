package difficulty_1

fun main() {
    val N = readLine()!!.toInt()
    var result = 0

    for(i in 1..N) {
        result += readLine()!!.toInt()
    }

    println(result - N + 1)
}