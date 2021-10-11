package by.epamtc.pashun.task0101.logic;

import org.junit.Assert;
import org.junit.Test;

public class LastDigitDeterminantTest {

    @Test
    public void receiveLastDigitTest_Positive_Value() {
        int a = 125;
        int expected = 5;
        int actual = LastDigitDeterminant.receiveLastDigit(a);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void receiveLastDigitTest_Negative_Value() {
        int a = -6;
        int expected = 6;
        int actual = LastDigitDeterminant.receiveLastDigit(a);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void receiveLastDigitOfSquareTest_Positive_Value() {
        int a = 12;
        int expected = 4;
        int actual = LastDigitDeterminant.receiveLastDigitOfSquare(a);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void receiveLastDigitOfSquareTest_Negative_Value() {
        int a = -12;
        int expected = 4;
        int actual = LastDigitDeterminant.receiveLastDigitOfSquare(a);

        Assert.assertEquals(expected, actual);
    }
}
