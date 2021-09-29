package by.epamtc.pashun.task0102.logic;

import java.util.Scanner;

public class DeterminantDaysInMonth {

    int daysInMonth = 0;

    public int setMonthAndGetDays(int year, int month) {
        if (((month < 8) && (month % 2 != 0)) || (((month >= 8) && (month % 2 == 0)))) {
            daysInMonth = 31;
        } else if ((month == 2) && (year % 4 == 0)) {
            daysInMonth = 29;
        } else if ((month == 2) && (year % 4 != 0)) {
            daysInMonth = 28;
        } else {
            daysInMonth = 30;
        }
        return daysInMonth;
    }
}
