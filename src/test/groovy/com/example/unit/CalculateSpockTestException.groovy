package com.example.unit

import spock.lang.Specification


class CalculateSpockTestException extends Specification {

    def Calculate calculate

    def setup() {
        calculate = new Calculate()
    }

    def cleanup() {
        calculate = null
    }

    def "it should throw exception when divided by zero"() {
        when:
            calculate.division( 1, 0 )
        then:
            thrown( ArithmeticException )
    }

}


