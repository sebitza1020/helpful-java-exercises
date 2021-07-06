package com.sebitza.javaexercises.ex10;

public class IntEqualityPrinter {
    public static void printEqual(int v1, int v2, int v3) {
        if ((v1 < 0) || (v2 < 0) || (v3 < 0)) {
            System.out.println("Invalid Value");
        } else if ((v1 == v3) && (v2 == v3)) {
            System.out.println("All numbers are equal");
        } else if ((v1 == v2) || (v1 == v3) || (v2 == v3)) {
            System.out.println("Neither all are equal or different");
        } else {
            System.out.println("All numbers are different");
        }
    }

    public static void main(String[] args) {
        printEqual(1, 1, 1);
    }
}
