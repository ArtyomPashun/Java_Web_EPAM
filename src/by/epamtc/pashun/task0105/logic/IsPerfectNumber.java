package by.epamtc.pashun.task0105.logic;

public class IsPerfectNumber {

    public boolean isPerfect(int number) {
        int counter = 0;

        for (int i = 1; i <= (number / 2); i++) {
            if (number % i == 0) {
                counter = counter + i;
            }
        }
        return counter == number;
    }
}
