package com.oocl.java.ood.phone;

public class AndroidPhone extends Phone {
    public AndroidPhone(String name, String type) {
        super(name, type);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("IOS: " + message);
    }
}
