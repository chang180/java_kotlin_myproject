package com.kevin

fun main() {
//    println("Hello Kotlin")
//    Human().hello()
    val h = Human("John doe",66.5f, 1.7f)
//    h.hello()
    println(h.bmi())
    /*var age = 19
    var myself = '我'
    age = 20
    var weight = 66.5f
    var name : String = "Kevin"
    name = "Hank"*/


}

class Human(var name: String = "", var weight: Float, var height: Float) {

    fun bmi(): Float {
        val bmi = weight / (height * height)
        return bmi
    }
    fun hello() {
        println("Hello Kotlin")
    }
}