package by.training.task1.runner;

/*Написать программу, позволяющую по последней цифре числа
 *определить последнюю цифру его квадрата.
 */

import by.training.task1.lastNumber.LastNumber;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        LastNumber lastNumber = new LastNumber();

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: --->");

        while (sc.hasNext() && !sc.hasNextInt()) {
            System.out.print("Введите пожалуйста число! \n ---> ");
            sc.next();
        }
        lastNumber.lastNumber(sc.nextInt());
    }
}
