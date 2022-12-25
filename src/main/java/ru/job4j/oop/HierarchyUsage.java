package ru.job4j.oop;

public class HierarchyUsage {

    Car car = new Car("Марка", "Модель");
    Transport tp = car;
    Object obj = car;
    Object ocar = new Car("Марка", "Модель");
    Car carFromObject = (Car) ocar;

    //Object bicucle = new Bicycle();
    //Car cb = (Car) bicucle;
}

