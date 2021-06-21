package difficulty_1

fun main() {
    val T = readLine()!!.toInt()

    for(i in 1..T) {
        val n = readLine()!!.toInt()
        val cities = mutableSetOf<String>()

        for(cityIndex in 1..n) {
            cities.add(readLine()!!)
        }

        println(cities.size)
    }
}