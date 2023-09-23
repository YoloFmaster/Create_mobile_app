fun main() {
    val a = readln()
    val b = readln()
    var num1: String? = null
    var num2: String? = null
    if ("$a$b".toInt() % 2 != 0) {
        num1 = "$a$b"
    }
    if ("$b$a".toInt() % 2 != 0) {
        num2 = "$b$a"
    }
    var result = ""
    if (num1 == null && num2 == null) println("Создать нечетное число невозможно")
    else {
        if (num1 != null) result += num1
        if (num2 != null) {
            if (num1 != null) result += " "
            result += num2
        }
        print( result)
    }
}