package com.sebitza.javaexercises.ex_5;

public class DecimalComparator {
    public static boolean areEqualBuThreeDecimalPlaces(double d1, double d2) {
        int a = (int) (d1 * 1000);
        int b = (int) (d2 * 1000);
        return a == b;
    }

    public static void main(String[] args) {
        boolean isIt = DecimalComparator.areEqualBuThreeDecimalPlaces(-3.123, 3.123);
        System.out.println(isIt);
    }
}
