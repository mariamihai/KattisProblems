package difficulty_1

fun main() {
    val nrOfCases = readLine()!!.toInt()

    for(i in 1..nrOfCases) {
        val instruction = readLine()!!
        if(instruction.contains("Simon says")) println(instruction.replace("Simon says", ""))
    }
}