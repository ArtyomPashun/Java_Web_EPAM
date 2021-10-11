package by.epamtc.pashun.task0102.logic;

public class DeterminantLeapYear {

    public static boolean isLeapYear(int year) {

        boolean isLeapYear;

        if (year % 4 == 0) {
            if (year % 100 == 0 && year % 400 != 0) {
                return isLeapYear = false;
            } else {
                isLeapYear = true;
            }
        } else {
            isLeapYear = false;
        }
        return isLeapYear;
    }
}

