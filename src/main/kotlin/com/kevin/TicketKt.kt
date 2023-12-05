package com.kevin

import java.util.Random


data class Ticket(val origin: Int, val destination: Int, val price: Int)

fun main () {
    var ticket = Ticket(20, 51, 420)
    val s = "abcg"
    println(s.validate())
    println((1..10).random())
    val r = Random().nextInt(10) + 1 // java的寫法
}

fun String.validate() : Boolean {
    return this.length >= 6
}

fun IntRange.random(): Int {
    return (Math.random() * (endInclusive - start) + start).toInt()
}
