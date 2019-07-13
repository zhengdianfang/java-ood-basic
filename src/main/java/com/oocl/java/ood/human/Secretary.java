package com.oocl.java.ood.human;


import com.oocl.java.ood.Callable;
import com.oocl.java.ood.phone.Phone;

public class Secretary extends Person implements Callable {
    private Phone phone;

    public Secretary(String name) {
        super(name);
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    @Override
    public void call(String targetNumber) {
        System.out.println(String.format("Secretary is calling to %s", targetNumber));
        phone.call(targetNumber);
    }
}
