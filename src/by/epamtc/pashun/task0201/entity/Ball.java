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

    @Override
    public int hashCode() {
        final int prime = 37;
        int result = 1;
        result = prime * result + ((colour == null) ? 0 : colour.hashCode());
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
        Ball ball = (Ball) obj;
        return weight == ball.weight && ((colour == ball.colour) || (colour != null && colour.equals(ball.getColour())));
    }

    @Override
    public String toString() {
        return getClass().getName() + '@'
                + "colour: " + colour
                + ", weight: " + weight;
    }
}
