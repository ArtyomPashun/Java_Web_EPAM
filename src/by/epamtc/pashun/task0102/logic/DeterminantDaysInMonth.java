package by.epamtc.pashun.task0102.logic;

public class DeterminantDaysInMonth {

    public static int setMonthAndGetDays(boolean leapYear, int month) {

        int daysInMonth;

        if (((month < 8) && (month % 2 != 0)) || (((month >= 8) && (month % 2 == 0)))) {
            daysInMonth = 31;
        } else if (month == 2 && leapYear) {
            daysInMonth = 29;
        } else if (month == 2) {
            daysInMonth = 28;
        } else {
            daysInMonth = 30;
        }
        return daysInMonth;
    }
}
