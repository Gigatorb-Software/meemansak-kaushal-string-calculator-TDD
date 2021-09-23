package com.gigatorb.calculator;


import org.junit.*;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {


    @Test
    public void testAdd(){
        Calculator calculator = new Calculator();
        int response = calculator.add("");
        assertEquals(0,response);
    }

    @Test
    public void testAddUnknown(){
        Calculator calculator = new Calculator();
        int response = calculator.add("1,2,3,4");
        assertEquals(10,response);
    }

    @Test
    public void testLinesBetweenNumbers(){
        Calculator calculator = new Calculator();
        int response = calculator.add("1,2\n3,4");
        assertEquals(10,response);
    }

    @Test
    public void testDifferentDelimeters(){
        Calculator calculator = new Calculator();
        int response = calculator.add("//;\\n1;2");
        assertEquals(3,response);
    }

    @Test
    public void testNegativeNumber(){
        Calculator calculator = new Calculator();
        int response = calculator.add("1,2,-5,5,-8");
        assertEquals(3,response);
    }
}
