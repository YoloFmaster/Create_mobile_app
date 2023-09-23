fun main() {
    //Lr4
    val expression = readln()
    var num1char = ""
    var num2char = ""
    var oper = ' '
    var isNumber = true
    for (char in expression.replace(" ", "")) {
        if (char.isDigit() || char == '.') {
            if (isNumber)
            {
                num1char += char
            }
            else
            {
                num2char += char
            }
        } else if (char in setOf('+', '-', '*', '/'))
        {
            oper = char
            isNumber = false
        }
    }
    val a = num1char.toFloat()
    val b = num2char.toFloat()
    when (oper)
    {
        '+' -> println(a + b)
        '-' -> println(a - b)
        '*' -> println(a * b)
        '/' -> println(a / b)
        else -> println(0.0f)
    }
}