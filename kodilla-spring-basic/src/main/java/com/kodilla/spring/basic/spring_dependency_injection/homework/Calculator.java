package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.stereotype.Component;

@Component
public class Calculator {

    private Display display;

    public Calculator (Display display) {
        this.display = display;
    }
    

    public double add(double a, double b) {
        double result = 0;
        result = a + b;
        display.display(result);
        return result;
    }

    public double subtract(double a, double b) {
        double result = 0;
        result = a - b;
        display.display(result);
        return result;
    }

    public double multiply(double a, double b) {
        double result = 0;
        result = a * b;
        display.display(result);
        return result;
    }

    public double divide(double a, double b) {
        double result = 0;
        result = a / b;
        display.display(result);
        return result;
    }
}
