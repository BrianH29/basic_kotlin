package com.bh.hellokotlin.inheritance


fun main(){
    textStringExtension()
}

fun textStringExtension(){
    var original = "Hello"
    var added = "Guys~~"

    println("${original.plus(added)}")
}

fun String.plus(word:String):String{
    return this+word
}

fun testExtension(){
    val name = "Brian"
    val birth = "2000.01.01"
    val age = 30
    val addr = "Sungnam Korea"

    println("")
}