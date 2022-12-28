package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                return i;
            }
        }
        throw new ElementNotFoundException("Элемен не найжен!");
    }

    public static void main(String[] args) {
        try {
            String[] value = {"qq", "ww", "ee"};
            int rls = indexOf(value, "aa");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}