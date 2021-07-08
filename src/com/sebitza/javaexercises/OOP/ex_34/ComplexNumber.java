package com.sebitza.javaexercises.OOP.ex_34;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add(double real, double imaginary) {
        ComplexNumber newComplex = new ComplexNumber(real, imaginary);
        this.real = this.real + newComplex.getReal();
        this.imaginary = this.imaginary + newComplex.getImaginary();
    }

    public void add(ComplexNumber complexNumber) {
        this.real = this.real + complexNumber.getReal();
        this.imaginary = this.imaginary + complexNumber.getImaginary();
    }

    public void subtract(double real, double imaginary) {
        ComplexNumber newComplex = new ComplexNumber(real, imaginary);
        this.real = this.real - newComplex.getReal();
        this.imaginary = this.imaginary - newComplex.getImaginary();
    }

    public void subtract(ComplexNumber complexNumber) {
        this.real = this.real - complexNumber.getReal();
        this.imaginary = this.imaginary - complexNumber.getImaginary();
    }
}
