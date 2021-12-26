package belajar.kotlin.unit.test

import org.junit.jupiter.api.MethodOrderer
import org.junit.jupiter.api.Order
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestMethodOrder

@TestMethodOrder(value = MethodOrderer.OrderAnnotation::class)
class OrderedTest {

    @Test
    @Order(2)
    fun test1() {

    }

    @Test
    @Order(3)
    fun test2() {

    }

    @Test
    @Order(1)
    fun test3() {

    }
}