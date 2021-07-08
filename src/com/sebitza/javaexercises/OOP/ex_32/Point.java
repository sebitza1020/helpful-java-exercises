package com.sebitza.javaexercises.OOP.ex_32;

public class Point {
    private int x;
    private int y;

    public Point() {

    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        int d = ((getX() * getX()) + (getY() * getY()));
        return Math.sqrt(d);
    }

    public double distance(int x, int y) {
        int d = ((getX() - x) * (getX() - x) + (getY() - y) * (getY() - y));
        return Math.sqrt(d);
    }

    public double distance(Point another) {
        int d = ((getX() - another.getX()) * (getX() - another.getX()) + (getY() - another.getY()) * (getY() - another.getY()));
        return Math.sqrt(d);
    }
}
