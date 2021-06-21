package difficulty_1

fun main() {
    val N = readLine()!!.toInt()

    for(i in 1..N) {
        val (x, y) = readLine()!!.split(' ')
        val b = x.toInt()
        val p = y.toDouble()

        val bpm = 60 * b / p
        println("${(bpm - 60 / p)} ${bpm} ${(bpm + 60 / p)}")
    }
}