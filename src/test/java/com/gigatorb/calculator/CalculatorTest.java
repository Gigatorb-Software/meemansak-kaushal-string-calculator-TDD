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


}
