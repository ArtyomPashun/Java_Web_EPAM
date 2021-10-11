package by.epamtc.pashun.task0109.runner;

/*Вычислить длину окружности и площадь
 *круга одного и того же заданного радиуса R.
 */

import by.epamtc.pashun.task0109.logic.ReceiveCircleArea;
import by.epamtc.pashun.task0109.logic.ReceiveCirclePerimeter;
import by.epamtc.pashun.task0109.scanner.IntRadiusInput;

public class Runner {

    public static void main(String[] args) {

        int radius = IntRadiusInput.receiveRadius();

        System.out.println(ReceiveCirclePerimeter.receivePerimeter(radius));
        System.out.println(ReceiveCircleArea.receiveArea(radius));
    }
}
