package com.kevin;

import com.kevin.kotlin.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentTest {
    @Test
    void highestTest() {
        Student student = new Student("Kevin", 77, 11);
        Assertions.assertEquals(77, student.highest());
    }

    @Test
    void averageTest() {
        Student student = new Student("Kevin", 77, 11);
        Assertions.assertEquals((77 + 11) / 2, student.getAverage());
    }
}
