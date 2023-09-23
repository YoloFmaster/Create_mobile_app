fun main() {
    //Lr2
    println("Введите сюда текст")
    val text = readln()
    val counterChar = mutableMapOf<Char, Int>()
    var new_text = ""
    text.forEach { char -> counterChar[char] = counterChar.getOrDefault(char, 0) + 1 }
    counterChar.toSortedMap().forEach { (char, count) ->
        new_text += "$char - $count\n"
    }
    println(new_text)
}
