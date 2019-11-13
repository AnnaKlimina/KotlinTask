/**
 * Программа получает на вход целые чисел, введенные через пробел.
 * После этого она сортирует элементы и выводит отсортированную последовательность.
 * Если значения вводятся иным образом или среди них есть не целые числа,
 * а значения других типов, то программа выводит сообщение о неправильном вводе.
 */
fun main() {
    println("Введите массив целых чисел через пробел: ")
    val inputString = readLine()!!.toString()
    println(sortArray(inputString))
}

/**
 *Вспомогательная функция, ведущая обработку поданного на ввод массива.
 */
fun sortArray(inputString: String): String {
    val sortedMassive= arrayListOf<Int>()
    val massive: List<String> = inputString.split(' ')
    return try{
        for(element in massive) {
            sortedMassive+= listOf(element.toInt())
        }
        "${sortedMassive.sorted()}"
    } catch (exception: Exception){
    "Неправильный тип вводимых эементов. Ошибка:$exception"
    }
}
