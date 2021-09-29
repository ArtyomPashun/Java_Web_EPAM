package by.epamtc.pashun.task0101.logic;

public class LastDigitDeterminant {

    public static int getLastDigit(int number) {

        return number % 10;
    }

    public static int getLastDigitOfSquare(int number) {

        int lastDigitSquare = number * number;
        return lastDigitSquare % 10;
    }
}
