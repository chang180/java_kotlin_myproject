package com.kevin;

public class Hello {
    public static void main(String[] args) {
//        System.out.println("Hello world");
        Person p = new Person();
        p.hello();
        p.weight = 66.5f;
        p.height = 1.7f;
        System.out.println(p.bmi());

        /*int age = 19;
        Integer age2 = 49;
        char c = 'c';
        Character c2 = 'A';
        byte b = 120;
        Byte b2 = 120;
        float weight = 66.5f;
        double height = 182.7;
        boolean adult = true;
        boolean enroll = false;
        String name = "Tom";*/

    }
}
