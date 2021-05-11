package com.learning_kotlin.files

import java.util.*;
import java.math.*;

fun main(args: Array<String>) {
	var result:Any
	
	val randomNumber = Random().nextInt(1)
	
	if(randomNumber == 1)
		result = BigDecimal(30)
	else
		result = "Hello";
	
	println("Result is currently: $result");
	
	if(result is BigDecimal)
		result = result.add(BigDecimal(47))
	else {
		val tempResult = result as String
		result = tempResult.toUpperCase()
	}
	
	println("Result is currently: $result");
}