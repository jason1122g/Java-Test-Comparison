package com.example.unit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculateJUnitTestFixture {

    Calculate calculate;

    @Before
    public void initialize() throws Exception {
        calculate = new Calculate();
    }

    @After
    public void cleanObject() throws Exception {
        calculate = null;
    }

    @Test
    public void add() {
        assertEquals( 30, calculate.addition( 10, 20 ) );
    }

    @Test
    public void sub() {
        assertEquals( -10, calculate.subtraction( 10, 20 ) );
    }

}

