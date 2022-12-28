package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                return i;
            }
        }
        throw new ElementNotFoundException("В списке нет ключа шаблона сообщения!");
    }

    public static boolean sent(String value, String[] abuses) throws ElementAbuseException {
        for (String abuse : abuses) {
            if (abuse.equals(value)) {
                throw new ElementAbuseException("Ключ находится в списке запрещенных!");
            }
        }
        return true;
    }

    public static void process(String[] values, String key, String[] abuses) {
        try {
            indexOf(values, key);
            sent(key, abuses);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String[] value = {"qq", "ww", "ee"};
        String[] abuses = {"aa", "bb", "cc"};
        process(value, "aa", abuses);
    }
}