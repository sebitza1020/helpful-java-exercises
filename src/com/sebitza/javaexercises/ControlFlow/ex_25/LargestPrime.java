package com.sebitza.javaexercises.ControlFlow.ex_25;

public class LargestPrime {
    public static int getLargestPrime(int number) {
        if (number <= 1) {
            return -1;
        }
        int div = 2;
        while (div < number) {
            if (number % div != 0) {
                div++;
            } else {
                number /= div;
                div = 2;
            }
        }
        return number;
    }

    public static void main(String[] args) {
        System.out.println(getLargestPrime(6));
    }
}
