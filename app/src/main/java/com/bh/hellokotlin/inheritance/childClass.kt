package com.bh.hellokotlin.inheritance

import kotlin.jvm.internal.Intrinsics

fun main(){
    //var mem = Member()
    //mem.newUser()

   /* var bird = Bird()
    bird.move()
    bird.walk()*/

    /*var profile = KotlinImpl()
    profile.name
    profile.getAddress()
    profile.setAddress()*/

    //testGeneric()

    var bottom = Bottom()
    bottom.callVariables()
}
class Member : User(){
    fun newUser(){
        name = "Brian"
        print()
    }
}

//Override
class ChildClass2:BaseClass2() {
    override var opened: String ="you are"
}

//abstract
class Bird:Animal(){
    override fun move(){
        println("move miles by flying")
    }
}

//interface
class KotlinImpl:InterfaceKotlin{
    override var name: String = "Brian"

    override fun getAddress() {
        println("need to write code to get address")
    }

    override fun setAddress() {
        println("to set the address")
    }
}

//Generic
fun testGeneric(){
    var list: MutableList<String> = mutableListOf()
    list.add("mon")
    list.add("tue")
    list.add("wed")

    for(i in list){
        println("it is $i")
    }

    println()

    //there is no difference of list and list2 use of Generic
    val list2 = mutableListOf<String>()

    list2.add("Brian")
    list2.add("May")

    for(a in list2){
        println("My name is $a")
    }
}

//visibility modifiers
class Bottom:Top(){
    fun callVariables(){
        println("protectedVal = ${protectedVal}")
        println("internalVal = ${internalVal}")
        println("defaultVal = ${defaulVal}")
    }
}