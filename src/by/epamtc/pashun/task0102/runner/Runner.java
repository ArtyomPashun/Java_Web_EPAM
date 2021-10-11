package by.epamtc.pashun.task0102.runner;

/*Составить программу, которая по заданным году и номеру месяца
 *определяет количество дней в этом месяце и корректно
 * определялись все високосные года.
 */

import by.epamtc.pashun.task0102.logic.DeterminantLeapYear;
import by.epamtc.pashun.task0102.scanner.IntDateInput;
import by.epamtc.pashun.task0102.logic.DeterminantDaysInMonth;

public class Runner {
    public static void main(String[] args) {



       System.out.println(DeterminantDaysInMonth.
                setMonthAndGetDays((DeterminantLeapYear.isLeapYear(IntDateInput.YearInput())),
                        IntDateInput.MonthInput()));
    }
}