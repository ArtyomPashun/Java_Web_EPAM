package by.epamtc.pashun.task0102.entity;

import java.util.Scanner;

public class IntMonthInput {

    int month;

    public int MonthInput() {

        try {
            Scanner sc = new Scanner(System.in);
            month = sc.nextInt();
            if (month <= 0 || month > 12) {
                throw new Exception("Month should be from 1 to 12");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return month;
    }
}
