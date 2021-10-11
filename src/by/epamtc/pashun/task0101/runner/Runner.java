package by.epamtc.pashun.task0101.runner;

import by.epamtc.pashun.task0101.logic.LastDigitDeterminant;
import by.epamtc.pashun.task0101.scanner.IntNumberInput;

/*Написать программу, позволяющую по последней цифре
 *числа определить последнюю цифру его квадрата.
 */

public class Runner {

    public static void main(String[] args) {

        IntNumberInput input = new IntNumberInput();

        System.out.println(LastDigitDeterminant.receiveLastDigitOfSquare(LastDigitDeterminant.receiveLastDigit(input.numberInput())));

    }
}
