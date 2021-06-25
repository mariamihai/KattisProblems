package difficulty_1

fun main() {
    val name = readLine()!!.split("")

    for((index, ch) in name.withIndex()) {
        if(index > 0) {
            if(ch != name[index - 1]) print(ch)
        } else {
            print(ch)
        }
    }
}