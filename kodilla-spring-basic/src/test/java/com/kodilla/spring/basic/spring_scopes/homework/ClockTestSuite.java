package com.kodilla.spring.basic.spring_scopes.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class ClockTestSuite {
    @Test

    public void shouldCreateDifferentClocks() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Clock firstBean = context.getBean(Clock.class);
        Clock secondBean = context.getBean(Clock.class);
        Clock thirdBean = context.getBean(Clock.class);

        System.out.println(firstBean.getCurrentTime());
        System.out.println(secondBean.getCurrentTime());
        System.out.println(thirdBean.getCurrentTime());

        Assertions.assertNotEquals(firstBean.getCurrentTime(), secondBean.getCurrentTime());
        Assertions.assertNotEquals(secondBean.getCurrentTime(), thirdBean.getCurrentTime());
        Assertions.assertNotEquals(firstBean.getCurrentTime(), thirdBean.getCurrentTime());
    }
}
