package ru.job4j.tracker;

public class Bus implements Transport {

    @Override
    public void drive() {
        System.out.println("Поехали!");
    }

    @Override
    public void passengers(int quantity) {
        System.out.println("Количество пассажиров: " + quantity);
    }

    @Override
    public int refuel(int quantity) {
        return quantity * 60;
    }

    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.drive();
        bus.passengers(25);
        System.out.println("Заправка 50 литров, за " + bus.refuel(50) + " рублей");
    }

}
