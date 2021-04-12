package com.bh.hellokotlin

fun main(){
    helloWorld();
    println(add(4,5));
    string_template();
    checkNum(1)

     forAndWhile()
}

/**
 * 1. 함수
 * if there is no return you need to give function a type : Unit. which is void in java
 * Redundant 'Unit' return type ==> can be omitted
 */

fun helloWorld() : Unit{
    println("Hello Kotlin World")
}

fun add(a : Int, b: Int) : Int {
    return a + b
}

/**
 * 2. val vs var
 * val = value
 */
fun hi(){
    val a : Int = 10
    var b : Int = 9

    b=100

    val c = 100
    var d = 100
    var name = "Brian"

    var e : String ;
    //var e ===> if you want to leave a variable without a value you need to give a type like on top.
}

/**
 * 3. string template
 */
fun string_template(){
    val name = "Brian"
    val lastName = "Hwang"
    val age = 20
    println("Hi my name is ${name + lastName} I'm ${age}")

    println("is this true? ${1 == 0}")
    println("this is 2\$a")
}

/**
 * 4. conditional expression
 *  if & when
 */
fun maxBy(a:Int,b:Int):Int{
    if(a>b){
        return a
    } else {
        return b
    }
}

fun maxBy2(a:Int, b:Int) : Int = if(a>b) a else b

fun checkNum(score : Int){
    when(score){
        0 -> println("this is 0")
        1 -> println("this is 1")
        2,3 -> println("this is 2 or 3")
    }

    var b : Int = when(score) {
        1 -> 1
        2 -> 2
        else -> 3
    }
    println("b : ${b}")

    when(score){
        in 90..100 -> println("You are genius")
        in 10..80 -> println("not bad")
        else -> println("okay");
    }
}



/**
 * 6. for & while
 */
fun forAndWhile(){
    val students = arrayListOf("joy","jame","jenifer","Boogy")
    val stu = arrayListOf<String>("May","Max","Brook","David")

    for((index,name) in students.withIndex()){
        println("student number ${index+1}: ${name}")
    }

    for(n in stu){
        println("class 2 name : ${n}")
    }

    for(name in students){
        println("${name}")
    }

    var sum : Int = 0
    for(num in 1..5){
        //println("${num}")
        sum += num
    }
    println(sum)

    //step every other 1,3,5
    // expected value of add : 9
    var add : Int = 0
    for(i in 1..5 step 2){
        add += i
    }
    println("add : ${add}")

    // prediction : desc order starting from 5
    for(a in 5 downTo 1){
        println(a)
    }

    // it does not include the last number which is 10 in this case
    for(b in 1 until 10){
        println(b)
    }

    var index = 0
    while(index < 10){
        println("current index : ${index}")
        index++
    }

    for (except in 1..10){
        if(except>3 && except<8){
            continue
        }
        println("continue > 현재 index는 $except 입니다.")
    }
}