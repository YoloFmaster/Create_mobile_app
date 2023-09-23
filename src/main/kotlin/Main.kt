fun main()
{
    println("Введите символы")
    val text = readln()
    var new_text = ""
    var counter = 1
    var i = 1
    var s = text[0]
    for (item in text.substring(1)) {
        i++
        if (s != item || i == text.length) {
            if (i == text.length) counter++
            if (counter > 1) {
                new_text += "$s$counter"
            }
            else
            {
                new_text += s
            }
            counter = 1
            s = item
        }
        else
        {
            counter++
        }
    }
    println(new_text)
}
