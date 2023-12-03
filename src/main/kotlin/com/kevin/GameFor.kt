package com.kevin

fun main() {
    val secret = (1..10).random()
    println(secret)
    for (i in 1..4) {
        print("Please enter a number:(第 $i 次) ")
        val number = readln().toInt()
        print("第 $i 次")
        if (number > secret) {
            println("Lower")
        } else if (number < secret) {
            println("Higher")
        } else {
            println("Great, the number is $number")
            break
        }
    }
        print("Game Over")
}