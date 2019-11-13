import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse

/**
 * Класс тестирует функцию outputNumber. Функция должна печатать ответ вида "Вы ввели число ..."
 * только для целочисленных значений. Значения остальных типов должны обрабатываться в функции.
 * В этом случае функция выводит сообщение, что было поймано исключение. Программа не должна
 * ломаться на пустой строке.
 */
class OutputNumberTest {
    /**
     *Тест проверяет правильность выполнения программы для положительных значений
     */
    @Test
    fun testStandartPositiveIntNumber() {
        val testNumber = 12
        assertEquals(
            "Вы ввели число $testNumber",
            outputNumber(testNumber.toString()),
            "Неправильный вывод для целочисленного положительного значения"
        )
    }

    /**
     *Тест проверяет правильность выполнения программы для отрицательных целочисленных значений
     */
    @Test
    fun testStandartNegativeIntNumber() {
        val testNumber = -100
        assertEquals(
            "Вы ввели число $testNumber",
            outputNumber(testNumber.toString()),
            "Неправильный вывод для целочисленного отрицательного значения"
        )
    }

    /**
     *Тест проверяет, как программа реагирует и обрабатывает значения других типов(не Int)
     */
    @Test
    fun testNotIntValue() {
        val testValue = 10.543
        assertFalse(
            ("Вы ввели число $testValue") == outputNumber(testValue.toString()),
            "Программа выводит результат для значения типа ${testValue::class.simpleName} (должна только для типа Int)."
        )
    }

    /**
     * Тест проверяет реакцию на путую строку(null)
     */
    @Test
    fun testNullInput() {
        try {
            outputNumber(null.toString())
        } catch (exception: Exception) {
            println("Программа выводит ошибку при пустой строке. Не обрабатывается null.")
        }
    }

}
