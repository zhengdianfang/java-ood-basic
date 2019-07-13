package com.oocl.java.ood.phone;


import com.oocl.java.ood.Callable;

public class Phone implements Callable {
    private final String name;
    private final String type;

    public Phone(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public void sendMessage(String message) {
        System.out.println(message);
    }

    @Override
    public void call(String targetNumber) {
        System.out.println(String.format("Phone is calling to %s", targetNumber));
    }
}
