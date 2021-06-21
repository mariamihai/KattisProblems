package difficulty_1

fun main() {
    val N = readLine()!!.toInt()
    val listOfTimes = mutableListOf<Int>()

    for(i in 1..N)
        listOfTimes.add(readLine()!!.toInt())

    if(N % 2 == 1)
        println("still running")
    else {
        println(listOfTimes.withIndex()
            .sumBy {(index, n) -> if (index % 2 == 0) -n else n })
    }
}