fun main(){
    //Lr5
    val text = readln()
    var xStr = ""
    var nStr = ""
    for (char in text) {
        if (char != ' ' && nStr == "") {
            xStr += char
        } else {
            nStr += char
        }
    }
    val n = nStr.replace(" ", "").toInt()
    val x = xStr.toInt()
    if (x <= 0 || n <= 0)
    {
        println("Основание степени и число должны быть положительными.")
    }
    var y = 0
    var power = 1
    do {
        if (power == n) {
            println(y)
        }
        y++
        power *= x
        if (power > n) {
            println("Целочисленного показателя не существует")
        }
    } while (power <= n)
}