package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PrimeCheckerTestSuite {

    private PrimeChecker checker = new PrimeChecker();
    private static int countTotal = 0;

    @Test
    public void shouldReturnFalseWhenPassingNotPrimeNumber() {
        //PrimeChecker checker = new PrimeChecker();
        boolean result = checker.isPrime(14);
        checker.incrementCount();
        countTotal++;
        System.out.println("Count: " + checker.getCount());
        System.out.println("Count Total: " + countTotal);
        assertFalse(result);
    }

    @Test
    public void shouldReturnTrueWhenPassingPrimeNumber() {
        //PrimeChecker checker = new PrimeChecker();
        boolean result = checker.isPrime(13);
        checker.incrementCount();
        countTotal++;
        System.out.println("Count: " + checker.getCount());
        System.out.println("Count Total: " + countTotal);
        assertTrue(result);
    }

    @Test
    public void shouldReturnTrueWhenPassingTwo() {
        //PrimeChecker checker = new PrimeChecker();
        boolean result = checker.isPrime(2);
        checker.incrementCount();
        countTotal++;
        System.out.println("Count: " + checker.getCount());
        System.out.println("Count Total: " + countTotal);
        assertTrue(result);
    }

    @Test
    public void shouldReturnFalseWhenPassingOne() {
        //PrimeChecker checker = new PrimeChecker();
        boolean result = checker.isPrime(1);
        checker.incrementCount();
        countTotal++;
        System.out.println("Count: " + checker.getCount());
        System.out.println("Count Total: " + countTotal);
        assertFalse(result);
    }

    @Test
    public void shouldReturnFalseWhenPassingZero() {
        //PrimeChecker checker = new PrimeChecker();
        boolean result = checker.isPrime(0);
        checker.incrementCount();
        countTotal++;
        System.out.println("Count: " + checker.getCount());
        System.out.println("Count Total: " + countTotal);
        assertFalse(result);
    }

    @Test
    public void shouldReturnFalseWhenPassingNegativeNumber() {
        PrimeChecker checker = new PrimeChecker();
        boolean result = checker.isPrime(-6);
        checker.incrementCount();
        countTotal++;
        System.out.println("Count: " + checker.getCount());
        System.out.println("Count Total: " + countTotal);
        assertFalse(result);
    }
}
