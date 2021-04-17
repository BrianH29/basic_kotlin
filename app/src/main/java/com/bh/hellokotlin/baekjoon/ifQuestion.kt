package com.bh.hellokotlin.baekjoon

import java.util.*

//baekjoon if 1330
/*
fun main(args:Array<String>) = with(Scanner(System.`in`)){
    println("input number: ")
    val a = nextInt()
    val b = nextInt()

    if(a>b){
        println(">")
    } else if (a<b){
        println("<")
    } else {
        println("==")
    }
}
*/

// baekjoon if 9498
/*
fun main(args:Array<String>) = with(Scanner(System.`in`)){
    when(nextInt()){
        in 90..100 -> println("A")
        in 80..89 -> println("B")
        in 70..79 -> println("C")
        in 60..69 -> println("D")
        else -> println("F")
    }
}
*/

//baekjoon if 2753
/*
fun main(args:Array<String>) = with(Scanner(System.`in`)){
    println("input num: ")

    val num = nextInt()
    if(num%4 == 0 && num%100 != 0 || num%400 == 0){
        println("1")
    }else {
        println("0")
    }
}
*/

//baekjoon if 14681
/*
fun main(arg:Array<String>) = with(Scanner(System.`in`)){
    println("input two num : ")
    val x = nextInt()
    val y = nextInt()

    if(x>0 && y>0){
        println("1")
    } else if (x>0 && y<0){
        println("4")
    } else if(x<0 && y>0){
        println("2")
    } else {
        println("3")
    }
}

fun main() = with(Scanner(System.`in`)){
    val x = nextInt()
    val y = nextInt()

    when{
        x>0 && y>0 -> println("1")
        x>0 && y<0 -> println("4")
        x<0 && y>0 -> println("2")
        else -> println("3")
    }
}
*/

//baekjoon if 2884
fun main() = with(Scanner(System.`in`)){
    var hour = nextInt()
    var min = nextInt()

    if(min < 45) {
        hour--
        min = (60-(45-min))

        if(hour < 0){
            hour = 23
        }
        println("${hour} ${min}")
    } else {
        println("${hour} ${60-min}")
    }
}