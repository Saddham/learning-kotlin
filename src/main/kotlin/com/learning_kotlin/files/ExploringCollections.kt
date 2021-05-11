package com.learning_kotlin.files

fun main(args: Array<String>) {
	val colors = listOf("Red", "Green", "Blue")
	println(colors::class.qualifiedName)
	
	val days = mutableListOf("Moday", "Tuesday", "Wednesday")
	println(days::class.qualifiedName)
	
	val nums = mutableListOf<Int>()
	nums.add(1)
	println(nums)
	
	val months = mutableSetOf("Jan", "Feb")
	
	val webColors = mapOf("Red" to "ff0000", "Green" to "00ff00", "Blue" to "0000ff")
	println(webColors::class.qualifiedName)
	println(webColors)
	
	//kotlin array is always mutable
	val intArray: IntArray = intArrayOf(1, 2, 3, 4, 5 )
	intArray.set(3, -4)
	intArray.forEach{print("$it ")}
	
}

