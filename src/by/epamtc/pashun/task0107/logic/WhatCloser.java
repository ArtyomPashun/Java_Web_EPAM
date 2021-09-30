package by.epamtc.pashun.task0107.logic;

public class WhatCloser {

    public static int whatCloser(double aDistance, double bDistance) {
        if (aDistance > bDistance) {
            return 1;
        } else if (aDistance < bDistance) {
            return -1;
        } else {
            return 0;
        }
    }
}

