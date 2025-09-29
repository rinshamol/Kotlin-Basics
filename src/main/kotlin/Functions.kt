package com.example
//_________________________________________
//Single-Expression Function
//fun multiply(a: Int, b: Int) = a * b
//Function with Multiple Parameters and Return Multiple Values (using Pair)
//fun calculate(a: Int, b: Int): Pair<Int, Int> {
//    val sum = a + b
//    val product = a * b
//    return Pair(sum, product)
//}
//only 2 return values
//-----------------------------------------------
//Write a function greetUser(name: String) that prints a welcome message.
//Write a function square(number: Int) that returns the square of a number.
//Write a function isEven(number: Int) that returns true if the number is even, else false.
//Write a function calculate(a: Int, b: Int) that returns sum, difference, product, and quotient using Pair or Map.
//Write a function with default parameters, e.g., fun greet(name: String = "User", age: Int = 18) and print a formatted message.

fun greetUser(name : String = "Rinsha"){
    println("Hey! $name")
}
fun square(num : Int) : Int{
    return num*num
}
fun isEven(num : Int) = num % 2 == 0

fun calculate(a : Int, b : Int) : Map<String, Int>{
    return mapOf("sum" to a + b, "difference" to a - b, "product" to a * b,"quotient" to a/b)
}

fun main(){
    greetUser()
    greetUser("Aadhil")
    println("Square of  a number = "+square(10))
    println("34 is Even = " + isEven(34))
    println(calculate(5 ,2))
}