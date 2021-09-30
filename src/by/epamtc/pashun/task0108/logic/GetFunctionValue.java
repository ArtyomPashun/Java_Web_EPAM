package by.epamtc.pashun.task0108.logic;

public class GetFunctionValue {

    public static double fx(double x) {

        double result = 0;

        if (x >= 3) {
            result = -(Math.pow(x, 2)) + (3 * x) + 9;
        } else if (x < 3) {
            if (x == Math.cbrt(6)) {
                return 0;
            }
            result = Math.pow((Math.pow(x, 3) - 6), -1);
        }
        return result;
    }
}
