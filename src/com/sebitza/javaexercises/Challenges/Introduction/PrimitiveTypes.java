package com.sebitza.javaexercises.Challenges.Introduction;

public class PrimitiveTypes {
    public static void main(String[] args) {
        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 50;

        long longTotal = 5000L + 10L * (byteValue + shortValue + intValue);
        System.out.println(longTotal);

        short shortTotal = (short) (1000 + 10 * (byteValue + shortValue + intValue));
        System.out.println(shortTotal);
    }
}
