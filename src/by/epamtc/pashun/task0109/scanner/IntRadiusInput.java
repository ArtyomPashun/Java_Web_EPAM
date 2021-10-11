package by.epamtc.pashun.task0109.scanner;

import java.util.Scanner;

public class IntRadiusInput {

    public static int receiveRadius() {

        int radius;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter int radius --->");
            while (!sc.hasNextInt()) {
                System.out.println("Enter correct int radius --->");
                sc.next();
            }
            radius = sc.nextInt();
        } while (radius <= 0);
        sc.close();
        return radius;
    }
}
