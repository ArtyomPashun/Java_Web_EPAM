package by.epamtc.pashun.task0109.runner;

/*Вычислить длину окружности и площадь
 *круга одного и того же заданного радиуса R.
 */

import by.epamtc.pashun.task0109.entity.IntRadiusInput;
import by.epamtc.pashun.task0109.logic.GetCircleArea;
import by.epamtc.pashun.task0109.logic.GetCirclePerimeter;

public class Runner {

    public static void main(String[] args) {

        IntRadiusInput radiusInput = new IntRadiusInput();

        GetCirclePerimeter.getPerimeter(radiusInput.radiusInput());
        GetCircleArea.getArea(radiusInput.getRadius());
    }
}
