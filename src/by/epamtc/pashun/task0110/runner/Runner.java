package by.epamtc.pashun.task0110.runner;

/*Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом h. Результат представить
 *в виде таблицы, первый столбец которой – значения аргумента, второй - соответствующие значения функции.
 */

import by.epamtc.pashun.task0110.entity.IntInputParameter;
import by.epamtc.pashun.task0110.logic.TgXFunction;

public class Runner {

    public static void main(String[] args) {

        IntInputParameter input = new IntInputParameter();
        input.inputABH();

        TgXFunction function = new TgXFunction();
        function.tgX(input.getA(), input.getB(), input.getH());

        function.printResult();
    }
}
