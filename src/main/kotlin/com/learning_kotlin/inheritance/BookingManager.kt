package com.learning_kotlin.inheritance

interface BookingManager {
    val version: String

    fun isSeatFree(seatNumber: String) : Boolean
    fun reserveSeat(seatNumber: String, customerId: String): Boolean

    fun systemStatus() = "All operations are functional!"
}