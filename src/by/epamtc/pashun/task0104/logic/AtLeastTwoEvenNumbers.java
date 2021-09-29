package by.epamtc.pashun.task0104.logic;

public class AtLeastTwoEvenNumbers {

    boolean checking;
    int counter = 0;

    public boolean isChecking() {
        return checking;
    }

    public boolean isTwoOrMoreEven(int[] value) {
        for (int i = 0; i < 4; i++) {
            if (value[i] % 2 == 0) {
                counter++;
            }
        }
        if (counter >= 2) {
            checking = true;
        } else {
            checking = false;
        }
        return checking;
    }
}
