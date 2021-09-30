package by.epamtc.pashun.task0105.entity;

import java.util.Scanner;

public class IntNumberInput {

    int number;

    public int NumberInput() {

        try {
            Scanner sc = new Scanner(System.in);
            number = sc.nextInt();
            if (number <= 0) {
                throw new Exception("Number should be more than 0");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return number;
    }
}
