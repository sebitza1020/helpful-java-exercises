package com.sebitza.javaexercises.ControlFlow.ex_15;

public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        int num = number;
        int reverse = 0;
        while (num != 0) {
            int lastDigit = num % 10;
            reverse *= 10;
            reverse += lastDigit;
            num /= 10;
        }
        return reverse == number;
    }

    public static void main(String[] args) {
        boolean isIt = isPalindrome(11);
        System.out.println(isIt);
    }
}
