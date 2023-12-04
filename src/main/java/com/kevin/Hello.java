package com.kevin;

import com.kevin.student.Student;

public class Hello {
    public static void main(String[] args) {
        Student stu = new Student("Kevin", 77, 99);
//        stu.highest(); // 設定為public後，可以在不同package中使用
        stu.print();
//        System.out.println("Hello world");

        com.kevin.kotlin.Student stu2 = new com.kevin.kotlin.Student("Hank", 60, 40);
        stu2.print(); // kotlin預設為public，所以可以在不同package中使用


        String s = "abcde";
        System.out.println(s.charAt(3));
        System.out.println(s.substring(1, 4));
        System.out.println(s.length());
        Person p = new Person("Kevin", 66.5f, 1.7f);
        p.hello();
        System.out.println(p.bmi());
        int score = 88;
        char c = 'a';
        System.out.println(c > score);


//        int age = 19;
//        Integer age2 = 49;
//        char c = '我';
//        Character c2 = 'A';
//        byte b = 120;
//        Byte b2 = 120;
//        float weight = 66.5f;
//        double height = 182.7;
//        boolean adult = true;
//        boolean enroll = false;
//        String name = "Tom";

    }
}
