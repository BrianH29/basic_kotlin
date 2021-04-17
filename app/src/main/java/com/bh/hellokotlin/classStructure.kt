package com.bh.hellokotlin

class Person {
    var name = "Max"

    fun print(){
        println("My name is $name")
    }
}

fun main(){
    var person = Person()
    person.name = "Brian"
    person.print()

    User.userName = "Jane"
    User.printName()
    User.play()

    animal.kind = "lion"
    animal.printKind()
}

class User{
    companion object {
        var userName = "Jack"

        fun printName() {
            println("I am $userName")
        }

        fun play(){
            println("my name has been succeful")
        }
    }
}

object animal {
    var kind:String = "mammal"
    fun printKind(){
        println("elephant is $kind")
    }
}