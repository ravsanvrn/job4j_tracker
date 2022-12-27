package ru.job4j.oop;

public class HierarchyUsage {

    public static void main(String[] args) {
        Car car = new Car("Марка", "Модель");
        Transport tp = car;
        Object obj = car;
        Object ocar = new Car("Марка", "Модель");
        Car carFromObject = (Car) ocar;
    }
}

