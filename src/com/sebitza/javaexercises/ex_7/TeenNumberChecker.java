package com.sebitza.javaexercises.ex_7;

public class TeenNumberChecker {
    public static boolean hasTeen(int v1, int v2, int v3) {
        if (v1 >= 13 && v1 <= 19) {
            return true;
        } else if (v2 >= 13 && v2 <= 19) {
            return true;
        } else return v3 >= 13 && v3 <= 19;
    }

    public static boolean isTeen(int v) {
        return v >= 13 && v <= 19;
    }

    public static void main(String[] args) {
        boolean hasIt = TeenNumberChecker.hasTeen(22, 18, 27);
        System.out.println(hasIt);
        boolean isIt = TeenNumberChecker.isTeen(13);
        System.out.println(isIt);
    }
}
