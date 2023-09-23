fun main() {
    //Lr3
    println("Введите натуральное число")
    var number = readln().toInt()
    var binaryNumber = 0
    var rank = 1
    var mod: Int
    while (number> 0) {
        mod = number % 2
        number /= 2
        binaryNumber += mod * rank
        rank *= 10
    }
    println(binaryNumber)
}
