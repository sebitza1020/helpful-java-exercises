package com.sebitza.javaexercises.Introduction.ex_8;

public class AreaCalculator {
    public static double area(double radius) {
        if (radius < 0) {
            return -1;
        }
        return (radius * radius) * Math.PI;
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            return -1;
        }
        return x * y;
    }

    public static void main(String[] args) {
        double circleArea = AreaCalculator.area(6);
        System.out.println(circleArea);
        double rectangleArea = AreaCalculator.area(5, 4);
        System.out.println(rectangleArea);
    }
}
