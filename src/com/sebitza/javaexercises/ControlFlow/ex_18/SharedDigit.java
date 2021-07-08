package com.sebitza.javaexercises.ControlFlow.ex_18;

public class SharedDigit {
    public static boolean hasSharedDigit(int a, int b) {
        if ((a < 10) || (a > 99) || (b < 10) || (b > 99)) {
            return false;
        }
        while (a != 0) {
            int bb = b;
            int digitA = a % 10;
            while (bb != 0) {
                int digitB = bb % 10;
                if (digitA == digitB) {
                    return true;
                } else {
                    bb /= 10;
                }
            }
            a /= 10;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(15,55));
    }
}
