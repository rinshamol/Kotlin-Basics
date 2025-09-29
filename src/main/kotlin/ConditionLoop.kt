package com.example
//_________________________________________
//when
//Kotlin’s replacement for switch.
//Used to check a value or condition and execute corresponding code.
//Example:
//val day = 2
//when(day) {
//    1 -> println("Monday")
//    2 -> println("Tuesday")
//    else -> println("Other day")
//}
//2️ for loop
//Used to repeat a block of code a specific number of times.
//Iterates over ranges, arrays, or collections.
//Example:
//for (i in 1..5) {
//    println(i)
//}
//i automatically increments in each iteration; no need for i++.
//---------------------------------------------------------
//You are building a program to analyze marks of students in a class.
//Requirements:
//Ask the user how many students.
//For each student, read:
//Name (String)
//Marks (Int)
//For each student, print:
//"Grade A" if marks >= 90
//"Grade B" if marks >= 75 and < 90
//"Grade C" if marks >= 50 and < 75
//"Fail" if marks < 50
//After all inputs, print:
//Total number of students passed (marks >= 50)
//Total number of students failed
data class Marks( val marks : Int, val result : String )
fun main(){
    print("Enter Number of Users:")
    val num = readlnOrNull()?.toInt() ?: 0
    val map = mutableMapOf< String,Marks>()
    for (i in 0 until num){
        println("User ${i + 1}")
        print("Enter user name : ")
        val name = readlnOrNull() ?: ""
        print("Enter user mark : ")
        val mark = readlnOrNull()?.toInt() ?: 0
        val res = when{
            mark >= 90 -> "A"
            mark >= 75 -> "B"
            mark >= 50 -> "C"
            else ->  "Failed"
        }
        val marks = Marks(mark, res)
        map[name] = marks
    }
    for (m in map){
        println("Name : ${m.key}, Mark : ${m.value.marks}, Result : ${m.value.result}")
    }
    val pass = map.count{ it.value.result != "Failed" }
    val fail = map.count { it.value.result == "Failed" }
    println("Total number of students passed : $pass")
    println("Total number of students failed : $fail")
}