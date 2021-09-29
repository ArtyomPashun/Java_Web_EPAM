package by.epamtc.pashun.task0102.entity;

import java.util.Scanner;

public class IntYearInput {

    int year;

    public int YearInput() {

        try {
            Scanner sc = new Scanner(System.in);
            year = sc.nextInt();
            if (year < 0) {
                throw new Exception("Year should be more than 0");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return year;
    }

    public int getYear() {
        return year;
    }
}
