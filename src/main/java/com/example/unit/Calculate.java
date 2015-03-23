package com.example.unit;

import java.util.Arrays;

public class Calculate {

    public int addition( int a, int b ) {
        return a + b;
    }

    public int subtraction( int a, int b ) {
        return a - b;
    }

    public int division( int a, int b ) {
        return a / b;
    }

    public int[] sort( int[] input ) {
        int[] targetArr = Arrays.copyOf( input, input.length );
        Arrays.sort( targetArr );
        return targetArr;
    }

}
