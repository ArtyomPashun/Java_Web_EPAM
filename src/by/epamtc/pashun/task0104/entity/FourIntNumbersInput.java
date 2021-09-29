package by.epamtc.pashun.task0104.entity;

import java.util.Scanner;

public class FourIntNumbersInput {

    int [] value = new int[4];

    public int [] InputFourIntNumbers() {

        try {
            Scanner sc = new Scanner(System.in);
            for (int i = 0; i < 4; i++) {
                value[i] = sc.nextInt();
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return value;
    }
}
