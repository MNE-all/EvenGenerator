import java.lang.Exception

fun main() {
    println("Приложение для генерации чётного числа из двух вводимых цифр")
    val (num1, num2) = inputValidate("Введите две цифры через пробел: ")
    if (num1 % 2 == 1 && num2 != 0.toByte()){
        println("$num2$num1")
    }
    else if (num2 % 2 == 1 && num1 != 0.toByte()){
        println("$num1$num2")
    }
    else {
        println("Создать нечётное число невозможно")
    }
}

fun inputValidate(message: String): Pair<Byte, Byte>{
    val numbs: Pair<Byte, Byte>
    print(message)
    try {
        val (num1, num2) = readln().split(" ", limit = 2)
        if (num1.toByte() in 0..9 && num2.toByte() in 0..9) {
            numbs =  Pair(num1.toByte(), num2.toByte())
        }
        else {
            println("Ошибка ввода!")
            return inputValidate(message)
        }
    }
    catch (e: Exception){
        println("Ошибка ввода!")
        return inputValidate(message)
    }
    return numbs
}