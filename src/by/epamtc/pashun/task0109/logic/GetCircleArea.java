package by.epamtc.pashun.task0109.logic;

public class GetCircleArea {

    public static double getArea(int radius) {

        double area = 0;

        area = Math.pow(radius, 2) * Math.PI;

        return area;
    }
}
