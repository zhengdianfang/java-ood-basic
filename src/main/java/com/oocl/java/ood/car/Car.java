package com.oocl.java.ood.car;

public abstract class Car {
    private int speed;
    private String color;
    private String name;

    public abstract void run();

    public void accelerate() {
        speed += 30;
    }

    public int getSpeed() {
        return speed;
    }

    public void accelerate(int upSpeed) {
        speed += upSpeed;
    }

    public void decelerate() {
        speed -= 50;
    }

    public void decelerate(int downSpeed) {
        speed -= downSpeed;
    }

    public void brake() {
        speed = 0;
    }

}
