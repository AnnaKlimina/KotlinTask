import kotlin.Exception
//Только задача без тестов

fun main() {
    print("Введите натуральное число, не превосходящее 1000: ")
    val number = readLine().toString()
    lateinit var numberInWords: String
    try{
        val buffer = number.toInt()
        if ((buffer<=1000) || (buffer > 1)) {
            if (number.length == 1) {
                numberInWords = plusWord(0, number)
            }
            if (number.length > 1) {
                when (number[number.length - 2]) {
                    '1' -> {
                        when (number[number.length - 1]) {
                            '1' -> numberInWords = "одиннадцать"
                            '2' -> numberInWords = "двенадцать"
                            '3' -> numberInWords = "тринадцать"
                            '4' -> numberInWords = "четырнадцать"
                            '5' -> numberInWords = "пятнадцать"
                            '6' -> numberInWords = "шестнадцать"
                            '7' -> numberInWords = "семнадцать"
                            '8' -> numberInWords = "восемнадцать"
                            '9' -> numberInWords = "девятнадцать"
                            '0' -> numberInWords = "десять"
                        }
                    }
                    '2', '3' -> numberInWords = plusWord(1, number) + "дцать " + plusWord(0, number)
                    '4' -> numberInWords = "сорок " + plusWord(0, number)
                    '5', '6', '7', '8' -> numberInWords = plusWord(1, number) + "десят " + plusWord(0, number)
                    '9' -> numberInWords = "девяносто " + plusWord(0, number)
                    '0' -> numberInWords = plusWord(0, number)
                }
            }
            if (number.length > 2) {
                when (number[number.length - 3]) {
                    '1' -> numberInWords = "сто  $numberInWords"
                    '2' -> numberInWords = "двести $numberInWords"
                    '3', '4' -> numberInWords = "${plusWord(2, number)}ста $numberInWords"
                    '5', '6', '7', '8', '9' -> numberInWords = plusWord(2, number) + "сот " + numberInWords
                }
            }
            if (number.length > 3) {
                numberInWords = "тысяча $numberInWords"
            }
            println(numberInWords)
        }
        else{
            println("Значение вне диапазона")
        }
    }catch (exception: Exception){
        println("Ошибка: неверный тип $exception ") }
}
fun  plusWord( i: Int, number: String): String{
    return when (number[number.length-1-i]) {
        '1' -> "один"
        '2' -> "два"
        '3' -> "три"
        '4' -> "четыре"
        '5' -> "пять"
        '6' -> "шесть"
        '7' -> "семь"
        '8' -> "восемь"
        '9' -> "девять"
        else -> return null.toString()
    }
}