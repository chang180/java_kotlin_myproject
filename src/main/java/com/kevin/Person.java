package com.kevin;

public class Person {
    String name;
    float weight;
    float height;

    public float bmi() {
        float result = weight / (height * height);
        return result;
    }
    public void hello() {
        System.out.println("Hello world");
    }
}
