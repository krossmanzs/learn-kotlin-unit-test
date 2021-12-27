package belajar.kotlin.unit.test

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*
import org.mockito.Mockito

class MockTest {

    @Test
    fun testMock() {

        val list: List<String> = Mockito.mock(List::class.java) as List<String>

        Mockito.`when`(list.get(0)).thenReturn("Cornelius")
        Mockito.`when`(list.get(1)).thenReturn("Linux")

        assertEquals("Cornelius", list.get(0))
        assertEquals("Cornelius", list.get(0))
        assertEquals("Cornelius", list.get(0))
        assertEquals("Linux", list.get(1))

        Mockito.verify(list, Mockito.times(2)).get(0)
        Mockito.verify(list).get(1)

    }

}