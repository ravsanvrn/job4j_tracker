package ru.job4j.poly51;

public class Bus implements Vehicle {
    @Override
    public void move() {
        System.out.println("Автобус двигается по скоростным трассам");
    }

    @Override
    public void speed() {
        System.out.println("Медленно");
    }
}
