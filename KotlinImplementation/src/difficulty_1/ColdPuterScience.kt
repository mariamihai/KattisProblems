package difficulty_1

fun main() {
    val array = readLine()!!.split(' ').map(String::toInt)

    println(array.filter { it < 0 }.size)
}