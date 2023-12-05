package com.kevin.homework

fun main() {
    // 設計一個能夠印出從1900年到2050年之前潤年的程式，設計時使用1900到2050的迴圈，每次判斷是否為潤年，是的話就印出該年。請避免使用Calendar的isLient方法判斷，使用 if 判斷式進行設計，練習程式邏輯。
    for (year in 1900..2050) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            println(year)
        }
    }
}