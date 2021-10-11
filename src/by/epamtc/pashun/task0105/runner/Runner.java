package by.epamtc.pashun.task0105.runner;

/*Составить программу, печатающую значение true, если указанное высказывание является истинным, и
 *false — в противном случае: является ли целое число совершенным (сумма делителей равна самому числу).
 */


import by.epamtc.pashun.task0105.logic.IsPerfectNumber;
import by.epamtc.pashun.task0105.scanner.IntPositiveInput;


public class Runner {

    public static void main(String[] args) {

        IsPerfectNumber isPerfectNumber = new IsPerfectNumber();

        System.out.println(isPerfectNumber.isPerfect(IntPositiveInput.inputInt()));
    }
}
