package by.epamtc.pashun.task0106.entity;

import java.util.Scanner;

public class IntSecInput {

    int sec;

    public int secInput() {

        try {
            Scanner sc = new Scanner(System.in);
            sec = sc.nextInt();
            if ((sec < 0) || (sec >= 86400)) {
                throw new Exception("Seconds should be from 0 to 86400 in day");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return sec;
    }

    public int getSec() {
        return sec;
    }
}
