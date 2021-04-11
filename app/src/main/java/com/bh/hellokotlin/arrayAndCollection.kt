package com.bh.hellokotlin

fun main(){
    //arr()
    //listCollection()
    //setCollection()
    mapCollection()
    hashMap()
}

/**
 * 1. Array
 */

fun arr(){
    val array = arrayOf(1,2,3)
    val list = listOf(1,2,3)

    val array2 = arrayOf(1,"d",3,4f)
    val list2 = listOf(1,"d",11L)

    array[0] = 3

    val result = list.get(0)

    val arrayList = arrayListOf<Int>()
    arrayList.add(10)
    arrayList.add(20)


    //Array
    var students = IntArray(3)
    students.set(0, 120)
    students[1] = 99
    students.set(2,88)

    var answer = students.get(1)
    println(answer)

    for(i in students){
        println("index of ${i}")
    }
    println()
    //difference of arrayOf & intArrayOf : same
    val test = arrayOf(1,2,3,4)
    val test2 = intArrayOf(1,2,3,4)

    for(i in test){
        println("test ===> $i")
    }

    for(j in test2){
        println("test2 ====> $j")
    }
}

/**
 * 2. collection list
 * - List - read only
 * - MutableList - read & write
 * - it has index number of saved data and duplicated values can be added
 */
fun listCollection(){
    //Collection difference of list & mutableList
    val list1 = listOf("mon","tue","wed",1)
    val mutableList = mutableListOf("mon","tue","wed")
    val mutable = mutableListOf<String>("mon","tue","wed","1")

    println("print of list ${list1}")
    //outcome : [mon, tue, wed, 1]
    println("print of mutable list ${mutableList}")
    //outcome : [mon,tue,wed]

    //list1.add("thu") ==> new value cannot be added. if you want to have flexible collection you need to use mutable
    mutableList.add("thu")
    mutable.add("fri")
    mutable.set(3,"thu")

    println("print of mutable list $mutableList")
    //outcome : [mon, tue, wed, thu]
    println("print of mutable $mutable")
    //outcome : [mon, tue, wed, thu, fri]

    mutableList.removeAt(0)
    println("print of mutable list $mutableList")
    //outcome : [tue, wed, thu]

    //creating empty list
    val stringList = mutableListOf<String>()
    stringList.add("Jan")
    stringList.add("Feb")
    stringList.add("Mar")
    stringList.add("Mar")

    stringList.set(0,"1월")
    stringList.removeAt(1)
    println("print empty stringList with new value $stringList")
}

/**
 * 3. set Collection
 * - similar to list collection but cannot be looked up with the index
 * - cannot enter duplicated value
 */
fun setCollection(){
    // empty set collection
    val set = mutableSetOf<String>()

    // initial value setting
    val setVal = setOf("Jane","Brian","May")
    val valSet = mutableSetOf("Happy","Sad")

    println(set) //[]
    println(setVal) //[Jane, Brian, May]

    set.add("Max")
    set.add("David")
    set.add("Max")

    valSet.add("Angry")
    valSet.add("Enjoy")
    valSet.add("Happy")
    println("mutable set add $set") // [Max,David] duplicated value(X)
    println("valSet result $valSet") // [Happy, sad, Angry, Enjoy]

    //set cannot have duplicated value, and there is no index number.
    //in order to remove a value you have to search with the actual value
    set.remove("Max")
    valSet.remove("Angry")

    println("mutable set add $set") //[David]
    println("valset result $valSet") // [Happy, Sad, Enjoy]
}

/**
 * 4. map Collection
 * - key & value
 * - key is similar to list collection index but it has to be entered
 * - cannot have duplicated key value
 */
fun mapCollection(){

    //empty map collection
    val map = mutableMapOf<String, String>()
    val map2 = mutableMapOf<Int,String>()

    //immutable initial value setting
    val mapVal = mapOf<String,String>("food" to "apple","food2" to "banana")

    //mutable initial value setting
    val mutableVal = mutableMapOf<String,String>("car" to "kia", "car2" to "kia")

    map.put("brand1","nike")
    map.put("brand2","adidas")

    map2.put(1,"candy")
    map2.put(2,"chocolate")

    // mapVal.put("food","cherry") //immutable map cannot add new value
    mutableVal.put("car3","benz")

    println("print map value ${map.get("brand")}")
    println("print map2 value ${map2.get(2)}")
    println("print mapVal value ${mapVal.get("food")}")
    println("print mutableVal value ${mutableVal.get("car")} ")
    println()

    println("print map value $map")
    println("print map2 value $map2")
    println("print mapVal value $mapVal")
    println("print mutableVal value $mutableVal")
    println()
}

/**
 * 5.hashMap Collection
 *
 */
fun hashMap(){
    //empty map collection
    val hashMap = hashMapOf<String, String>()

    //immutable initial value setting
    val hashMap2 = hashMapOf<String, String>("car" to "kia", "car2" to "kia")


    //mutable initial value setting

    hashMap.put("car","benz")
    //hashMap2.put("car","bmw")

    println("print hashMap value $hashMap")
    println("print hashMap value ${hashMap.get("car")}")
    println("print hashMap2 value $hashMap2")
    println("print hashMap2 value ${hashMap2.get("car")}")

}