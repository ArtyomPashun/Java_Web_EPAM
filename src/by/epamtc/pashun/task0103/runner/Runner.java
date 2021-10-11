package by.epamtc.pashun.task0103.runner;

/*Окружность вписана в квадрат заданной площади. Найти площадь квадрата,
 *вписанного в эту окружность. Во сколько раз площадь вписанного квадрата
 *меньше площади заданного?
 */

import by.epamtc.pashun.task0103.logic.AreasComparison;
import by.epamtc.pashun.task0103.logic.SquareInCircle;
import by.epamtc.pashun.task0103.scanner.DoubleSquareAreaInput;

public class Runner {
    public static void main(String[] args) {

        DoubleSquareAreaInput squareArea = new DoubleSquareAreaInput();

        System.out.println(SquareInCircle.receiveSquareInCircleArea(squareArea.squareAreaInput()));

        System.out.println(AreasComparison.comparisonSquareAreas(squareArea.getSquareArea(),
                SquareInCircle.receiveSquareInCircleArea(squareArea.getSquareArea())));
    }
}
