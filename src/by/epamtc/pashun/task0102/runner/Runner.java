package by.epamtc.pashun.task0102.runner;

/*Составить программу, которая по заданным году и номеру месяца
 *определяет количество дней в этом месяце и корректно
 * определялись все високосные года.
 */

import by.epamtc.pashun.task0102.entity.IntMonthInput;
import by.epamtc.pashun.task0102.entity.IntYearInput;
import by.epamtc.pashun.task0102.logic.DeterminantDaysInMonth;
import by.epamtc.pashun.task0102.logic.DeterminantLeapYear;

public class Runner {
    public static void main(String[] args) {

        IntYearInput inputYear = new IntYearInput();
        DeterminantLeapYear isLeapYear = new DeterminantLeapYear();
        isLeapYear.isLeapYear(inputYear.YearInput());

        IntMonthInput inputMonth = new IntMonthInput();
        DeterminantDaysInMonth daysInMonth = new DeterminantDaysInMonth();
        System.out.println(daysInMonth.setMonthAndGetDays(inputYear.getYear(), inputMonth.MonthInput()));


    }
}