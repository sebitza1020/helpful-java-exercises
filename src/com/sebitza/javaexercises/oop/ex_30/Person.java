package com.sebitza.javaexercises.oop.ex_30;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public boolean isTeen() {
        return (getAge() > 12 && getAge() < 20);
    }

    public String getFullName() {
        if (getFirstName().isEmpty() && getLastName().isEmpty()) {
            return "";
        } else if (getLastName().isEmpty()) {
            return getFirstName();
        } else if (getFirstName().isEmpty()) {
            return getLastName();
        } else return getFirstName() + " " + getLastName();
    }
}
