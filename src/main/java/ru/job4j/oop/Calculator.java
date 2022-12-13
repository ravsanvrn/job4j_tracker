package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int m) {
        return m - x;
    }

    public int multiply(int a) {
        return x * a;
    }

    public int divide(int d) {
        return d / x;
    }

    public int sumAllOperation(int a) {
        return sum(a) + minus(a) + multiply(a) + divide(a);
    }

    public static void main(String[] args) {
        int a = 10;
        Calculator calculator = new Calculator();
        System.out.println(sum(a));
        System.out.println(minus(a));
        System.out.println(calculator.multiply(a));
        System.out.println(calculator.divide(a));
        System.out.println(calculator.sumAllOperation(a));
    }
}
