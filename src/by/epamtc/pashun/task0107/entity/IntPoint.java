package by.epamtc.pashun.task0107.entity;

public class IntPoint {

    int x;
    int y;

    public IntPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IntPoint intPoint = (IntPoint) o;
        return x == intPoint.x && y == intPoint.y;
    }

    @Override
    public int hashCode() {
        return 17 * x + y + 5;
    }

    @Override
    public String toString() {
        return getClass().getName() + "@" +
                "x=" + x +
                ", y=" + y;
    }
}
