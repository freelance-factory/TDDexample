package com.tdd.example.helper;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NumberHelperTest {

    private NumberHelper numberHelper;

    @Before
    public void init() {
        numberHelper = new NumberHelper();
    }

    @Test
    public void addition_twoPositiveNumbers_shouldReturnAPositiveNumber(){
        //given
        long a = 4;
        long b = 3;

        //when
        long c = numberHelper.addition(a,b);

        //then
        Assert.assertTrue(c>0);
    }

    @Test
    public void addition_toAZero_shouldReturnTheSameNumber(){
        //given
        long a = 3;
        long b = 0;

        //when
        long c = numberHelper.addition(a,b);

        //then
        Assert.assertTrue(c==a);
    }

    @Test
    public void addition_twoNegativeNumbers_shouldReturnANegativeNumber(){
        //given
        long a = -4;
        long b = -5;

        //when
        long c = numberHelper.addition(a,b);

        //then
        Assert.assertTrue(c<0);
    }

    @Test
    public void addition_toANumberWithSameModulusButDifferentSign_shouldReturnZero() {
        //given
        long a = 4;
        long b = -4;

        //when
        long c = numberHelper.addition(a, b);

        //then
        Assert.assertTrue(c==0);
    }

    @Test
    public void subtraction_twoEqualNumbers_shouldReturnZero() {
        //given
        long a = 4;
        long b = 4;

        //when
        long c = numberHelper.subtraction(a,b);

        //then
        Assert.assertTrue(c==0);

    }

    @Test
    public void subtraction_toAZero_shouldReturnTheSameNumber(){
        //given
        long a = 4;
        long b = 0;

        //when
        long c = numberHelper.subtraction(a,b);

        //then
        Assert.assertTrue(c==a);

    }

    @Test
    public void subtraction_toANumberWithSameModulusButDifferentSign_shouldReturnTheDouble() {
        //given
        long a = 4;
        long b = -4;

        //when
        long c = numberHelper.subtraction(a,b);

        //then
        Assert.assertTrue(c==2*a);
    }

    @Test
    public void multiplication_twoNegativeNumbers_shouldReturnAPositiveNumber() {
        //given
        long a = -4;
        long b = -6;

        //when
        long c = numberHelper.multiplication(a,b);

        //then
        Assert.assertTrue(c>0);
    }

    @Test
    public void multiplication_twoPositiveNumbers_shouldReturnAPositiveNumber() {
        //given
        long a = 4;
        long b = 5;

        //when
        long c = numberHelper.multiplication(a,b);

        //then
        Assert.assertTrue(c>0);
    }

    @Test
    public void multiplication_twoNumbersWithDifferentSign_shouldReturnANegativeNumber() {
        //given
        long a = 4;
        long b = -6;

        //when
        long c = numberHelper.multiplication(a,b);

        //then
        Assert.assertTrue(c<0);
    }

    @Test
    public void multiplication_toAZero_shouldReturnAZero() {
        //given
        long a = 4;
        long b = 0;

        //when
        long c = numberHelper.multiplication(a,b);

        //then
        Assert.assertTrue(c==0);
    }

    @Test
    public void division_twoNegativeNumbers_shouldReturnAPositiveNumber() {
        //given
        long a = -4;
        long b = -6;

        //when
        long c = numberHelper.division(a,b);
        System.out.println(c);

        //then
        Assert.assertTrue(c>0);
    }

    @Test
    public void division_twoPositiveNumbers_shouldReturnAPositiveNumber() {
        //given
        long a = 4;
        long b = 5;

        //when
        long c = numberHelper.division(a,b);

        //then
        Assert.assertTrue(c>0);
    }

    @Test
    public void division_twoNumbersWithDifferentSign_shouldReturnANegativeNumber() {
        //given
        long a = 4;
        long b = -6;

        //when
        long c = numberHelper.division(a,b);

        //then
        Assert.assertTrue(c<0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void division_divisionByZero_shouldThrowIllegalArgumentException() {
        //given
        long a = 4;
        long b = 0;

        //when
        numberHelper.division(a,b);

        //then
        // should throw IAE
    }

}
