package com.kodilla.basic_assertion;

public class Calculator {

    public int sum(int a, int b){
        return a + b;
    }

    public int minus(int a, int b){
        return a - b;
    }

    public double exp(int a, int b){
        double x = a;
        double y = b;
        return Math.pow(x,y);
    }
}
