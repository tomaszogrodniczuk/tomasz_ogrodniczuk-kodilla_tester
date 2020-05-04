package com.kodilla.basic_assertion;

public class Application {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        int minusResult = calculator.minus(a,b);
        int expResult = calculator.exp(a);
        boolean correctSum = ResultChecker.assertEquals(13, sumResult);
        boolean correctMinus = ResultChecker.assertEquals(-3,minusResult);
        boolean correctExp = ResultChecker.assertEquals(25, expResult);

        if (correctSum) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }

        if (correctMinus) {
            System.out.println("Metoda minus działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda minus nie działa poprawnie dla liczb " + a + " i " + b);
        }

        if (correctExp) {
            System.out.println("Metoda exp działa poprawnie dla liczby " + a);
        } else {
            System.out.println("Metoda exp nie działa poprawnie dla liczby " + a);
        }
    }
}