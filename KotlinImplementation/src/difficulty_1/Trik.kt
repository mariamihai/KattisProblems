package difficulty_1

fun main() {
    val moves = readLine()!!.split("")
    var position = 1

    moves.forEach {
        if(it == "A") {
            if(position == 1) {
                position = 2
            } else {
                if (position == 2) position = 1
            }
        }

        if(it == "B") {
            if(position == 2) {
                position = 3
            } else {
                if (position == 3) position = 2
            }
        }

        if(it == "C") {
            if(position == 1) {
                position = 3
            } else {
                if (position == 3) position = 1
            }
        }
    }

    println(position)
}