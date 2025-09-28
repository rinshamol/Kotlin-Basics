package com.example
//You are creating a small program that formats a user’s profile for display.
//Requirements:
//Ask the user to enter:
//Name (String)
//Age (Int)
//City (String)
//Store the values in variables.
//Print the profile using string templates:
//Name: <name>
//Age: <age>
//City: <city>
//Perform the following string operations:
//Print the length of the name
//Print the name in uppercase
//Check if the city starts with a capital letter
//Print the first 3 letters of the city

fun main(){
    print("Enter your Name:")
    val name : String = readlnOrNull() ?: ""
    print("\nEnter your Age:")
    val age : Int = readlnOrNull()?.toInt() ?: 0
    print("Enter your City:")
    val city : String = readlnOrNull() ?: ""
    println("The Length of Name: ${name.length}")
    println("User Name : ${name.uppercase()}")
    if (city.startsWith(city[0].uppercase())){
        println("City Name is Valid ${city.substring(0,3)}")
    }else{
        println("City Name is Invalid")
    }
}