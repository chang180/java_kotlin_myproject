package com.kevin.day;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.YearMonth;
import java.util.Calendar;
import java.util.concurrent.atomic.AtomicIntegerArray;

public class DayOfYear {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("請輸入月份:");
        Calendar now = Calendar.getInstance();
        int year = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH) + 1;
        int day = now.get(Calendar.DAY_OF_MONTH);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Please input the year: (default: "+ now.getWeekYear() +")");
            String inputYear = reader.readLine();
            year = inputYear.isEmpty() ? year : Integer.parseInt(inputYear);
            System.out.println("Please input the month: (default: "+ month +")");
            String inputMonth = reader.readLine();
            month = inputMonth.isEmpty() ? month : Integer.parseInt(inputMonth);
            System.out.println("Please input the day: (default: "+ day +")");
            String inputDay = reader.readLine();
            day = inputDay.isEmpty() ? day : Integer.parseInt(inputDay);
            System.out.println("The date is: " + year + "/" + month + "/" + day);

            // 該年度的月份
            YearMonth currentYearMonth = YearMonth.of(year, month);

            // 创建整数数组以存储每个月的天数
            AtomicIntegerArray daysInMonth = new AtomicIntegerArray(new int[12]);

            // 循环计算每个月的天数并存储在数组中
            for (int i = 1; i <= 12; i++) {
                YearMonth yearMonth = YearMonth.of(currentYearMonth.getYear(), i);
                int days = yearMonth.lengthOfMonth();
                daysInMonth.set(i - 1, days);
            }
            // 计算天数
            int days = 0;
            for (int i = 0; i < month - 1; i++) {
                days += daysInMonth.get(i);
            }
            days += day;
            System.out.println("The day of year is: " + days);

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Input Error");
        }

    }
}
