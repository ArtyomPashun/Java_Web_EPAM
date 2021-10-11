package by.epamtc.pashun.task0107.runner;

/*Даны две точки А(х1, у1) и В(х2, у2). Составить алгоритм, определяющий,
 *которая из точек находится ближе к началу координат. x y.
 */

import by.epamtc.pashun.task0107.entity.IntPoint;
import by.epamtc.pashun.task0107.logic.DistanceToOrigin;
import by.epamtc.pashun.task0107.logic.WhatCloser;

public class Runner {

    public static void main(String[] args) {

        IntPoint pointA = new IntPoint(4, 1);
        IntPoint pointB = new IntPoint(1, 1);
        int result;

        result = WhatCloser.whatCloser(DistanceToOrigin.receiveDistance(pointA.getX(), pointA.getY()),
                DistanceToOrigin.receiveDistance(pointB.getX(), pointA.getY()));

        switch (result) {
            case 1:
                System.out.println("B point is closer");
                break;
            case -1:
                System.out.println("A point is closer");
                break;
            case 0:
                System.out.println("Distance to 0 for both points is equal");
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + result);
        }
    }
}
