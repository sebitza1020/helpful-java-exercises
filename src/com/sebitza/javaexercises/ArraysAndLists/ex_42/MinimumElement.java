package com.sebitza.javaexercises.ArraysAndLists.ex_42;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {

    private static Scanner scanner = new Scanner(System.in);

    private static int readInteger() {
        return scanner.nextInt();
    }

    private static int[] readElements(int count) {
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
}
