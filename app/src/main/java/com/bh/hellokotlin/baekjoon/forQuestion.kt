package com.bh.hellokotlin.baekjoon

import java.util.*

//baekjoon for 2739
/*
fun main() = with(Scanner(System.`in`)){
    val num = nextInt()
    for(n in 1..9){
        println("$num * $n = ${num*n}")
    }
}
*/

//baekjoon for 10950
/*fun main() = with(Scanner(System.`in`)){
    val total = nextInt()

    var index:Int = 0
    while(index<total){
        val num1 = nextInt()
        val num2 = nextInt()

        println("${num1 + num2}")
    }
}*/

fun main() = with(Scanner(System.`in`)){
    val total = nextInt()

    var index:Int = 0
    for(i in 1..total){
        val num1 = nextInt()
        val num2 = nextInt()

        println("${num1 + num2}")
    }
}
