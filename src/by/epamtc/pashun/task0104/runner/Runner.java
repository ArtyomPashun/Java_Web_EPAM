package by.epamtc.pashun.task0104.runner;

/*Составить программу, печатающую значение true, если указанное высказывание является
 *истинным, и false — в противном случае: среди заданных целых
 * чисел А, В, С, D есть хотя бы два четных.
 */


import by.epamtc.pashun.task0104.logic.AtLeastTwoEvenNumbers;
import by.epamtc.pashun.task0104.scanner.IntNumberInput;

public class Runner {

    public static void main(String[] args) {

        IntNumberInput input = new IntNumberInput();

        int [] number = new int [4];

        for (int i = 0; i < number.length; i++) {
            number[i] = input.numberInput();
        }
        System.out.println(AtLeastTwoEvenNumbers.isTwoOrMoreEven(number));
    }
}
