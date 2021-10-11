package by.epamtc.pashun.task0104.logic;

public class AtLeastTwoEvenNumbers {

    public static boolean isTwoOrMoreEven(int... value) {

        int counter = 0;

        if (value == null) {
            throw new IllegalArgumentException();
        }

        for (int number : value) {
            if (number % 2 == 0) {
                counter++;
            }
        }
        return counter >= 2;
    }
}
