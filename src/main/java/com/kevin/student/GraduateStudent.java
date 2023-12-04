package com.kevin.student;

public class GraduateStudent extends Student {
    int thesis;
    static int pass = 70;

    public GraduateStudent(String name, int english, int math, int thesis) {
        super(name, english, math);
        this.thesis = thesis;
    }

    @Override
    public void print() {
        int average = getAverage();

        System.out.println(name + "\t" + english +
                "\t" + math +
                "\t" + thesis +
                "\t" + getAverage() + "\t" +
                ((average >= pass) ? "PASS" : "FAILED") + "\t" +
                (switch (average / 10) {
                    case 10, 9 -> "A";
                    case 8, 7 -> "B";
                    case 6, 5 -> "C";
                    default -> "F";
                })
        );
    }
}
