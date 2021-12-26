package belajar.kotlin.unit.test

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.condition.*

class ConditionalTest {

    // UNTUK VERSI OS

    @Test
    @EnabledOnOs(value = [OS.WINDOWS, OS.LINUX])
    fun enableOnWindowsOrLinux() {
        // only run on windows or linux
    }

    @Test
    @DisabledOnOs(value = [OS.WINDOWS])
    fun disabledOnWindows() {
        // can not run on windows
    }

    // UNTUK VERSI JAVA

    @Test
    @EnabledOnJre(value = [JRE.JAVA_14])
    fun onlyRunOnJava14() {
        // only run on java 14
    }

    @Test
    @DisabledOnJre(value = [JRE.JAVA_14])
    fun disabledRunOnJava14() {
        // can not run on java 14
    }

    @Test
    @EnabledForJreRange(min = JRE.JAVA_11, max = JRE.JAVA_14)
    fun onlyRunOnJava11ToJava14() {
        // only run on java 11 - 14
    }

    @Test
    @DisabledForJreRange(min = JRE.JAVA_11, max = JRE.JAVA_14)
    fun disableRunOnJava11ToJava14() {
        // can not run on java 11 - 14
    }

    // UNTUK SYSTEM PROPERTY

    @Test
    fun printSystemProperties() {
        System.getProperties().forEach { key, value ->
            println("$key => $value")
        }
    }

    @Test
    @EnabledIfSystemProperties(value = [
        EnabledIfSystemProperty(named = "java.vendor", matches = "Oracle Corporation")
    ])
    fun enabledOnOracle() {

    }

    @Test
    @DisabledIfSystemProperties(value = [
        DisabledIfSystemProperty(named = "java.vendor", matches = "Oracle Corporation")
    ])
    fun disabledOnOracle() {

    }

    // UNTUK ENVIRONTMENT VARIABLE

    @Test
    @EnabledIfEnvironmentVariable(named = "PROFILE", matches = "DEV")
    fun enabledOnProfileDev() {

    }

    @Test
    @DisabledIfEnvironmentVariable(named = "PROFILE", matches = "DEV")
    fun disabledOnProfileDev() {

    }

}