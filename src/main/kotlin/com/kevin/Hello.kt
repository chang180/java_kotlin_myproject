package com.kevin

fun main() {
    var s:String? = "abcde"
    s = null
    println(s?.length)
    println(s?.get(3))
    println(s?.substring(3))
    println(s?.substring(3, 4))

    val h = Human(weight = 66.5f, height = 1.7f)
//    h.hello()
    println(h.bmi())

    val score = 88
    println(score > 60)
    val c : Char = 'A'
    println(c > 60.toChar())

    /*var age = 19
    var myself = '我'
    age = 20
    var weight = 66.5f
    var name : String = "Kevin"
    name = "Hank"*/


}

class Human(private var name: String = "", private var weight: Float, private var height: Float) {
    init {
        println("test $weight")
    }
//    constructor(weight: Float, height: Float) : this(weight, height)
    fun bmi(): Float {
        return weight / (height * height)
    }
    fun hello() {
        println("Hello Kotlin")
    }
}