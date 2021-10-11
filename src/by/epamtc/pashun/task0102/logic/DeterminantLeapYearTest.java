package by.epamtc.pashun.task0102.logic;

import org.junit.Assert;
import org.junit.Test;

public class DeterminantLeapYearTest {

    @Test
    public void isLeapYearTest_Leap_Value() {
        int year = 2000;
        boolean expected = true;
        boolean actual = DeterminantLeapYear.isLeapYear(year);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isLeapYearTest_NoLeap_Value() {
        int year = 1999;
        boolean expected = false;
        boolean actual = DeterminantLeapYear.isLeapYear(year);

        Assert.assertEquals(expected, actual);
    }

}
