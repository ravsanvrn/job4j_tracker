package ru.job4j.early;

import static java.lang.Character.*;

public class PasswordValidator {

    public static String validate(String password) {
        if (password == null) {
            throw new IllegalArgumentException("Password can't be null");
        }
        if (password.length() < 8 || password.length() > 32) {
            throw new IllegalArgumentException("Password should be length [8, 32]");
        }
        if (password.toUpperCase().equals(password)) {
            throw new IllegalArgumentException("Password should contain at least one lowercase letter");
        }
        if (password.toLowerCase().equals(password)) {
            throw new IllegalArgumentException("Password should contain at least one uppercase letter");
        }
        if (!containsNumber(password)) {
            throw new IllegalArgumentException("Password should contain at least one figure");
        }
        if (allNumberOrSymbol(password)) {
            throw new IllegalArgumentException("Password should contain at least one special symbol");
        }
        if (password.toLowerCase().contains("qwerty")
                || password.contains("12345")
                || password.toLowerCase().contains("password")
                || password.toLowerCase().contains("admin")
                || password.toLowerCase().contains("user")) {
            throw new IllegalArgumentException("Password shouldn't contain substrings: qwerty, 12345, password, admin, user");
        }
        return password;
    }

    private static boolean containsNumber(String value) {
        for (int i = 0; i < value.length(); i++) {
            if (isDigit(value.charAt(i))) {
                return true;
            }
        }
        return false;
    }

    private static boolean allNumberOrSymbol(String value) {
        for (int i = 0; i < value.length(); i++) {
            if (!isLetterOrDigit(value.charAt(i))) {
                return false;
            }
        }
        return true;
    }

}