package com.learning_kotlin.files

import java.util.*;
import java.math.*;

fun main(args: Array<String>) {
	//var name: String = null
	var name: String? = null
	
	//name = "Saddam"
	
	/*
	if(name != null) //Typecasted to non-nullable string
		println("Name: ${name.toUpperCase()}")
	 */
	
	//println("Name: ${name!!.toUpperCase()}")
	
	println("Name: ${name?.toUpperCase()}")
	
	var address = null
	println("Address type: ${address is Nothing?}")
	
	var pin :Int?  = 7
	
	pin = null
	println("Pin: $pin")
	
}