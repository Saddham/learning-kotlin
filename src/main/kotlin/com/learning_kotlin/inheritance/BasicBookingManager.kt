package com.learning_kotlin.inheritance

open class BasicBookingManager(authorizationKey: String): BookingManager {
    override val version = "1.0"

    override fun isSeatFree(seatNumber: String) = true
    override fun reserveSeat(seatNumber: String, customerId: String) = false

    init {
        if (authorizationKey != "12345")
            throw UnAuthorisedUserException()
    }
}