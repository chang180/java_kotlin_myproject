package com.kevin.student;

import java.util.Scanner;

public class StudentRunner {
    public static void main(String[] args) {
        Student.pass = 50;
//        userInput();
        com.kevin.kotlin.Student.getPass(); // kotlin static method
        Student stu = new Student("Kevin", 77, 11);
        Student stu2 = new Student("Eric", 60, 40);
        Student stu3 = new Student("Hank", 100, 100);
        stu.print();
        stu2.print();
        stu3.print();
        System.out.println("High score: " + stu.highest());
    }

    private static void userInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter student's name: ");
        String name = scanner.next();
        System.out.print("Please enter student's english score: ");
        int english = scanner.nextInt();
        System.out.print("Please enter student's math score: ");
        int math = scanner.nextInt();
        System.out.println("Name: " + name + "\nEnglish: " + english + "\nMath: " + math);
        Student stu = new Student(name, english, math);
        stu.print();
        System.out.println("High score: " + stu.highest());
    }
}
