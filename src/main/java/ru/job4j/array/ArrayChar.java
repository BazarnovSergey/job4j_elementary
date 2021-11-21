package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        if (word.length >= pref.length) {
            for (int i = 0; i < pref.length; i++) {
                if (word[i] != pref[i]) {
                    return false;
                }
            }
        } else {
            for (int i = 0; i < word.length; i++) {
                if (word[i] != pref[i]) {
                    return false;
                }
            }
        }
        return true;
    }
}
