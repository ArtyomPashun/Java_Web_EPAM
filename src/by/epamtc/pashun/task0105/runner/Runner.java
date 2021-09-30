package by.epamtc.pashun.task0105.runner;

/*Составить программу, печатающую значение true, если указанное высказывание является истинным, и
 *false — в противном случае: является ли целое число совершенным (сумма делителей равна самому числу).
 */

import by.epamtc.pashun.task0105.entity.IntNumberInput;
import by.epamtc.pashun.task0105.logic.IsPerfectNumber;

public class Runner {

    public static void main(String[] args) {

        IntNumberInput input = new IntNumberInput();
        IsPerfectNumber isPerfectNumber = new IsPerfectNumber();

        isPerfectNumber.setNumber(input.NumberInput());
        isPerfectNumber.isPerfect();
    }
}
