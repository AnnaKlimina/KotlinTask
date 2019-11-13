import org.junit.Assert.*
import org.junit.Test

class ReverseNumberTest{
    /**
     * Тест на работу программы с указанным диапазоном(целые трехзначные положительные числа)
     */
    @Test
    fun testStandartNumber(){
        val number = 304
        assertEquals("Программа работает неверно для указанного диапазона(трехзначные целые положительные числа)",
            number.toString().reversed(),reverse(number.toString()))
    }

    @Test
    fun testNegativeNumber(){
        val number = -12
        assertNotEquals("Программа не обрабатывает ошибочную ситуацию с для отрицательных целых чисел",
            number.toString().reversed(), reverse(number.toString()))
    }

    @Test
    fun testAnotherTypes(){
        val testValue = 244.64
        assertNotEquals("Программа не должна инвертировать тип ${testValue::class.simpleName}"
            ,testValue.toString().reversed(),reverse(testValue.toString()))
    }

    @Test
    fun testNull(){
        try{
            reverse(null.toString())
        } catch(exception: Exception){
            println("Программа не обрабатывает пустую строку(null). Ошибка: $exception")
        }
    }
}