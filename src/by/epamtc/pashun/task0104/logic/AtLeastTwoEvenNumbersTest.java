package by.epamtc.pashun.task0104.logic;

import org.junit.Assert;
import org.junit.Test;

public class AtLeastTwoEvenNumbersTest {

    @Test
    public void isTwoOrMoreEven_Test_Input_One_even() {
        int[] value = {1, 3, 5, 7, 9};
        boolean expected = false;
        boolean actual = AtLeastTwoEvenNumbers.isTwoOrMoreEven(value);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isTwoOrMoreEven_Test_Input_Two_Even() {
        int[] value = {0, 1, 2, 3};
        boolean expected = true;
        boolean actual = AtLeastTwoEvenNumbers.isTwoOrMoreEven(value);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isTwoOrMoreEven_Test_Null_Input() {
        int[] value = null;
        boolean expected = false;
        boolean actual = AtLeastTwoEvenNumbers.isTwoOrMoreEven(value);

        Assert.assertEquals(expected, actual);
    }
}
