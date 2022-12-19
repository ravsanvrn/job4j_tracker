package ru.job4j.record;

public record PersonRecord(String name, int age) {
    @Override
    public String toString() {
        return "PersonRecord{"
                + "name='" + name + '\''
                + ", age=" + age + '\''
                + '}';
    }
}
