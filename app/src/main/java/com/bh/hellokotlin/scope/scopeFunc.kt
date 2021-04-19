package com.bh.hellokotlin.scope

fun main(){
    //process()
    //returnProcess()
    returnLastCode()
}

fun process(){
    var list = mutableListOf("Scope", "Function","Super")
    list.run{
        //val listSize = this.size // this 생략 가능
        val listSize = size
        println("list length of run = $listSize")
    }

    var letList = mutableListOf("Brian","May","Max","Jenny","Jane")
    letList.let{ // it -> 생략된 형태
        val letSize = it.size
        println("list length of let = $letSize")
    }

    var applyList = mutableListOf("apple","banana","kiwi")
    applyList.apply{
        val applySize = size
        println("list length of apply = $applySize")
    }

    with(list){
        val withSize = size
        println("list length of with = $withSize")
    }

    var itList = mutableListOf("elephant","lion","monkey","whale","cheetah","kangaroo")
    itList.also{
        val alsoSize = it.size
        println("list length of also = $alsoSize")
    }
}

// apply and also returns itself. Regardless of next code
fun returnProcess(){
    var list = mutableListOf("scrope","function","jelly")

    val afterApply = list.apply {
        add("Chill")
        count()
    }
    println("return apply = $afterApply")

    val afterAlso = list.also{
        it.add("Cake")
        it.count()
    }
    println("return also = $afterAlso")
}

//let & run & with returns the last code
fun returnLastCode(){
    var list = mutableListOf("scrope","function","jelly")

    val lastCount = list.let{
        it.add("Sharp")
        it.count()
    }
    println("return let = $lastCount")

    val lastItem = list.run{
        add("run")
        get(size-1)
    }
    println("return run = $lastItem")

    val lastWith = with(list){
        add("with")
        get(size-1)
    }
    println("return with = $lastWith")
}
