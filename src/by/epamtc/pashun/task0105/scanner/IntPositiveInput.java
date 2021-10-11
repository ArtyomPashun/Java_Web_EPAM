package by.epamtc.pashun.task0105.scanner;

import java.util.Scanner;

public class IntPositiveInput {

    public static int inputInt() {

        int number;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter int correct value--->");
            while (!sc.hasNextInt()) {
                System.out.println("You enter incorrect number value...");
                sc.next();
            }
            number = sc.nextInt();
        }
        while (number <= 0);
        sc.close();
        return number;
    }
}
