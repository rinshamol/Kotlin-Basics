package com.example
//_______________________________________
//Class with Constructor
//class Person(val name: String, var age: Int) { //primary constructor
//    fun greet() {
//        println("Hi, I am $name and I am $age years old.")
//    }
//}
//fun main() {
//    val person1 = Person("Rinsha", 22)
//    person1.greet()  // Hi, I am Rinsha and I am 22 years old.
//}
//init Block
//Used for initialization when object is created.
//------------------------------------------------
//Create a class User with properties:
//name (String)
//email (String)
//Primary constructor should initialize both properties.
//Add a method greet() that prints:
//"Hello <name>! Your email is <email>."
//In main():
//Take user input for name and email.
//Create a User object.
//Call greet().

class User(var name : String, var email : String){
    init {
        println("Name Length : ${name.length}")
    }
    fun greet(){
        println("Hello $name! Your email is $email")
    }
}
fun main(){
    val user = User("Rinsha", "rin@gmail.com")
    user.greet()
}