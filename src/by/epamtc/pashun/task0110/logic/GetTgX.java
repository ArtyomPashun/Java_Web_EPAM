package by.epamtc.pashun.task0110.logic;

import java.util.ArrayList;
import java.util.List;

public class GetTgX {

    List<Double> arrayTgX = new ArrayList<>();
    List<Double> arrayA = new ArrayList<>();

    public List<Double> tgX(double a, double b, double h) {

        while (a <= b) {
            arrayA.add(a);
            double tgX = Math.tan(a);
            arrayTgX.add(tgX);
            a = a + h;
        }
        return arrayTgX;
    }

    public void printF() {
        for (int i = 0; i < arrayTgX.size(); i++) {

            System.out.println(arrayA.get(i) + "   " + arrayTgX.get(i));
        }
    }
}