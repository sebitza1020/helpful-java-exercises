package com.sebitza.javaexercises.introduction.ex_6;

public class EqualSumChecker {
    public static boolean hasEqualSum(int v1, int v2, int v3) {
        int s = v1 + v2;
        return v3 == s;
    }

    public static void main(String[] args) {
        boolean isIt = EqualSumChecker.hasEqualSum(1, -1, 0);
        System.out.println(isIt);
    }
}
