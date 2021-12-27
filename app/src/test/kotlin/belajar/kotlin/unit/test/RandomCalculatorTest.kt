package belajar.kotlin.unit.test

import belajar.kotlin.unit.test.resolver.RandomParameterResolver
import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.extension.ExtendWith
import org.junit.jupiter.api.extension.Extensions
import java.util.*

// jika extend ParentCalculatorTest maka tidak wajib mengextend RandomParameterResolver
//@Extensions(value = [
//    ExtendWith(RandomParameterResolver::class)
//])
class RandomCalculatorTest : ParentCalculatorTest() {

//    private val calculator = Calculator()

    @Test
    fun testRandom(random: Random) {
        val first = random.nextInt(1000)
        val second = random.nextInt(1000)

        println("""
            $first + $second = ${first + second}
        """.trimIndent())

        val result = calculator.add(first, second)

        assertEquals(first + second, result)
    }

    @DisplayName("Test calculator random")
    @RepeatedTest(
        value = 10,
        name = "{displayName} ke {currentRepetition} dari {totalRepetitions}"
    )
    fun testRandomRepeated(random: Random, testInfo: TestInfo) {
        val first = random.nextInt(1000)
        val second = random.nextInt(1000)

        println("""
            ${testInfo.displayName}
            $first + $second = ${first + second}
            
        """.trimIndent())

        val result = calculator.add(first, second)

        assertEquals(first + second, result)
    }

}