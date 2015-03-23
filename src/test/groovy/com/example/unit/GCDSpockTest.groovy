package com.example.unit

import spock.lang.Specification


class GCDSpockTest extends Specification {

    def GCD gcd

    def "it can calculate gcd of two numbers"() {

        given:
            gcd = new GCD()

        expect:
            gcd.getGCD( 10, 5 ) == 5
    }

}


