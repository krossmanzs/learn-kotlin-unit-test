package belajar.kotlin.unit.test

import org.junit.jupiter.api.*

//@TestInstance(value = TestInstance.Lifecycle.PER_METHOD) // DEFAULT
@TestInstance(value = TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(value = MethodOrderer.OrderAnnotation::class)
class OrderedTest {

    var counter: Int = 0

    /**
     * Ketika menggunakan TestInstance PER_CLASS maka kita
     * bisa melakukan before after test tanpa membuat companion object
     */

    @BeforeAll
    fun beforeAll() {
        println("Sebelum semua test")
    }

    @AfterAll
    fun afterAll() {
        println("Sesudah semua test")
    }

    @Test
    @Order(2)
    fun test1() {
        counter++
        println(counter)
    }

    @Test
    @Order(3)
    fun test2() {
        counter++
        println(counter)
    }

    @Test
    @Order(1)
    fun test3() {
        counter++
        println(counter)
    }
}