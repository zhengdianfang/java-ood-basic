package com.oocl.java.ood.human;


import com.oocl.java.ood.Callable;
import com.oocl.java.ood.car.Car;
import com.oocl.java.ood.phone.Phone;

import java.util.ArrayList;
import java.util.List;

public class Driver extends Person implements Callable {
    private Car car;
    private List<Phone> phones = new ArrayList<>();

    public Driver(String name) {
        super(name);
    }

    public void drive() {
        car.run();
        car.accelerate(10);
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void brake() {
        car.brake();
    }

    public void addPhone(Phone phone) {
        phones.add(phone);
    }

    @Override
    public void call(String targetNumber) {
        System.out.println(String.format("Driver is calling to %s", targetNumber));
        phones.forEach(phone -> phone.call(targetNumber));
    }

    public void sendMessage(String message) {
        phones.forEach(phone -> phone.sendMessage(message));
    }
}
