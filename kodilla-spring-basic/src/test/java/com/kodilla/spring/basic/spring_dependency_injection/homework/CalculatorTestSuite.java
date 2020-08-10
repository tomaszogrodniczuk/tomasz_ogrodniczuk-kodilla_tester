package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void shouldCalculateAdd() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        Double result = bean.add(2.0, 3.0);
        Double resultExpected = 5.0;
        Assertions.assertEquals(resultExpected, result);
    }

    @Test
    public void shouldCalculateSubtract() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        Double result = bean.subtract(10.0, 4.0);
        Double resultExpected = 6.0;
        Assertions.assertEquals(resultExpected, result);
    }

    @Test
    public void shouldCalculateMultiply() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        Double result = bean.multiply(2.0, 3.0);
        Double resultExpected = 6.0;
        Assertions.assertEquals(resultExpected, result);
    }

    @Test
    public void shouldCalculateDivide() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        Double result = bean.divide(7.0, 2.0);
        Double resultExpected = 3.5;
        Assertions.assertEquals(resultExpected, result);
    }
}
