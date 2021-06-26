package difficulty_1

fun main() {
    val (n, h, v) = readLine()!!.split(" ").map(String::toInt)

    println(h.coerceAtLeast(n - h) * v.coerceAtLeast(n - v) * 4)
}