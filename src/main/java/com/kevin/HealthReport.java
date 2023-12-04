package com.kevin;

public class HealthReport implements Report{
    @Override
    public void load() {
        System.out.println("Load health data");
    }

    @Override
    public void print() {
        System.out.println("Print health data");
    }
}
