package by.epamtc.pashun.task0105.logic;

public class IsPerfectNumber {

    int counter = 0;
    int number;

    public int setNumber(int number) {

        this.number = number;

        for (int i = 1; i <= (number / 2); i++) {
            if (number % i == 0) {
                counter = counter + i;
            }
        }
        return counter;
    }

    public boolean isPerfect() {
        if (counter == number) {
            return true;
        } else {
            return false;
        }
    }
}
