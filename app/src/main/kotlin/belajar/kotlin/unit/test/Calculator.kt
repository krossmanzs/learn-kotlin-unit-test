package belajar.kotlin.unit.test

import java.lang.IllegalArgumentException

class Calculator {
    fun divide(first: Int, second: Int): Float {
        if (second == 0) {
            throw IllegalArgumentException("Can not divide by zero")
        } else {
            return (first / second).toFloat()
        }
    }

    fun add(first: Int, second: Int): Int = first + second
}
