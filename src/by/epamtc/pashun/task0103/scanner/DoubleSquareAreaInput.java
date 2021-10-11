package by.epamtc.pashun.task0103.scanner;

import java.util.Scanner;


public class DoubleSquareAreaInput {

    double squareArea;

    public double squareAreaInput() {

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Input correct square area --->");
            while (!sc.hasNextInt()) {
                System.out.println("Enter correct area value...");
                sc.next();
            }
            squareArea = sc.nextDouble();
        } while (squareArea <= 0);
        sc.close();
        return squareArea;
    }

    public double getSquareArea() {
        return squareArea;
    }

    public void setSquareArea(double squareArea) {
        this.squareArea = squareArea;
    }
}
