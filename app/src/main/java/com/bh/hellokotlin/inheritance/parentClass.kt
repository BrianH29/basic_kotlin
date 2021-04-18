package com.bh.hellokotlin.inheritance

import android.util.Log

open class User(){
    var name = "Jenny"
    fun print(){
        println("My name is $name")
    }
}

//Override
open class BaseClass2(){
    open var opened: String = "I am"
}

//abstract
abstract class Animal{
    fun walk(){
        println("is walking")
    }

    abstract fun move()
}

//interface
interface InterfaceKotlin{
    var name : String
    fun getAddress()
    fun setAddress()
}

//visibility modifiers
open class Top{
    private val privateVal = 1
    protected open val protectedVal = 2
    internal val internalVal = 3
    val defaulVal = 4
}