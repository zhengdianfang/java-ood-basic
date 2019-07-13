package com.oocl.java.ood.phone;

public class IOSPhone extends Phone {
    public IOSPhone(String name, String type) {
        super(name, type);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Android: " + message);
    }
}
