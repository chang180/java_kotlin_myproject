package com.kevin.student;

public class Student {
    String id;
    public String name;
    public int english;
    public int math;
    static int pass = 60;

    public Student(String name, int english, int math) {
        this.name = name;
        this.english = english;
        this.math = math;
    }

    public void print() {
        int average = getAverage();

        System.out.println(name + "\t" + english +
                "\t" + math +
                "\t" + getAverage() + "\t" +
                ((average >= pass) ? "PASS" : "FAILED") + "\t" +
                ( switch (average / 10) {
                    case 10, 9 -> "A";
                    case 8, 7 -> "B";
                    case 6, 5 -> "C";
                    default -> "F";
                })
                );
//        char grading = 'F';
//        switch (average / 10) {
//            case 10:
//                case 9:
//                    grading = 'A';
//                    break;
//            case 8:
//                case 7:
//                    grading = 'B';
//                    break;
//            case 6:
//                case 5:
//                    grading = 'C';
//                    break;
//            default:
//                grading = 'F';
//        }

//        if (average >= 60) {
//            System.out.println("\tPASS");
//        } else {
//            System.out.println("\tFAILED");
//        }
    }

    public int getAverage() {
        return (int) Math.floor((double)(english + math) / 2);
    }

    public int highest() {
        return Math.max(english, math);
    }
}
