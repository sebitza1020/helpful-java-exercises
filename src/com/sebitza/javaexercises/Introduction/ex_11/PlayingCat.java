package com.sebitza.javaexercises.Introduction.ex_11;

public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (summer) {
            return temperature >= 25 && temperature <= 45;
        } else {
            return temperature >= 25 && temperature <= 35;
        }
    }

    public static void main(String[] args) {
        boolean isIt = isCatPlaying(false, 35);
        System.out.println(isIt);
    }
}
