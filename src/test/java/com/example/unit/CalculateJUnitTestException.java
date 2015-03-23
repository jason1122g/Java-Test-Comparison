package com.example.unit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculateJUnitTestException {

    Calculate calculate;

    @Before
    public void initialize() throws Exception {
        calculate = new Calculate();
    }

    @After
    public void cleanObject() throws Exception {
        calculate = null;
    }

    @Test( expected = ArithmeticException.class )
    public void testDivByZero() {
        calculate.division( 1, 0 );
    }

}


