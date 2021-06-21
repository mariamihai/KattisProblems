package difficulty_1

fun main() {
    val setOfUniqueModulo = mutableSetOf<Int>()


    for(i in 1..10) {
        val nr = readLine()!!.toInt()
        setOfUniqueModulo.add(nr % 42)
    }

    println(setOfUniqueModulo.size)
}