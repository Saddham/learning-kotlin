package com.learning_kotlin.classes

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.util.*
import kotlin.test.assertEquals

class AgeCalculation() {
    fun getAge(dob: Calendar?) : Int {
        requireNotNull(dob)

        val today = Calendar.getInstance()
        val years = today.get(Calendar.YEAR) - dob.get(Calendar.YEAR)

        return if(dob.get(Calendar.DAY_OF_YEAR) > today.get(Calendar.DAY_OF_YEAR))
            years - 1
        else
            years
    }

}

class AgeCalculationTests() {

    @Test
    fun checkAgeWhenBornToday() {
        assertEquals(0, AgeCalculation().getAge(Calendar.getInstance()))
    }

    @Test
    fun checkAgeWhenBorn1000DaysAgo() {
        val date = Calendar.getInstance()
        date.add(Calendar.DAY_OF_YEAR, -1000)

        assertEquals(2, AgeCalculation().getAge(date))
    }

    @Test
    fun checkExceptionWhenDOBNull() {
        val dob = null
        Assertions.assertThrows(java.lang.IllegalArgumentException::class.java) {
            AgeCalculation().getAge(dob)
        }
    }

}