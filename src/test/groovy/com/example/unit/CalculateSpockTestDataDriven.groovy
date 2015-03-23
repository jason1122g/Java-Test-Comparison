package com.example.unit

import spock.lang.Specification


class CalculateSpockTestDataDriven extends Specification {

    def Calculate calculate

    def setup() {
        calculate = new Calculate()
    }

    def cleanup() {
        calculate = null
    }

    def "it can sort the input int array into output array"() {
        expect:
            output == calculate.sort( input as int[] )

        where:
            input          | output
            [ 8, 5, 9, 1 ] | [ 1, 5, 8, 9 ]
            [ 2, 0, 1, 5 ] | [ 0, 1, 2, 5 ]
    }

}



