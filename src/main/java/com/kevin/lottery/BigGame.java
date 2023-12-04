package com.kevin.lottery;

public class BigGame extends NumberGame{
    int numberCount = 6;
    @Override
    public void generate() {
        for (int i = 0; i < numberCount; i++) {
            numbers.add((int)(Math.random() * 49 + 1));
        }
    }
}
