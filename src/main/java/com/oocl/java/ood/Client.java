package com.oocl.java.ood;

import com.oocl.java.ood.car.JeepCar;
import com.oocl.java.ood.human.Driver;
import com.oocl.java.ood.human.Secretary;
import com.oocl.java.ood.phone.Phone;
import com.oocl.java.ood.car.RaceCar;
import com.oocl.java.ood.human.Boss;
import com.oocl.java.ood.phone.AndroidPhone;
import com.oocl.java.ood.phone.IOSPhone;

public class Client {

    public static void main(String[] args) {
        Driver jimmy = new Driver("jimmy");
        jimmy.setWeight(70);

        jimmy.addPhone(new AndroidPhone("Xiaomi", "128G版本"));
        jimmy.addPhone(new IOSPhone("iPhone", "64G版本"));

        jimmy.setCar(new JeepCar());
        jimmy.drive();

        jimmy.call("1819304059");
        jimmy.sendMessage("Hello");

        jimmy.setCar(new RaceCar());

        jimmy.drive();
        jimmy.brake();

        System.out.println("==============");

        Boss boss = new Boss("SJ");

        boss.setCallable(jimmy);
        boss.callToCustomer("1984948393");

        System.out.println("==============");

        Secretary secretary = new Secretary("Secretary");
        secretary.setPhone(new AndroidPhone("Xiaomi 9", "128G版本"));

        boss.setCallable(secretary);

        boss.callToCustomer("1984974633");

        System.out.println("==============");

        boss.setCallable(new Phone("",""));
        boss.callToCustomer("1984954233");
    }
}
