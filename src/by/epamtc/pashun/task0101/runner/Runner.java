package by.epamtc.pashun.task0101.runner;

import by.epamtc.pashun.task0101.entity.IntNumberInput;
import by.epamtc.pashun.task0101.logic.LastDigitDeterminant;

/*Написать программу, позволяющую по последней цифре
 *числа определить последнюю цифру его квадрата.
 */

public class Runner {

    public static void main(String[] args) {

        IntNumberInput input = new IntNumberInput();

        LastDigitDeterminant.getLastDigitOfSquare(LastDigitDeterminant.getLastDigit(input.NumberInput()));
    }
}
