package by.epamtc.pashun.task0107.runner;

/*Даны две точки А(х1, у1) и В(х2, у2). Составить алгоритм, определяющий,
 *которая из точек находится ближе к началу координат. x y.
 */

import by.epamtc.pashun.task0107.entity.IntInputTwoCoordinates;
import by.epamtc.pashun.task0107.logic.GetDistanceToOrigin;
import by.epamtc.pashun.task0107.logic.WhatCloser;

public class Runner {

    public static void main(String[] args) {

        IntInputTwoCoordinates aTwoCoordinates = new IntInputTwoCoordinates();
        aTwoCoordinates.secInput();

        IntInputTwoCoordinates bTwoCoordinates = new IntInputTwoCoordinates();
        bTwoCoordinates.secInput();

        WhatCloser.whatCloser(GetDistanceToOrigin.distance(aTwoCoordinates.getX(), aTwoCoordinates.getY()),
                GetDistanceToOrigin.distance(bTwoCoordinates.getX(), bTwoCoordinates.getY()));
    }
}
