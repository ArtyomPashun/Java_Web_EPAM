package by.epamtc.pashun.task0201.entity;

import java.util.ArrayList;
import java.util.Objects;

public class Basket {

    private ArrayList<Ball> basketArray;

    private double totalWeight = 0;

    private int colourBalls = 0;

    public Basket() {

        this.basketArray = new ArrayList<>();
    }

    public void addBall(Ball ball) {

        basketArray.add(ball);
        this.totalWeight = totalWeight + ball.getWeight();

    }

    public double getBallTotalWeight() {

        return totalWeight;
    }

    public int theNumberOfColourBalls(BallColour colour) {

        for (Ball ball : basketArray) {
            if (ball.getColour() == colour) {
                colourBalls++;
            }
        }
        return colourBalls;
    }

    @Override
    public int hashCode() {
        final int prime = 37;
        int result = 1;
        result = prime * result + ((basketArray == null) ? 0 : basketArray.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj == null) || (getClass() != obj.getClass())) {
            return false;
        }
        Basket basket = (Basket) obj;
        return (totalWeight == basket.totalWeight) && (colourBalls == basket.colourBalls)
                && (Objects.equals(basketArray, basket.basketArray));

    }

    @Override
    public String toString() {
        return getClass().getName() + '@'
                + "total weight: " + totalWeight
                + ", colour balls: " + colourBalls;
    }
}
