package com.kevin.student;

public class StudentRunner {
    public static void main(String[] args) {
        Student stu = new Student("Kevin", 66, 88);
        stu.print();
        System.out.println("High score: " + stu.highest());
    }
}
