package com.example
//You are creating a small utility to process user input for an Android app.
//Requirements:
//Ask the user to enter:
//Full name
//Email address
//Phone number (with country code, e.g., +91 9876543210)
//A short bio (multiline text)
//Process and display the inputs using string functions:
//Name:
//Remove extra spaces (trim())
//Capitalize the first letter of each word
//Print the length of the name
//Print the first 3 letters
//Email:
//Convert to lowercase
//Check if it contains "@" and ends with ".com"
//Phone Number:
//Remove the country code prefix (removePrefix("+91 "))
//Check if all remaining characters are digits
//Bio:
//Trim leading/trailing spaces
//Split into words and print each word on a new line
//Print the total number of words
fun main(){
    print("Enter Full Name : ")
    var name : String = readlnOrNull() ?: ""
    print("Enter Email : ")
    var email : String = readlnOrNull() ?: ""
    print("Enter Phone Number : ")
    var phone : String = readlnOrNull() ?: ""
    print("Enter a short bio : ")
    var bio : String = readlnOrNull() ?: ""

    name = name.trim().replaceFirstChar { it.uppercaseChar() }
    name = name.replace(" ","")
    println("Name : $name, Length : ${name.length}, First 3 Characters : ${name.substring(0,3)}")
    email = email.lowercase()
    if(email.contains("@") && email.contains(".com")){
        println("$email is Valid")
    }else{
        println("$email is Invalid")
    }
    phone = phone.replace("+91","")
    if(phone.all { it.isDigit() }){
        println("$phone is Valid")
    }else{
        println("$phone is Invalid")
    }
    bio = bio.trim()
    val bios = bio.split(" ")
    var count = 1
    for (b in bios){
        println("word $count $b")
        count++
    }
    println("Total number of words: ${bios.size}")
}
