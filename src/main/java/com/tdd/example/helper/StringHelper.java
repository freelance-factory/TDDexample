package com.tdd.example.helper;

public class StringHelper {

    public char[] createCharArray(String a) {
        char[] charArray = new char[a.length()];
        for (int i = 0; i < a.length(); i++) {
            charArray[i] = a.charAt(i);
        }
        return charArray;
    }
}
