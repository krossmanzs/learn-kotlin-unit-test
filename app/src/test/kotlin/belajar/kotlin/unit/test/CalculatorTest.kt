package belajar.kotlin.unit.test

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.assertThrows

class CalculatorTest {
    val calculator = Calculator()

    @Test
    fun testAddSuccess1() {
        val result = calculator.add(10, 10)
        assertEquals(20, result, "Hasil harus 20")
    }

    @Test
    fun testAddSuccess2() {
        val result = calculator.add(15, 10)
        assertEquals(25, result, "Hasil harus 25")
    }

    @Test
    fun testDivideSuccess() {
        val result = calculator.divide(100, 10)
        assertEquals(10.0f, result)
    }

    @Test
    fun testDivideError() {
        assertThrows<IllegalArgumentException> {
            calculator.divide(100, 0)
        }
    }
}