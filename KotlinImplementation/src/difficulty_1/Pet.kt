package difficulty_1

fun main() {
    val map = mutableMapOf<Int, Int>()

    for(i in 1..2)
        map.put(i, readLine()!!.split(' ').map( String::toInt ).sum())

    println(map.maxByOrNull { it.value }.toString().replace("=", " "))
}