package by.epamtc.pashun.task0109.entity;

import java.util.Scanner;

public class IntRadiusInput {

    int radius;

    public int radiusInput() {

        try {
            Scanner sc = new Scanner(System.in);
            radius = sc.nextInt();
            if (radius <= 0) {
                throw new Exception("Radius should be more than 0");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return radius;
    }

    public int getRadius() {
        return radius;
    }
}
