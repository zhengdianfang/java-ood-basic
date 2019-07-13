package com.oocl.java.ood.car;

public class JeepCar extends Car {

    public void jump() {
        super.decelerate(10);
        System.out.println(String.format("Jeep car jump, Speed is %s", getSpeed()));
    }

    @Override
    public void run() {
        System.out.println("Jeep car is running");
        accelerate();
        accelerate();
        jump();
    }
}
