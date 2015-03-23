package com.example.unit;

import org.junit.Test;

import static org.junit.Assert.*;

public class GCDJUnitTest {

    GCD gcd;

    @Test
    public void checkGCD() {
        gcd = new GCD();
        assertEquals( 5, gcd.getGCD( 10, 5 ) );
    }

}


