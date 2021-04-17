package com.bh.hellokotlin.baekjoon

import com.bh.hellokotlin.main
import java.util.*

/*
fun main(args:Array<String>){
    val scan = Scanner(System.`in`)
    println("Enter a number:")
    val input = scan.nextInt()
    print(input)
}
*/

fun main(args:Array<String>) = with(Scanner(System.`in`)){
    print("번호")
    println(nextInt() - nextInt());
}

