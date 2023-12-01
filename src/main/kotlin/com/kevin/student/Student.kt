package com.kevin.student
fun main() {
    val stu = Student("Kevin", 60, 99);
    stu.print();
}

class Student(var name: String, var english: Int, var math: Int) {
    fun print() {
        println(name + "\t" + english + "\t" + math +
                "\t" + (english + math) / 2);
    }
}