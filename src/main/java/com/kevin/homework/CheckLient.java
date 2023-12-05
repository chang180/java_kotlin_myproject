package com.kevin.homework;

public class CheckLient {
    public static void main(String[] args) {
        // 設計一個能夠印出從1900年到2050年之前潤年的程式，設計時使用1900到2050的迴圈，每次判斷是否為潤年，是的話就印出該年。請避免使用Calendar的isLient方法判斷，使用 if 判斷式進行設計，練習程式邏輯。
        for (int year = 1900; year <= 2050; year++) {
            if (year % 4 == 0 && year % 100 != 0) {
                System.out.println(year);
            } else if (year % 400 == 0) {
                System.out.println(year);
            }
        }
    }
}
