package by.epamtc.pashun.task0104.runner;

/*Составить программу, печатающую значение true, если указанное высказывание является
 *истинным, и false — в противном случае: среди заданных целых
 * чисел А, В, С, D есть хотя бы два четных.
 */

import by.epamtc.pashun.task0104.entity.FourIntNumbersInput;
import by.epamtc.pashun.task0104.logic.AtLeastTwoEvenNumbers;

public class Runner {
    public static void main(String[] args) {

        FourIntNumbersInput value = new FourIntNumbersInput();

        AtLeastTwoEvenNumbers isEven = new AtLeastTwoEvenNumbers();

        isEven.isTwoOrMoreEven(value.InputFourIntNumbers());

        System.out.println(isEven.isChecking());

    }

}
