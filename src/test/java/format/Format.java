package format;

import java.util.Calendar;

public class Format {

    public static void getGreeting(String name, int age) {
        System.out.format("Привет! Я %s%n", name);
        System.out.format("Привет! Я %s, мой возраст: %d", name, age);
    }

    public static void getGreetingAndTime(String name) {
        Calendar instance = Calendar.getInstance();
        System.out.printf("Привет, %s! Текущая дата: %tF, Текущее время: %tT%n", name, instance, instance);
    }

    public static void main(String[] args) {
        getGreeting("Елена", 28);
        getGreetingAndTime("Елена");
        System.out.printf("Задаем число 0.99 - %.2f%n", 0.99);
        System.out.printf("%1$,+016.2f%n", 5000000.0000);
    }

}