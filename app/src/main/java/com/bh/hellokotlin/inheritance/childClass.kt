package com.bh.hellokotlin.inheritance

fun main(){
    var mem = Member()
    mem.newUser()
}
class Member : User(){
    fun newUser(){
        name = "Brian"
        print()
    }
}