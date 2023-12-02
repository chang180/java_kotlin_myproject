package com.kevin.kotlin

import java.util.Scanner

fun main() {
//    userInput()
    val stu = Student("Kevin", 77, 88);
    stu.print();
//    var test = 123
//    println("Test is ${test}")
    println("High score: ${stu.highest()}")
}
class Student(var name: String?, var english: Int, var math: Int) {
    fun print() {
        println(name + "\t" + english + "\t" + math +
                "\t" + getAverage() + "\t" +
                if (getAverage() >= 60) "PASS" else "FAILED"
        );
    }

    private fun getAverage() : Int = (english + math) / 2

    fun nameCheck() {
        println(name?.length)
    }

    fun highest() : Int {
        var max = if (english > math) {
            println("english")
            english
        } else {
            println("math")
            math
        }
        return max
    }
}

private fun userInput() {
    val scanner = Scanner(System.`in`)
    print("Please enter student's name: ")
//    var name = scanner.next()
    var name = null
    print("Please enter student's english: ")
    var english = scanner.nextInt()
    print("Please enter student's math: ")
    var math = scanner.nextInt()
    val stu = Student(name, english, math);
    stu.print();
    stu.nameCheck()
}


