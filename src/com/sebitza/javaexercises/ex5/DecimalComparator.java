package com.sebitza.javaexercises.ex5;

public class DecimalComparator {
    public static boolean areEqualBuThreeDecimalPlaces(double d1, double d2) {
        int a = (int) (d1 * 1000);
        int b = (int) (d2 * 1000);
        return a == b;
    }
}
