package com.oocl.java.ood.car;

public class RaceCar extends Car {

    public void drifting() {
        System.out.println(String.format("Race car jump, Speed is %s", getSpeed()));
        super.decelerate(30);
    }

    @Override
    public void run() {
        System.out.println("Race car is running");
        accelerate();
        accelerate();
        accelerate();
        accelerate();
        accelerate();
        drifting();
    }
}
