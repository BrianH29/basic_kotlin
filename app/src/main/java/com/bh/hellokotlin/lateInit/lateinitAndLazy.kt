package com.bh.hellokotlin.lateInit

fun main(){
    //var person = Person()
    //person.process()

    var com = Company()
    com.process()
}

class Person(){
    /*
    var name:String? = null
    init{
        name = "Brian"
    }
    fun process(){
        name?.plus(" Hwang")
        println("my name is $name")
        println("name length = ${name?.length}")
        println("first letter of the name = ${name?.substring(0,1)}")
    }
    */

    lateinit var name: String
    init{
        name = "Brian"
    }
    fun process(){
        name.plus("Hwang")
        println("name length = ${name.length}")
        println("first letter of the name = ${name.substring(0,1)}")
    }
}

fun String.plus(word:String): String{
    return this + word
}

class Company{
    //val person : Person by lazy {Person()}
    val person by lazy{Person()}

    fun process(){
        println("person의 이름은 ${person.name}")
    }
}