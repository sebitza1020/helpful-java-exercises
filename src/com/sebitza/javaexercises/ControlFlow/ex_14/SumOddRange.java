package com.sebitza.javaexercises.ControlFlow.ex_14;

public class SumOddRange {
    public static boolean isOdd(int n) {
        if (n < 0) {
            return false;
        } else {
            return n % 2 != 0;
        }
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;
        if (start < 0 || end < 0 || start > end) {
            return -1;
        } else {
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sum += i;
                }
            }
            return sum;
        }
    }

    public static void main(String[] args) {
        int sum = sumOdd(10, 5);
        System.out.println(sum);
    }
}
