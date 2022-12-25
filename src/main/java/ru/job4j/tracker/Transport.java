package ru.job4j.tracker;

public interface Transport {

    void drive();

    void passengers(int quantity);

    int refuel(int quantity);
}
