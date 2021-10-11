package by.epamtc.pashun.task0102.logic;

import org.junit.Assert;
import org.junit.Test;

public class DeterminantDaysInMonthTest {

    @Test
    public void enterMonthReceiveDaysTest_Leap_Year() {
        boolean leapYear = true;
        int month = 2;
        int expected = 29;
        int actual = DeterminantDaysInMonth.enterMonthReceiveDays(leapYear,month);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void enterMonthReceiveDaysTest_Not_Leap_Year() {
        boolean leapYear = false;
        int month = 2;
        int expected = 28;
        int actual = DeterminantDaysInMonth.enterMonthReceiveDays(leapYear,month);

        Assert.assertEquals(expected, actual);
    }
}
