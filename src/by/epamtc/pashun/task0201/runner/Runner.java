package by.epamtc.pashun.task0201.runner;

import by.epamtc.pashun.task0201.entity.Ball;
import by.epamtc.pashun.task0201.entity.BallColour;
import by.epamtc.pashun.task0201.entity.Basket;

public class Runner {
    public static void main(String[] args) {

        Ball blueBall1 = new Ball(0.2, BallColour.BLUE);
        Ball blueBall2 = new Ball(0.4, BallColour.BLUE);
        Ball blueBall3 = new Ball(0.5, BallColour.BLUE);

        Ball blueBall4 = new Ball(0.2, BallColour.RED);
        Ball blueBall5 = new Ball(0.2, BallColour.GREEN);
        Ball blueBall6 = new Ball(0.2, BallColour.GOLD);

        Basket basket = new Basket();

        basket.addBall(blueBall1);
        basket.addBall(blueBall2);
        basket.addBall(blueBall3);
        basket.addBall(blueBall4);
        basket.addBall(blueBall5);
        basket.addBall(blueBall6);

        basket.getBallTotalWeight();
        basket.theNumberOfColourBalls(BallColour.BLUE);
    }
}
