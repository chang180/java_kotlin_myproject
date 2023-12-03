package com.kevin

import java.util.Scanner

fun main() {
    val secret = (1..10).random()
    println(secret)
    var number = 0
    Scanner(System.`in`).use { scanner ->
        while (number != secret) {
            print("Please enter a number: ")
//            number = scanner.nextInt()
            number = readln().toInt()
            if (number > secret) {
                println("Lower")
            } else if (number < secret) {
                println("Higher")
            } else {
                println("Great, the number is $number")
            }
        }
    }
}