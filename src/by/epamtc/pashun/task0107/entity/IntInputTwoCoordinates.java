package by.epamtc.pashun.task0107.entity;

import java.util.Scanner;

public class IntInputTwoCoordinates {

    int x;
    int y;

    public void secInput() {

        try {
            Scanner sc = new Scanner(System.in);
            x = sc.nextInt();
            y = sc.nextInt();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
