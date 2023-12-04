package com.kevin.lottery;

public class Game539 extends NumberGame{
    int numberCount = 5;


    @Override
    public void generate() {
        for (int i = 0; i < numberCount; i++) {
            numbers.add((int)(Math.random() * 39 + 1));
        }
    }
}
