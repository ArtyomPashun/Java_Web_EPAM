package by.epamtc.pashun.task0104.scanner;

import java.util.Scanner;

public class IntNumberInput {

    public int numberInput() {

        int number;

        System.out.println("Enter int number --->");

        Scanner sc = new Scanner(System.in);

        while (!sc.hasNextInt()) {
            System.out.println("Enter correct int number --->");
            sc.next();
        }

        number = sc.nextInt();
        return number;
    }
}

