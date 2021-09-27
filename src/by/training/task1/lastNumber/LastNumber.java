package by.training.task1.lastNumber;

/**
 * Класс предназначен для нахождения последней цифры квадрата числа, введённого в консоль
 *
 * @author Artyom Pashun
 * @version 1.0 27 Sep 2021
 */

public class LastNumber {

    public void lastNumber(int number) {

        String lastNumber = "Последняя цифра квадрата числа ";

        if (number % 10 == 0) {
            System.out.println(lastNumber + number + "-> 0");
        } else if ((number % 10 == 1) || (number % 10 == 9)) {
            System.out.println(lastNumber + number + "-> 1");
        } else if ((number % 10 == 2) || (number % 10 == 8)) {
            System.out.println(lastNumber + number + "-> 4");
        } else if ((number % 10 == 3) || (number % 10 == 7)) {
            System.out.println(lastNumber + number + "-> 9");
        } else if ((number % 10 == 4) || (number % 10 == 6)) {
            System.out.println(lastNumber + number + "-> 6");
        } else if (number % 10 == 5) {
            System.out.println(lastNumber + number + "-> 5");
        }
    }
}
