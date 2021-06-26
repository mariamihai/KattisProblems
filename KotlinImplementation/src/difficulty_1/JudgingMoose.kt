package difficulty_1

fun main() {
    val (l, r) = readLine()!!.split(" ").map(String::toInt)

    if (l == 0 && r == 0) {
        println("Not a moose")
        return
    }

    if (l == r) {
        println("Even " + l * 2)
        return
    }

    println("Odd " + l.coerceAtLeast(r) * 2)
}