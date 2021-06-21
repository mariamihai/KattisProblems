package difficulty_1

fun main() {
    val nrTests = readLine()!!.toInt()

    for(i in 1..nrTests) {
        val array = readLine()!!.split(' ').map(String::toInt)

        println(array.sum() - 2 * array[0] + 1)
    }
}