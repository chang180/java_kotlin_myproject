package com.kevin.parking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Tester {
    public static void main(String[] args) {
        LocalDateTime enter = LocalDateTime.of(2023, 12, 5, 8, 0, 0);
        LocalDateTime leave = LocalDateTime.of(2023, 12, 5, 10, 38, 0);
        Car car = new Car("AA-0001", enter);
        car.setLeave(leave);
        System.out.println(car.getDuration());
        int hours = (int) Math.floor(car.getDuration() / 60.0);
        int minutes = (int)car.getDuration() % 60;
        if(minutes >30) {
            hours += 1;
        }
        System.out.println(hours);
        System.out.println(30 * hours);


        // java8 new calendar object
        // testJava8();

        // testDate();
        // testCalender();
    }

    private static void testJava8() {
        Instant instant = Instant.now();
        System.out.println(instant);
        // local time
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println(formatter.format(now));
        System.out.println(now.plus(Duration.ofHours(3)));
        LocalDateTime other = LocalDateTime.of(2021, 3, 1, 8, 0, 30);
        System.out.println(other);
    }

    private static void testCalender() {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
        calendar.set(Calendar.MONTH, 0);
        System.out.println(calendar.getTime());
        calendar.add(Calendar.DAY_OF_YEAR, 3);
        System.out.println(calendar.getTime());
    }

    private static void testDate() {
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getTime());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String s = "2021/03/01 08:00:00";
        try {
            Date other = sdf.parse(s);
            System.out.println(other);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
