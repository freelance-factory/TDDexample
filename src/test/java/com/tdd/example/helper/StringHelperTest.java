package com.tdd.example.helper;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StringHelperTest {

    private StringHelper stringHelper;

    @Before
    public void init() {
        stringHelper = new StringHelper();
    }

    @Test
    public void emptyString_shouldReturnAnEmptyArray(){

        //given
        String a = "";

        //when
        char[] charArray = stringHelper.createCharArray(a);

        //then
        Assert.assertTrue(charArray.length==0);

    }

    @Test
    public void xQuantityOfCharactersInTheString_shouldReturnAnArrayOfXCharacters(){

        //given
        String a = "Juan";

        //when
        char[] charArray = stringHelper.createCharArray(a);

        //then
        Assert.assertTrue(a.length() == charArray.length);

    }

    @Test
    public void stringWithASymbol_shouldReturnTheSymbolInTheArray(){

        //given
        String a = "!-*";

        //when
        char[] charArray = stringHelper.createCharArray(a);
        System.out.println(charArray.toString());

        //then
        Assert.assertEquals("!",charArray[0]);
        Assert.assertEquals("-",charArray[1]);
        Assert.assertEquals("*",charArray[2]);

    }

    @Test
    public void nullArray_shouldThrowIllegalArgumentException() {
    }

}
