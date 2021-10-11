package by.epamtc.pashun.task0108.runner;

/*Вычислить значение заданной функции
 */

import by.epamtc.pashun.task0108.scanner.IntXInput;
import by.epamtc.pashun.task0108.logic.FunctionValue;

public class Runner {

    public static void main(String[] args) {

        IntXInput xInput = new IntXInput();

        System.out.println(FunctionValue.fx(xInput.inputX()));
    }
}
