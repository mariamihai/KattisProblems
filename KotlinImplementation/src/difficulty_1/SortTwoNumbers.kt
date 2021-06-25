package difficulty_1

fun main() {
    val (a, b) = readLine()!!.split(' ').map(String::toInt)

    if(a < b) println("$a $b") else println("$b $a")
}