package com.sebitza.javaexercises.ex1;

public class Main1 {
    public static void main(String[] args) {
        double miles = SpeedConverter.toMilesPerHour(-5.6);
        System.out.println("Miles = " + miles);

        SpeedConverter.printConversion(-5.6);
    }
}
