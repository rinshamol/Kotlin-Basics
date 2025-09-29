package com.example
//_______________________________________________
//A collection is a container that holds multiple items (like numbers, strings, objects).
//Kotlin provides three main types of collections:
//List → Ordered collection, can have duplicates.
//Set → Unordered collection, no duplicates.
//Map → Key-value pairs, keys are unique.
//List
//Immutable List (cannot add/remove elements):
//val fruits = listOf("Apple", "Banana", "Orange")
//println(fruits[0])  // Apple
//Mutable List (can add/remove elements):
//val fruits = mutableListOf("Apple", "Banana")
//fruits.add("Orange")
//fruits.remove("Banana")
//println(fruits)
//Set
//Stores unique elements:
//val numbers = setOf(1, 2, 3, 3, 4)
//println(numbers)  // [1, 2, 3, 4]
//val mutableNumbers = mutableSetOf(1, 2)
//mutableNumbers.add(3)
//println(mutableNumbers)  // [1, 2, 3]
//Map
//Stores key-value pairs:
//val user = mapOf("name" to "Rinsha", "email" to "rinsha@example.com")
//println(user["name"])  // Rinsha
//val mutableUser = mutableMapOf("name" to "Rinsha")
//mutableUser["email"] = "rinsha@example.com"
//println(mutableUser)  // {name=Rinsha, email=rinsha@example.com}
//Useful Collection Operations
//forEach → iterate over collection
//fruits.forEach { println(it) }
//filter → get elements meeting a condition
//val longFruits = fruits.filter { it.length > 5 }
//map → transform elements
//val upperFruits = fruits.map { it.uppercase() }
//contains → check if element exists
//println(fruits.contains("Apple"))
//------------------------------------------
//Scenario:
//You are building a small program to manage user information in an app.
//Requirements:
//Store Users
//Each user has: name (String) and email (String).
//Store all users in a List.
//Ensure Unique Emails
//Use a Set to store emails to prevent duplicates.
//Lookup User by Email
//Use a Map where email is the key and name is the value.
//Operations to implement:
//Add a new user (check if email already exists).
//Print all user names.
//Print all unique emails.
//Given an email, print the user’s name (lookup in map).

data class Users(val name : String, val email : String)
fun main(){
    print("Enter Number of Users:")
    val num = readlnOrNull()?.toInt() ?: 0
    val list = mutableListOf<Users>()
    val set = mutableSetOf<Users>()
    val map = mutableMapOf<String, String>()

    for ( i in 0 until   num){
        println("User ${i+1}")
        print("Enter user name : ")
        var name = readlnOrNull() ?: ""
        print("Enter user email : ")
        var email = readlnOrNull() ?: ""
        val user = Users(name, email)
        list.add(user)
        set.add(user)
        map[email] = name
    }
    println("users list: $list")
    println("unique user list: $set")
    println("Enter email to check exist or not : ")
    val email  = readlnOrNull() ?: ""
    val user = list.find { it.email == email }
    if(user != null ){
        println("User found : ${user.name}")
    }else{
        println("Email Not Found")
    }
    list.forEach { println(it.name) }
    set.forEach { println(it.email) }
}