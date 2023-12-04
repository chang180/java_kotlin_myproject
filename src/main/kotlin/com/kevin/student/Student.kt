package com.kevin.kotlin

import java.util.*

fun main() {
//    userInput()
    Student.pass = 55
    val stu = Student("Kevin", 44, 66);
    val stu2 = Student("Hank", 100, 100);
    val stu3 = Student("Jane", 30, 50);
    stu.print();
    stu2.print();
    stu3.print();
    val gstu = GraduateStudent("Jack", 55, 65, 60);
    gstu.print();
//    var test = 123
//    println("Test is ${test}")
    println("High score: ${stu.highest()}")
}

class GraduateStudent(name: String?, english: Int, math: Int, private var thesis: Int) : Student(name, english, math) {
    companion object {
        var pass = 70
    }
    override fun print() {
        println(
            "$name\t$english\t$math\t$thesis\t${getAverage()}\t${passOrFailed()}\t${grading()}"
        )
    }

    override fun passOrFailed() = if (getAverage() >= pass) "PASS" else "FAILED"
}

open class Student(var name: String?, var english: Int, var math: Int) {
    companion object {
        @JvmStatic  // 這個 annotation 可以讓 Java 程式碼呼叫 Kotlin 的 static method
        var pass = 60
        fun test() {
            println("testing")
        }
    }
    open fun print() {
//        print(
//            name + "\t" + english + "\t" + math +
//                    "\t" + getAverage() + "\t" +
//                    if (getAverage() >= 60) "PASS" else "FAILED"
//        )
//        println("\t" + grading())
        println(
            "$name\t$english\t$math\t${getAverage()}\t${passOrFailed()}\t${grading()}"
        )
    }

    open fun passOrFailed() = if (getAverage() >= pass) "PASS" else "FAILED"

    internal fun grading(): Char = when (getAverage()) {
        in 90..100 -> 'A'
        in 80..89 -> 'B'
        in 70..79 -> 'C'
        in 60..69 -> 'D'
        else -> 'F'
    }

    fun getAverage(): Int = (english + math) / 2

    fun nameCheck() = println(name?.length)

    fun highest(): Int =
        if (english > math) {
            println("english")
            english
        } else {
            println("math")
            math
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


