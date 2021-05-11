package com.learning_kotlin.inheritance

import java.io.Closeable

class AdvancedBookingManager: BasicBookingManager("12345"), Closeable {
    override val version: String = "2.0"

    fun howManyBookings() = 10

    override fun close() {}
}