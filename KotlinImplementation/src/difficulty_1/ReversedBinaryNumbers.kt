package difficulty_1

fun main() {
    val n = readLine()!!.toInt()

    println(Integer.parseInt(n.toString(2).reversed(), 2))
}