/**
 * Программа принимает трехзначное положительное число и печатает его разряды в обратном поряке.
 * В случае, если вводимое значение не является трехзначным целым положитеольным числом,
 * программа обрабатывает вводимое значение и выводит сообщение о неправильном вводе.
 */

fun main() {
    print("Введите трехзначное положительное целое число: ")
    val reverseNumber: String = readLine().toString()
    println(reverse(reverseNumber))
}

fun reverse(reverseNumber: String): String {
    return if (reverseNumber.length == 3){
        try{
            val number: Int = reverseNumber.toInt()
            return if (number >= 0){
                "${reverseNumber.reversed()}"
            } else{
                "Вы ввели недопустимое значение"
            }
        } catch (exception: Exception){
            "Ошибка! Введенное значение не я вляется целым трехзначным числом. $exception"
        }
    }
    else{
        "Значение содержит более 3 символов - не трехзначное число!"
    }
}