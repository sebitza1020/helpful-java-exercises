package com.sebitza.javaexercises.ex_3;

public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        } else if (hourOfDay >= 8 && hourOfDay <= 22) {
            return false;
        } else return barking;
    }

    public static void main(String[] args) {
        boolean barking = BarkingDog.shouldWakeUp(true, 23);
        System.out.println(barking);
    }
}
