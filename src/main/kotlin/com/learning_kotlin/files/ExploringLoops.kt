package com.learning_kotlin.files

import com.learning_kotlin.classes.*

fun main(args: Array<String>) {
	var x : Int = 0
	
	while(x < 10) {
		println(x)
		x++
	}
	
	val customers = ArrayList<CustomerV4>()
	customers.add(CustomerV4("Nelly", 29, "Los Angeles", "9876543210"))
	customers.add(CustomerV4("Kelly", 29, "Santa Clara", "9876543210"))
	customers.add(CustomerV4("Shelly", 29, "San Diego", "9876543210"))
	
	for(customer in customers)
		println(customer)
	
	for((name, age, address) in customers) {
		println("$name $address $age")
	}
	
	val customerMap = HashMap<Int, CustomerV4>()
	customerMap.put(1, CustomerV4("Nelly", 29, "Los Angeles", "9876543210"))
	customerMap.put(2, CustomerV4("Kelly", 29, "Santa Clara", "9876543210"))
	customerMap.put(3, CustomerV4("Shelly", 29, "San Diego", "9876543210"))
	
	println()
	
	for((key, value) in customerMap)
		println("$value ")
	
	println()
	
	for (i in 0..9)
		print("$i ")
	
	println()
	
	(0..9).forEach { (print("$it ")) }
	
	println()
	
	(9 downTo 0).forEach { (print("$it ")) }
	
	println()
	
	(0 until 10).forEach { (print("$it ")) }
	
	println()
	
	(0..9 step 2).forEach { (print("$it ")) }
	
	println()
	
	('A'..'Z').forEach { (print("$it ")) }
	
}
