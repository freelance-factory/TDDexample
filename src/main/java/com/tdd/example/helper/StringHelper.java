package com.tdd.example.helper;

import com.tdd.example.exception.NumberException;

public class StringHelper {

    public char[] createCharArray(String a) throws NumberException {

        if (a == null) {
            throw new NumberException("This is wrong");
        }

        char[] charArray = new char[a.length()];
        for (int i = 0; i < a.length(); i++) {
            charArray[i] = a.charAt(i);
        }
        return charArray;
    }

}
