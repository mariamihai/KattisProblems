package difficulty_1

fun main() {
    var (nr1, nr2) = readLine()!!.split(' ').map(String::toInt)

    var updated1 = 0.0
    var updated2 = 0.0
    for(i in 2 downTo 0) {
        updated1 += nr1 % 10 * (Math.pow(10.0, i * 1.0))
        updated2 += nr2 % 10 * (Math.pow(10.0, i * 1.0))

        nr1 /= 10
        nr2 /= 10
    }

    println(Math.max(updated1.toInt(), updated2.toInt()))
}