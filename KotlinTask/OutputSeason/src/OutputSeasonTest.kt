import org.junit.*
import kotlin.test.*

class OutputSeasonTest{
    @Test
    fun testInputNumberForWinter() {
        assertTrue(("Зима") == outputSeason("1"), "Неправильное время года для зимннего месяца")
    }
    @Test
    fun testInputNumberForSummer() {
        assertTrue(("Лето") == outputSeason("8"), "Неправильное время года для летнего месяца")
    }

    @Test
    fun testInputNumberForSpring() {
        assertTrue(("Весна") == outputSeason("3"), "Неправильное время года для весеннего месяца")
    }

    @Test
    fun testInputNumberForAutumn() {
        assertTrue(("Осень") == outputSeason("10"), "Неправильное время года для Осеннего месяца")
    }

    /**
     * Проверка целочисленных значений вне диапазона от 1 до 12 и значений других типов.
      */
    @Test
    fun testAnotherValuesAndTypes(){
        val testValue = outputSeason("65")
        assertFalse(("Лето" == testValue) || ("Осень" == testValue)
                || ("Зима" == testValue) || ("Весна" == testValue),
            "Программа выводит время года для числа, не являющегося порядковым номером месяца")
    }

}