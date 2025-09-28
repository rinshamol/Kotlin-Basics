package com.example

//Scenario:
//You are creating a small program to analyze a student’s score in two subjects. You also want to check if the student passed, and perform some updates on the scores.
//Requirements:
//Declare variables:
//subject1 and subject2 (Int) → student’s marks
//isEnrolled (Boolean) → whether the student is enrolled
//extraCredit (Int) → extra marks
//Arithmetic Operators:
//Calculate and print the total marks of the two subjects.
//Assignment Operators:
//Add extraCredit to subject1 using += and print the updated score.
//Create another Boolean variable hasPassed (true if marks >= 35 in both subjects).
//Combine with isEnrolled using &&, ||, and ! and print the results.
//Increment & Decrement:
//Increment subject1 by 1 using ++.
//Decrement subject2 by 1 using --.
//Print both updated scores.

fun main(){
    print("Enter Subject1 and Subject2 marks :")
    var sub1 : Int = readlnOrNull()?.toInt() ?: 0
    var sub2 : Int = readlnOrNull()?.toInt() ?: 0
    println("Is enrolled :")
    val isEnrolled : Boolean = readlnOrNull()?.toBoolean() ?: false
    println("Extra credits :")
    val extraMarks : Int = readlnOrNull()?.toInt() ?:0
    var isPassed : Boolean = false
    sub1 += extraMarks
    if(sub1 < 25 || sub2 < 25){
        sub1++
        sub2++
    }
    if (sub1 + sub2 >= 50){
        isPassed = true
    }
    if(isEnrolled){
        println("Student Marks Details:")
        println("Subject 1 : $sub1  Subject2 : $sub2")
        println("Extra credits : $extraMarks")
        println("Total marks : ${sub1 + sub2}")
        if (isPassed){
            println("Passed🎉🎉")
        }else{
            println("Failed😖😖")
        }

    }else{
        println("Not Enrolled😏😏😏")
    }





}