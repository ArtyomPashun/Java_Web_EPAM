package by.epamtc.pashun.task0110.entity;

import java.util.Scanner;

public class IntInputParameter {

    double a;
    double b;
    double h;

    public void inputABH() {

        try {
            Scanner sc = new Scanner(System.in);
            a = sc.nextDouble();
            b = sc.nextDouble();
            h = sc.nextDouble();

            if ((a > b) || (Math.abs(a - b) < h)) {
                throw new Exception();
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public double getB() {
        return b;
    }

    public double getH() {
        return h;
    }

    public double getA() {
        return a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IntInputParameter that = (IntInputParameter) o;
        return Double.compare(that.a, a) == 0 && Double.compare(that.b, b) == 0 && Double.compare(that.h, h) == 0;
    }

    @Override
    public int hashCode() {
        return 25 * (int) a + (int) b - (int) h + 5;
    }

    @Override
    public String toString() {
        return getClass().getName() + "@" +
                "a=" + a +
                ", b=" + b +
                ", h=" + h;
    }
}
