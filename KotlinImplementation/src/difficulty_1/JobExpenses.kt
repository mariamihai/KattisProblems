package difficulty_1

fun main() {
    readLine()
    val expensesAndIncome = readLine()!!.split(" ").map(String::toInt)

    println(expensesAndIncome.filter { it < 0 } .sum() * -1)
}