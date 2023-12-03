package com.kevin.guess;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Random random = new Random();
        int secret = random.nextInt(10) + 1;

        Scanner scanner = new Scanner(System.in);
        int number = 0;

        while (true) {
            System.out.print("Please enter a number: ");
            number = scanner.nextInt();
            System.out.println((number>secret)?"Lower":"Higher");
            if (number == secret) {
                System.out.println("Good guess! Thank you for playing.");
                break;
            }
        }

//        do {
//            System.out.print("Please enter a number: ");
//            number = scanner.nextInt();
//            System.out.println(number);
//        } while (number != 0);
//        }
    }
}
