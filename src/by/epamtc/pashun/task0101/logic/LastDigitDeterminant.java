package by.epamtc.pashun.task0101.logic;

public class LastDigitDeterminant {

    public static int receiveLastDigit(int number) {

        return number % 10;
    }

    public static int receiveLastDigitOfSquare(int number) {

        int lastDigitSquare = number * number;

        return lastDigitSquare % 10;
    }
}
