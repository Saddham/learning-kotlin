package com.getting_started_with_kotlin.files

import kotlin.math.roundToInt
import java.math.BigDecimal

fun main(args: Array<String>) {
	//var name: String = "Saddham"
	//val surname: String = "Pathan"
	var name = "Saddam"
	val surname = "Pathan"
	
	//System.out.println(name + " " + surname)
	println("$name $surname");
	
	name = "Ammar"
	//surname = "Pathan"
	
	//System.out.println(name + " " + surname)
	println("$name $surname");
	println("First name has ${name.length} characters")
	println("Hello ${surname.toUpperCase()}")
	println("Hello \${surname.toUpperCase()}")
	
	val story = """It was a dark and stormy night.
				|A foul smell crept across the city.
				|Jane wondered what time it was, and when it would be daylight.""".trimMargin("|")
	
	println(story)
	
	val changedStory = story.replaceAfterLast("it", " would be down.")
	
	println(changedStory)
	
	val myDouble = 21.4
	println("Is myDouble a Double? ${myDouble is Double}")
	println("myDouble is a ${myDouble::class.qualifiedName}")
	println("myDouble's javaClass is ${myDouble.javaClass}")

	val myInteger = myDouble.roundToInt()
	println("Is myInteger an Integer? ${myInteger is kotlin.Int}")
	println("myInteger is an ${myInteger::class.qualifiedName}")
	println("myInteger javaClass is ${myInteger.javaClass}")
	
	//val anotherInteger:Integer = 17
	val anotherInteger:Int = 17
	println("Is anotherInteger an Integer? ${anotherInteger is kotlin.Int}")
	println("anotherInteger is an ${anotherInteger::class.qualifiedName}")
	println("anotherInteger javaClass is ${anotherInteger.javaClass}")
	
	val myFloat:Float = 13.6f
	println("Is myFloat an Integer? ${myFloat is kotlin.Float}")
	println("myFloat is an ${myFloat::class.qualifiedName}")
	println("myFloat javaClass is ${myFloat.javaClass}")
	
	val bd = BigDecimal(17)
	val bd2 : BigDecimal
	bd2 = bd.add(BigDecimal(30))
	
	println(bd2)
	
	
	
	
	
	
}