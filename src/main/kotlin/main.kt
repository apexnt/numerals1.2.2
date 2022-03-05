const val TEXT0 = "Понравилось"
const val TEXT1 = "человеку"
const val TEXT2 = "людям"

fun main() {

    while (true) {
        print("Введите количество лайков: ")
        val like = readLine()?.toUInt() ?: return
        if (like % 10u != 1u || like % 100u == 11u) print("$TEXT0 $like $TEXT2")
        else  print("$TEXT0 $like $TEXT1")
        println()
    }
}