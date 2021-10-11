package by.epamtc.pashun.task0102.scanner;

import java.util.Scanner;

public class IntDateInput {

    public static int YearInput() {

        int year;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter int year correct value--->");
            while (!sc.hasNextInt()) {
                System.out.println("You enter incorrect year value...");
                sc.next();
            }
            year = sc.nextInt();
        }
        while (year <= 0);
        return year;
    }

    public static int MonthInput() {

        int month = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter int month correct value--->");
            while (!sc.hasNextInt()) {
                System.out.println("You enter incorrect month value...");
                sc.next();
            }
            month = sc.nextInt();
        }
        while (month <= 0 || month > 12);
        sc.close();
        return month;
    }
}
