package com.sebitza.javaexercises.ControlFlow.ex_16;

public class FirstLastDigitSum {
    public static int addFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        } else {
            int firstDigit = number % 10;
            while (number >= 10) {
                number /= 10;
            }
            int lastDigit = number;
            return firstDigit + lastDigit;
        }
    }

    public static void main(String[] args) {
        int sum = addFirstAndLastDigit(5);
        System.out.println(sum);
    }
}
