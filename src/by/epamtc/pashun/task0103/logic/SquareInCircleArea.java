package by.epamtc.pashun.task0103.logic;

public class SquareInCircleArea {

    double newSquareArea;

    public static double getSquareInCircleArea(double squareArea) {

        double circleRadius = Math.sqrt(squareArea) / 2.0;

        double newSquareArea = 2.0 * circleRadius * circleRadius;

        return newSquareArea;
    }

}