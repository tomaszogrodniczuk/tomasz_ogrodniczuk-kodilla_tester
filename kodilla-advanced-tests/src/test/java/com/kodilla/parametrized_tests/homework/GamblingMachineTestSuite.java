package com.kodilla.parametrized_tests.homework;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import java.util.HashSet;
import java.util.Set;

class GamblingMachineTestSuite {

    @ParameterizedTest
    @CsvFileSource(resources = "/numbers.csv", numLinesToSkip = 0)
    public void isNumberOfWinsAreInRange(String inputLine) throws InvalidNumbersException{
        GamblingMachine gamblingMachine = new GamblingMachine();
        String tempTab[] = inputLine.split(" ");
        Set<Integer> inputNumbers = new HashSet<>();
        for (String tabElement : tempTab)
            inputNumbers.add(Integer.parseInt(tabElement));
        assertTrue(gamblingMachine.howManyWins(inputNumbers) <=6 || gamblingMachine.howManyWins(inputNumbers) >=0);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/invalidNumbers.csv", numLinesToSkip = 0)
    public void shouldThrowExceptionIfInputNumbersAreIncorrect (String inputLine) throws InvalidNumbersException{
        GamblingMachine gamblingMachine = new GamblingMachine();
        String tempTab[] = inputLine.split(" ");
        Set<Integer> inputNumbers = new HashSet<>();
        for (String tabElement : tempTab)
            inputNumbers.add(Integer.parseInt(tabElement));
        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(inputNumbers));
    }
}