package difficulty_1

private val victoryCards = mapOf(8 to "Province", 5 to "Duchy", 2 to "Estate")
private val treasureCards = mapOf(6 to "Gold", 3 to "Silver", 0 to "Copper")

fun main() {
    val money = readLine()!!.split(" ").map(String::toInt)

    possibilities(availableMoney(money))
}

private fun availableMoney(money: List<Int>): Int {
    var sum = 0

    for ((index, value) in money.withIndex()) {
        sum += value * (3 - index)
    }

    return sum
}

private fun possibilities(sum: Int) {
    for((key, value) in victoryCards.entries) {
        if(key <= sum) {
            print("${value} or ")
            break
        }
    }

    for((key, value) in treasureCards.entries) {
        if(key <= sum) {
            print(value)
            break
        }
    }
}