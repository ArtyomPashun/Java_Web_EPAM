package by.epamtc.pashun.task0103.runner;

/*Окружность вписана в квадрат заданной площади. Найти площадь квадрата,
 *вписанного в эту окружность. Во сколько раз площадь вписанного квадрата
 *меньше площади заданного?
 */

import by.epamtc.pashun.task0103.entity.DoubleSquareAreaInput;
import by.epamtc.pashun.task0103.logic.ComparisonOfSquaresAreas;
import by.epamtc.pashun.task0103.logic.SquareInCircleArea;

public class Runner {
    public static void main(String[] args) {

        DoubleSquareAreaInput squareAreaInput = new DoubleSquareAreaInput();

        SquareInCircleArea.getSquareInCircleArea(squareAreaInput.SquareAreaInput());

        ComparisonOfSquaresAreas.comparison(squareAreaInput.getSquareArea(),
                SquareInCircleArea.getSquareInCircleArea(squareAreaInput.getSquareArea()));
    }
}
