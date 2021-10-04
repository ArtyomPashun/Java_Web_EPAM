package by.epamtc.pashun.task0201.entity;

public class Ball {

    private final BallColour colour;
    private double weight = 0;

    public Ball(double weight, BallColour colour) {

        this.weight = weight;
        this.colour = colour;
    }

    public double getWeight() {

        return weight;
    }

    public BallColour getColour() {

        return colour;
    }
}

// не переопределил методы toString, hashCode, equals
