package com.learning_kotlin.files

import java.util.function.Function;

private fun printAString(value: String) {
	println("Value: $value")
}

fun main(args: Array<String>) {
	printAString("Hello World!")
	println(addTwoNumbers(17.0, 10.0).toString())
	printSomeMaths(17.0, 10.0)
	printSomeMaths(two = 10.0, one = 17.0)
	printSomeMaths(one = 17.0)
	printSomeMaths(17.0)
	
	val lambda: (Double) -> (Double) = {two: Double -> addTwoNumbers(17.0, two)}  
	methodTakesALambda(10.0, lambda)
}

/*
fun addTwoNumbers(one: Double, two: Double): Double {
	return one + two
}
 */

fun addTwoNumbers(one: Double, two: Double): Double = one + two

fun printSomeMaths(one: Double = 17.0, two: Double = 10.0): Unit {
	println("one + two: ${one + two}")
	println("one - two: ${one - two}")
}

fun methodTakesALambda(input: Double, action: Function<Double, Double>) {
	println(action.apply(input))
}