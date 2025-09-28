package com.example
//_________________________________________________
// Kotlin has two main keywords for variables:
// val → Immutable (cannot be reassigned once initialized).
// var → Mutable (value can be reassigned).
//---------------------------------------------------

//Q1. Create variables for:
// Your name (String, immutable → val)
// Your age (Int, mutable → var, then update it by +1)
// Your height (Float)
// Whether you like coding (Boolean)
// Print all values in a formatted sentence like: My name is Rinsha, I am 23 years old, my height is 5.4, and it is true that I like coding.

fun main(){
    val name : String = "Rinsha"
    var age : Int = 21
    val height : Float = 159.456f
    print("Do you like coding:")
    val coding : Boolean = readlnOrNull().toBoolean()
    age = 22
    println("My name is $name, I am $age years old, my height is $height, and it is $coding that I like coding.")

}