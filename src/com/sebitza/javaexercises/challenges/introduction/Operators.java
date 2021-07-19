package com.sebitza.javaexercises.challenges.introduction;

public class Operators {
    public static void main(String[] args) {
        double firstValue = 20.00d;
        double secondValue = 80.00d;
        double myValuesTotal = (firstValue + secondValue) * 100.00d;
        System.out.println("My values total = " + myValuesTotal);
        double remainder = myValuesTotal % 40.00d;
        System.out.println("Remainder = " + remainder);
        boolean isNoReaminder = (remainder == 0);
        System.out.println("Is it remainder? " + isNoReaminder);
        if (!isNoReaminder) {
            System.out.println("Got some remainder");
        }
    }
}
