package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class BmiSources {

    static Stream<Arguments> provideBMIdataForTesting() {
        return Stream.of(
                Arguments.of(1.85, 93, "Overweight"),
                Arguments.of(1.65, 65, "Normal (healthy weight)"),
                Arguments.of(1.85, 50, "Very severely underweight"),
                Arguments.of(1.5, 140, "Obese Class VI (Hyper Obese)")
        );
    }
}
