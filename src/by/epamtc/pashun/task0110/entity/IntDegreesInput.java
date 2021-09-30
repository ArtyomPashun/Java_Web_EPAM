package by.epamtc.pashun.task0110.entity;

import java.util.Scanner;

public class IntDegreesInput {

    double a;
    double b;
    double h;

    public double degreeInput() {

        try {
            Scanner sc = new Scanner(System.in);
            a = sc.nextDouble();
            b = sc.nextDouble();
            h = sc.nextDouble();

            if ((a > b) || (Math.abs(a - b) < h)) {
                throw new Exception();
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return a;
    }

    public double getB() {
        return b;
    }

    public double getH() {
        return h;
    }

    public double getA() {
        return a;
    }
}
