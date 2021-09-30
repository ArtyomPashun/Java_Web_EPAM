package by.epamtc.pashun.task0110.runner;

/*Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом h. Результат представить
 *в виде таблицы, первый столбец которой – значения аргумента, второй - соответствующие значения функции.
 */

import by.epamtc.pashun.task0110.entity.IntDegreesInput;
import by.epamtc.pashun.task0110.logic.GetTgX;

public class Runner {

    public static void main(String[] args) {

        IntDegreesInput degreesInput = new IntDegreesInput();
        degreesInput.degreeInput();

        GetTgX tgX = new GetTgX();
        tgX.tgX(degreesInput.getA(), degreesInput.getB(), degreesInput.getH());

        tgX.printF();
    }
}
