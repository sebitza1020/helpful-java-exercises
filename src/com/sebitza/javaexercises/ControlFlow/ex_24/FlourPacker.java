package com.sebitza.javaexercises.ControlFlow.ex_24;

public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        int bigCountQuantity = bigCount * 5;

        int total = bigCountQuantity + smallCount;
        if (total == goal) {
            return true;
        } else if (bigCountQuantity % goal != 0) {
            while (bigCountQuantity > goal) {
                bigCountQuantity -= 5;
            }
        }
        int smallValue = (goal - bigCountQuantity);
        return smallCount >= smallValue;
    }

    public static void main(String[] args) {
        System.out.println(canPack(0, 5, 4));
    }
}
