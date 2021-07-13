package com.sebitza.javaexercises.Challenges.ArraysAndLists;

import java.util.Scanner;

public class MinimumElement {
    private static Scanner scanner = new Scanner(System.in);

    private static int[] readIntegers(int count) {
        int[] array = new int[count];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            scanner.nextLine();
        }
        return array;
    }

    private static int findMin(int[] array) {
        int minimum = Integer.MAX_VALUE;
        for (int j : array) {
            if (j < minimum) {
                minimum = j;
            }
        }
        return minimum;
    }

    public static void main(String[] args) {
        int[] elements = readIntegers(5);
        System.out.println(findMin(elements));
    }
}
