package difficulty_1

fun main() {
    val L = readLine()!!.toInt()
    val D = readLine()!!.toInt()
    val X = readLine()!!.toInt()

    for (i in L..D) {
        val sum = i.toString().chars()
            .map { codePoint: Int -> Character.getNumericValue(codePoint) }
            .sum()
        if (sum == X) {
            println(i)
            break
        }
    }

    for (i in D downTo L) {
        val sum = i.toString().chars()
            .map { codePoint: Int -> Character.getNumericValue(codePoint) }
            .sum()
        if (sum == X) {
            println(i)
            break
        }
    }
}