package com.oocl.java.ood.human;

public class Person {
    private final String name;
    private double weight;
    private int heartRate;

    public Person(String name) {
        this.name = name;
    }

    public void eat() {
        weight += 1;
    }

    public void introduce() {
        heartRate += 30;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
