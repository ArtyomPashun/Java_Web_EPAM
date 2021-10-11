package by.epamtc.pashun.task0106.scanner;

import java.util.Scanner;

public class IntSecInput {

    public int secInput() {

        int sec;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter int sec correct value--->");
            while (!sc.hasNextInt()) {
                System.out.println("You enter incorrect sec value...");
                sc.next();
            }
            sec = sc.nextInt();
        }
        while (sec < 0 || sec >= 86400);
        sc.close();
        return sec;
    }
}
