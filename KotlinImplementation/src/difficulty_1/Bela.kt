package difficulty_1

fun main() {
    val dominantPoints = mapOf(
        "A" to 11,
        "K" to 4,
        "Q" to 3,
        "J" to 20,
        "T" to 10,
        "9" to 14,
        "8" to 0,
        "7" to 0
    )

    val notDominantPoints = mapOf(
        "A" to 11,
        "K" to 4,
        "Q" to 3,
        "J" to 2,
        "T" to 10,
        "9" to 0,
        "8" to 0,
        "7" to 0
    )

    val (N, B) = readLine()!!.split(' ')
    var sum = 0

    for(i in 1..4*N.toInt()) {
        val line = readLine()!!
        val cardValue = line.first()
        val cardType = line.last()

        if(cardType.equals(B)) {
            sum += dominantPoints.get(cardValue.toString())!!
        } else {
            sum += notDominantPoints.get(cardValue.toString())!!
        }
    }

    println(sum)
}