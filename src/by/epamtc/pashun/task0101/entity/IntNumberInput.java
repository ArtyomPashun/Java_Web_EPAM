package by.epamtc.pashun.task0101.entity;

import java.util.Scanner;

public class IntNumberInput {

    int number;

    public int NumberInput() {

        try {
            Scanner sc = new Scanner(System.in);
            number = sc.nextInt();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return number;
    }
}



