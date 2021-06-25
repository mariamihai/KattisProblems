package difficulty_1

fun main() {
    // Nr of at-bats
    readLine()!!.toInt()

    val atBats = readLine()!!.split(' ').map(String::toInt)

    val filteredAtBats = atBats.filter { it >= 0 }

    println(filteredAtBats.sum() * 1.0 / filteredAtBats.size)
}