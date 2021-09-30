package by.epamtc.pashun.task0106.runner;

/*Идет n-я секунда суток, определить, сколько полных часов,
 *полных минут и секунд прошло к этому моменту.
 */

import by.epamtc.pashun.task0106.entity.IntSecInput;
import by.epamtc.pashun.task0106.logic.HourDeterminant;
import by.epamtc.pashun.task0106.logic.MinDeterminant;
import by.epamtc.pashun.task0106.logic.SecDeterminant;

public class Runner {

    public static void main(String[] args) {

        IntSecInput secInput = new IntSecInput();

        HourDeterminant.howManyHours(secInput.secInput());
        MinDeterminant.howManyMin(secInput.getSec());
        SecDeterminant.howManySec(secInput.getSec());
    }
}
