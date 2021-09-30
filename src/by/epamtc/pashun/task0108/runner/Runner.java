package by.epamtc.pashun.task0108.runner;

/*Вычислить значение заданной функции
 */

import by.epamtc.pashun.task0108.entity.IntXInput;
import by.epamtc.pashun.task0108.logic.GetFunctionValue;

public class Runner {

    public static void main(String[] args) {

        IntXInput xInput = new IntXInput();

        System.out.println(GetFunctionValue.fx(xInput.getX()));
    }
}
