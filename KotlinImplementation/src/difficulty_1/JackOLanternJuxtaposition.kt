package difficulty_1

fun main() {
    val (n, t, m) = readLine()!!.split(' ').map(String::toInt)
    println(n * t * m)
}