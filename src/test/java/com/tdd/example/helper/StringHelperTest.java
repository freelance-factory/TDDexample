package com.tdd.example.helper;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.tdd.example.exception.NumberException;

public class StringHelperTest {

    private StringHelper stringHelper;

    @Before
    public void init() {
        stringHelper = new StringHelper();
    }

    @Test
    public void emptyString_shouldReturnAnEmptyArray() throws NumberException {

        //given
        String a = "";

        //when
        char[] charArray = stringHelper.createCharArray(a);

        //then
        Assert.assertTrue(charArray.length==0);

    }

    @Test
    public void xQuantityOfCharactersInTheString_shouldReturnAnArrayOfXCharacters() throws NumberException {

        //given
        String a = "Juan";

        //when
        char[] charArray = stringHelper.createCharArray(a);

        //then
        Assert.assertTrue(a.length() == charArray.length);
        for (int i = 0; i < a.length(); i++) {
            Assert.assertEquals(a.charAt(i), charArray[i]);
        }
    }

    @Test
    public void stringWithASymbol_shouldReturnTheSymbolInTheArray() throws NumberException {

        //given
        String a = "!-*";

        //when
        char[] charArray = stringHelper.createCharArray(a);

        //then
        Assert.assertEquals(a.charAt(0),charArray[0]);
        Assert.assertEquals(a.charAt(1),charArray[1]);
        Assert.assertEquals(a.charAt(2),charArray[2]);

    }

    @Test(expected = NumberException.class)
    public void nullArray_shouldThrowException() throws NumberException {

        //given
        String a = null;

        //when
        stringHelper.createCharArray(a);

        //then

    }

}
