package com.learning_kotlin.files

import java.io.FileInputStream

fun main(args: Array<String>) {
	var result = try {
		divide(5, 0)
	} catch(exception: ArithmeticException) {
		println(exception.message)
		0
	} catch(exception: Exception) {
		println(exception.message)
		0
	}
	
	println(result)
}

@Throws (ArithmeticException::class)
fun divide(a: Int, b: Int): Int {
	return (a / b)
}

fun printFile() {
	val input = FileInputStream("file.txt")
	
	input.use {
		//an exception could be thrown here
	}
	
}