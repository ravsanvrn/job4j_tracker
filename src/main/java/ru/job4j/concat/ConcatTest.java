package ru.job4j.concat;

import java.util.StringJoiner;

public class ConcatTest {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuilder str = new StringBuilder("Job4j");
        for (int index = 0; index < 9999; index++) {
            str.append(index);
        }
        System.out.println("Миллисекунд: " + (System.currentTimeMillis() - startTime));

        String str2 = "abc".concat("def").concat("ghi").concat("jkl");
        System.out.println(str2);

        String str3 = String.join("_", "abc", "def", "ghi");
        System.out.println(str3);

        StringJoiner stringJoiner = new StringJoiner("=", "<<", ">>");
        stringJoiner.add("abc").add("def").add("ghi");
        System.out.println(stringJoiner);
        String joined = stringJoiner.toString();
        System.out.println(joined);
    }
}
