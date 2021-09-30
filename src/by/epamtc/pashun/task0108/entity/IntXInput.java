package by.epamtc.pashun.task0108.entity;

import java.util.Scanner;

public class IntXInput {

    double x;

    public double getX() {

        try {
            Scanner sc = new Scanner(System.in);
            x = sc.nextDouble();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return x;
    }
}
