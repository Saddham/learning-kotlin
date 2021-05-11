package com.learning_kotlin.classes

class Customer (val name: String,
				val address: String,
				var age: Int) {
	
	
	constructor(name: String, age: Int) : this(name, "", age){
		println("Secondary constructor")
	}
	
	init {
		println("Init block")
	}
	
}

fun main(args: Array<String>) {
	val customer = Customer("Saddam", "Hyderabad", 28)
	
	customer.age = 29
	
	println("${customer.name} is ${customer.age} years old")
	
	val customer2 = Customer("John", 30)
	
	println("${customer2.name} is ${customer2.age} years old")
	
	val customerV3 = CustomerV3("Bill", 31)
	customerV3.approved = true
	
	println("${customerV3.name} is ${customerV3.age} years old and is ${customerV3.approved}")
	
	val customerV32 = CustomerV3("Will", 20)
	customerV32.approved = true
	
	println("${customerV32.name} is ${customerV32.age} years old")
	println("Next year ${customerV32.upperCaseName()} will be ${customerV32.nextAge} years old and is ${customerV32.approved}")
	println(customerV32.toString())
	
	val customerV33 = CustomerV3.getInstance()
	println("${customerV33.name} is ${customerV33.age} years old")
	
	val customerV4 = CustomerV4("Sally", 29, "Los Angeles")
	println(customerV4)
	
	val customerV42 = customerV4.copy(name="Diane")
	println(customerV42)
	
	val (name, age, address) = customerV4
	
	println("$name is $age years old and lives at $address")
	
	val customerV43 = CustomerV4("Nelly", 29, "Los Angeles", "9876543210")
	println(customerV43)
	
	customerV43.favoriteColor = "Red"
	println("Fovorite color: ${customerV43.getLastLetterOfColor()}")
	println("Fovorite color type: ${customerV43.getColorType()}")
	
}


class CustomerV2 (val name: String, val age: Int) {
	var address: String
	
	init {
		address = ""
	}
	
	constructor(name: String, address:String, age: Int) : this(name, age) {
		this.address = address
	}
	
}

class CustomerV3 (val name: String,
				  var age: Int,
				  val address: String = "") {
	
	var approved: Boolean = false
	set(value) =
		if(age >= 21)
			field = value
		else
			println("You can't approve a customer under 21 years old")
	
	
	val nextAge
	get() = age + 1
	
	fun upperCaseName() =
		name.toUpperCase()
	
	override fun toString() =
		"$name $address $age"
		
	companion object {
		fun getInstance() = CustomerV3("Penny", 22, "Los Angeles")
	}
	
}

data class CustomerV4 (val name: String, val age: Int) {
	var address: String
	var phone: String? = null
	var favoriteColor: String?= null
	
	
	init {
		address = ""
	}
	
	constructor(name: String, age: Int, address:String) : this(name, age) {
		this.address = address
	}
	
	constructor(name: String, age: Int, address:String, phone: String) : this(name, age) {
		this.address = address
		this.phone = phone
	}
	
	operator fun component3() = address
	
	fun getPhoneNumber() =
			phone ?: "-1"
	
	fun getLastLetter(a: String): String {
		return a.takeLast(1)
	}
	
	fun getUpperCaseColor(): String {
		return favoriteColor?.toUpperCase() ?: ""
	} 
	 
	
	fun getLastLetterOfColor(): String {
		return favoriteColor?.let{getLastLetter(it)} ?: ""
	}
	
	fun getColorType(): String {
		val color = getUpperCaseColor()
		
		return when(color) {
			"" -> "Empty"
			"RED", "GREEN", "BLUE" -> "RGB"
			else -> "Other"
		}
	}
	
	override fun toString() =
		"$name $address $age ${this.getPhoneNumber()}"
	
}

