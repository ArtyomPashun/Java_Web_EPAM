package by.epamtc.pashun.task0201.entity;

import java.util.ArrayList;

public class Basket {

    private ArrayList<Ball> basketArray;

    private double totalWeight = 0;

    private int blueBalls = 0;

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
                blueBalls++;
            }
        }
        return blueBalls;
    }
}

// не переопределил методы toString, hashCode, equals
