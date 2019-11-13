import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertNotEquals

class RussianOutputTest{
    //Тест с числами из указанного диапазона( от 1 до 1000)
    @Test
    fun testNumber() {
        assertEquals(
            "пятьсот шестьдесят четыре", russian("564"),
            "Неправильный вывод для числа из диапазона от 1 до 1000"
        )
    }
    @Test
    fun testAnotherInt(){
        assertFalse(
            "одна тысяча пятьдесят четыре" == russian("1054"),
            "Неправильный вывод для числа вне диапазона от 1 до 1000"
        )
    }

    @Test
    fun testAnotherType(){
        assertNotEquals("пятьдесят шесть",russian("пятьдесят шесть"),
            "Программа не должна работать с какими-либо типами кроме целых чисел от 1 до 1000")
    }

    @Test
    fun testNull(){
        try{
            russian(null.toString())
        } catch(exception: Exception){
            println("Программа не обрабатывает пустую строку: null. Это приводит к ошибке $exception")
        }
    }

    @Test
    fun testThousand(){
        assertEquals(
            "тысяча", russian("1000"),
            "Неправильный вывод для крайнего значения 1000"
        )
    }

    @Test
    fun testNegative(){
        assertFalse((russian("-12") == "минус двенадцать")||(russian("-12") == "двенадцать"),
            "Программа не должна работат ьс отрицательными значениями(программа должна выводить сообщение о некорректном вводе)")
    }
}
