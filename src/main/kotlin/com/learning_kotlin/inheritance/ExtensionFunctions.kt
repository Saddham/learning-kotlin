package com.learning_kotlin.inheritance

/*fun toSentenceCase(str: String): String {
    return str[0].toUpperCase() + str.substring(1)
}*/

fun String.toSentenceCase(): String {
    return this[0].toUpperCase() + this.substring(1)
}

fun main(args: Array<String>) {
    val greeting = "welcome to the system"

    println (greeting.toSentenceCase())
}