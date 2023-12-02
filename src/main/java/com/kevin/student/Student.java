package com.kevin.student;

public class Student {
    String id;
    String name;
    int english;
    int math;

    public Student(String name, int english, int math) {
        this.name = name;
        this.english = english;
        this.math = math;
    }

    public void print() {
        System.out.print(name + "\t" + english + "\t" + math + "\t" + getAverage());
        if (getAverage() >= 60) {
            System.out.println("\tPASS");
        } else {
            System.out.println("\tFAILED");
        }
    }

    public int getAverage() {
        return (int) Math.floor((double)(english + math) / 2);
    }

    public int highest() {
        return Math.max(english, math);
    }
}
