package by.epamtc.pashun.task0103.entity;

import java.util.Scanner;

public class DoubleSquareAreaInput {

    double squareArea;

    public double SquareAreaInput() {

        try {
            Scanner sc = new Scanner(System.in);
            squareArea = sc.nextDouble();
            if (squareArea <= 0) {
                throw new Exception("Square area should be more than 0");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return squareArea;
    }

    public double getSquareArea() {
        return squareArea;
    }
}
