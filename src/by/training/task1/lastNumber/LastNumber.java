package by.training.task1.lastNumber;

/**
 * Класс предназначен для нахождения последней цифры квадрата числа, введённого в консоль
 *
 * @author Artyom Pashun
 * @version 1.0 27 Sep 2021
 */

public class LastNumber {

    public void lastNumber(int x) {

        String lastNumber = "Последняя цифра квадрата числа ";

        if (x % 10 == 0) {
            System.out.println(lastNumber + x + "-> 0");
        } else if ((x % 10 == 1) || (x % 10 == 9)) {
            System.out.println(lastNumber + x + "-> 1");
        } else if ((x % 10 == 2) || (x % 10 == 8)) {
            System.out.println(lastNumber + x + "-> 4");
        } else if ((x % 10 == 3) || (x % 10 == 7)) {
            System.out.println(lastNumber + x + "-> 9");
        } else if ((x % 10 == 4) || (x % 10 == 6)) {
            System.out.println(lastNumber + x + "-> 6");
        } else if (x % 10 == 5) {
            System.out.println(lastNumber + x + "-> 5");
        }
    }
}
