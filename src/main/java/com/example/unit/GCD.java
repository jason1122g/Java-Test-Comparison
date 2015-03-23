package com.example.unit;

public class GCD {

    public int getGCD( int a, int b ) {
        int max = Math.max( a, b );
        int min = Math.min( a, b );
        if( max % min != 0 ) {
            return getGCD( min, ( max % min ) );
        }
        return min;
    }

}