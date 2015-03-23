package com.example.unit

import spock.lang.Specification


class CalculateSpockTestFixture extends Specification {

    def Calculate calculate

    def setup() {
        calculate = new Calculate()
    }

    def cleanup() {
        calculate = null
    }

    def "it can add two integers"() {
        expect:
            calculate.addition( 10, 20 ) == 30
    }

    def "it can subtract two integers"() {
        expect:
            calculate.subtraction( 10, 20 ) == -10
    }

}


