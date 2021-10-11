package by.epamtc.pashun.task0106.runner;

/*Идет n-я секунда суток, определить, сколько полных часов,
 *полных минут и секунд прошло к этому моменту.
 */

import by.epamtc.pashun.task0106.logic.HourDeterminant;
import by.epamtc.pashun.task0106.logic.MinDeterminant;
import by.epamtc.pashun.task0106.logic.SecDeterminant;
import by.epamtc.pashun.task0106.scanner.IntSecInput;

public class Runner {

    public static void main(String[] args) {

        IntSecInput secInput = new IntSecInput();

        int sec = secInput.secInput();

        System.out.println(HourDeterminant.howManyHours(sec));
        System.out.println(MinDeterminant.howManyMin(sec));
        System.out.println(SecDeterminant.howManySec(sec));
    }
}
