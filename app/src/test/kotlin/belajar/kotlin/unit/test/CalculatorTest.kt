package belajar.kotlin.unit.test

import belajar.kotlin.unit.test.generator.SimpleDisplayNameGenerator
import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.assertEquals
import org.opentest4j.TestAbortedException

@DisplayNameGeneration(SimpleDisplayNameGenerator::class)
//@DisplayName("Test for Calculator class")
class CalculatorTest {

    companion object {

        @BeforeAll
        @JvmStatic
        fun beforeALl() {
            println("Sebelum semua unit test")
        }

        @AfterAll
        @JvmStatic
        fun afterAll() {
            println("Setelah semua unit test")
        }
    }

    val calculator = Calculator()

    @BeforeEach
    fun beforeEach() {
        println("Sebelum Unit Test")
    }

    @AfterEach
    fun afterEach() {
        println("Setelah Unit Test")
    }

    @Test
//    @DisplayName("Test for function Calculator.add(10,10)")
    fun testAddSuccess1() {
        println("Unit Test testAddSuccess1")
        val result = calculator.add(10, 10)
        assertEquals(20, result, "Hasil harus 20")
    }

    @Test
//    @DisplayName("Test for function Calculator.add(15,10)")
    fun testAddSuccess2() {
        println("Unit Test testAddSuccess2")
        val result = calculator.add(15, 10)
        assertEquals(25, result, "Hasil harus 25")
    }

    @Test
//    @DisplayName("Test for function Calculator.divide(100,10)")
    fun testDivideSuccess() {
        println("Unit Test testDivideSuccess")
        val result = calculator.divide(100, 10)
        assertEquals(10.0f, result)
    }

    @Test
//    @DisplayName("Test error when divide by zero on function Calculator.divide(100,0)")
    fun testDivideError() {
        println("Unit Test testDivideError")
        assertThrows<IllegalArgumentException> {
            calculator.divide(100, 0)
        }
    }

    @Test
    @Disabled("Sedang diperbaiki")
    fun testComingSoon() {
        // Belum selesai
    }

    @Test
    fun testAborted() {
        val profile = System.getenv()["PROFILE"]
        if ("DEV" != profile) {
            throw TestAbortedException()
        }

        println("Test Not Aborted because Dev Profile")
    }
}