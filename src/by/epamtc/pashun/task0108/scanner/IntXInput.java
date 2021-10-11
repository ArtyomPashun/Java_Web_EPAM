package by.epamtc.pashun.task0108.scanner;

import java.util.Scanner;

public class IntXInput {

    public double inputX() {

        double x;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter int x value--->");

        while (!sc.hasNextInt()) {
            System.out.println("You enter incorrect x value...");
            sc.next();
        }
        x = sc.nextInt();
        sc.close();
        return x;
    }
}
