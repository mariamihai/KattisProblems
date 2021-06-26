package difficulty_1

fun main() {
    val t = readLine()!!.toInt()

    for(i in 1..t) {
        val (a, b, c) = readLine()!!.split(" ").map(String::toInt)
        if(check(a, b, c)) println("Possible") else println("Impossible")
    }
}

private fun check(a: Int, b: Int, c: Int): Boolean {
    if(a + b == c) {
        return true
    }

    if(a - b == c || b - a == c) {
        return true
    }

    if(a * b == c) {
        return true
    }

    if(a * 1.0 / b == c * 1.0  || b * 1.0  / a == c * 1.0 ) {
        return true
    }

    return false
}