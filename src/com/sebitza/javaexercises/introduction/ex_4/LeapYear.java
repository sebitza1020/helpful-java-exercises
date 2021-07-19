package com.sebitza.javaexercises.introduction.ex_4;

public class LeapYear {
    public static boolean isLeapYear(int year) {
        if (year <= 1 || year >= 9999) {
            return false;
        } else {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    return year % 400 == 0;
                } else {
                    return true;
                }
            } else {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        boolean isIt = LeapYear.isLeapYear(2000);
        System.out.println(isIt);
    }
}
