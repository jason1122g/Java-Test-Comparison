package com.example.unit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class CalculateJUnitTestDataDriven {

    Calculate calculate;

    @Before
    public void initialize() throws Exception {
        calculate = new Calculate();
    }

    @After
    public void cleanObject() throws Exception {
        calculate = null;
    }

    @Test// [ 8, 5, 9, 1 ] -> [ 1, 5, 8, 9 ]
    public void testSortDataSet1() {

        int[] input  = new int[]{ 8, 5, 9, 1 };
        int[] output = new int[]{ 1, 5, 8, 9 };

        assertEquals(
                Arrays.toString( output ),
                Arrays.toString( calculate.sort( input ) )
        );
    }

    @Test// [ 2, 0, 1, 5 ] -> [ 0, 1, 2, 5 ]
    public void testSortDataSet2() {

        int[] input  = new int[]{ 2, 0, 1, 5 };
        int[] output = new int[]{ 0, 1, 2, 5 };

        assertEquals(
                Arrays.toString( output ),
                Arrays.toString( calculate.sort( input ) )
        );
    }

}

