package by.epamtc.pashun.task0102.logic;

import java.util.Scanner;

public class DeterminantLeapYear {

    boolean isLeapYear = true;

    public boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            isLeapYear = true;
        } else {
            isLeapYear = false;
        }
        return isLeapYear;
    }
}
