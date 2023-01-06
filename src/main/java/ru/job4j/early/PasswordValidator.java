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
        boolean containsNumber = false;
        boolean allNumberOrSymbol = true;
        for (int i = 0; i < password.length(); i++) {
            if (isDigit(password.charAt(i))) {
                containsNumber = true;
            }
            if (!isLetterOrDigit(password.charAt(i))) {
                allNumberOrSymbol = false;
            }
        }
        if (!containsNumber) {
            throw new IllegalArgumentException("Password should contain at least one figure");
        }
        if (allNumberOrSymbol) {
            throw new IllegalArgumentException("Password should contain at least one special symbol");
        }
        String[] badSubstrings = {"qwerty", "12345", "password", "admin", "user"};
        for (String str : badSubstrings) {
            if (password.toLowerCase().contains(str)) {
                throw new IllegalArgumentException("Password shouldn't contain substrings: qwerty, 12345, password, admin, user");
            }
        }
        return password;
    }
}