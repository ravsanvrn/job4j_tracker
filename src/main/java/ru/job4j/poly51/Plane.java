package ru.job4j.poly51;

public class Plane implements Vehicle {
    @Override
    public void move() {
        System.out.println("Самолет летает по воздуху");
    }

    @Override
    public void speed() {
        System.out.println("Быстро");
    }
}
