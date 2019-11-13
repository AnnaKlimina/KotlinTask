import org.junit.Assert.*
import org.junit.Test

class SortArrayTest{
    @Test
    fun testIntNumbers(){
        val string = "1 0 0 -1 75654 543"
        val result:List<Int> = listOf(1,0,0,-1,75654,543).sorted()
        assertEquals("","$result",sortArray(string))
    }

    @Test
    fun testNull(){
        try{
            sortArray((null.toString()))
        }catch(exception: Exception){
            println("Программа не обрабатывает пустую строку.")
        }
    }

    @Test
    fun testParsing(){
        // а - "возможный" другой символ-разделитель
        val a = ','
        val string = "-1${a}0${a}0${a}1${a}75654${a}543"
        val result:List<Int> = listOf(1,0,0,-1,75654,543).sorted()
        assertNotEquals("Программа неправильно работает с другими символами-разделителями(должна работать только с пробелами)",
            "$result",sortArray(string))
        }

    @Test
    fun testForAnotherTypeOfInput(){
        val string = "1.6645 0.0 0.875 -1.0 756.54 543.111"
        val result:List<Double> = listOf(1.6645,0.0,0.875,-1.0,756.54,543.111).sorted()
        assertNotEquals("Программа неправильно работает с другим типом", "$result",sortArray(string))
    }
}

