package com.bh.hellokotlin

/*fun main(){
    var nullable: String?
    //nullable = "Brian"
    nullable = null
    println("practice nullable $nullable")
}*/

fun main(){
//    show(null)
//    println(testSafeCall(null)) //null
//    println(testSafeCall("My Name is Brian")) //16
    println(testElvis("Brian")) //5
    println(testElvis(null)) // 0
    test()
}

//allowing null in function parameter
fun show(str:String?){
    /**
     * 인자 값이 널 허용 되었을 경우 코드 블럭에서 조건식으로 먼저 인자가 널인지 아닌지 확을 해야 지만 사용 가능하다 아래 와같이 str.length는 사용 불가하다.
     * error : only safe(?.) or non-null asserted(!!.) calls are allowed on a  nullable receiver of type string
     *  var length2 = str.length
     */
    if(str != null){
        var length2 = str.length
    }

    println("testing of null $str")
}

//safe call
fun testSafeCall(str:String?):Int?{
    var resultNull:Int? = str?.length
    return resultNull
}

/**
 * elvis operator
 * return null with default value that has been set ?:0 -> value can be changed as I want
 * there is no need for ? behind returning type because return type has default of 0
 */
fun testElvis(str:String?):Int{
    var result:Int = str?.length?:0
    return result
}

fun testElvis2(str:String?):String{
    var result:String = str?:"May"
    return result
}

fun test(){
    var nullable:String? = null
    var size = nullable?.length?:33
    println("checking the result of the test $size")
}
