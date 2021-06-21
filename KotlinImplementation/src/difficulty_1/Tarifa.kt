package difficulty_1

fun main() {
    val X = readLine()!!.toInt()
    val N = readLine()!!.toInt()
    var usedTotal = 0

    for (i in 1..N)
        usedTotal += readLine()!!.toInt()

    println(X + N * X - usedTotal)
}