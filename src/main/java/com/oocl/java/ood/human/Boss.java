package com.oocl.java.ood.human;


import com.oocl.java.ood.Callable;

public class Boss extends Person {
    private Callable callable;

    public Boss(String name) {
        super(name);
    }

    public void setCallable(Callable callable) {
        this.callable = callable;
    }

    public void callToCustomer(String customerNumber) {
        callable.call(customerNumber);
    }
}
