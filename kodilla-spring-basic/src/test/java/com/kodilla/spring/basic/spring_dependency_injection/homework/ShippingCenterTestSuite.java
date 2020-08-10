package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class ShippingCenterTestSuite {

    @Test
    public void shouldNotificationServiceSuccess() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        NotificationService bean = context.getBean(NotificationService.class);
        String message = bean.success("Warsaw");
        Assertions.assertNotNull(message);
    }

    @Test
    public void shouldNotificationServiceFail() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        NotificationService bean = context.getBean(NotificationService.class);
        String message = bean.fail("Warsaw");
        Assertions.assertNotNull(message);
    }

    @Test
    public void shouldDeliveryServiceReturnFalseIfWeightAbove30() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        DeliveryService bean = context.getBean(DeliveryService.class);
        Boolean result = bean.deliverPackage("Warsaw", 31);
        Assertions.assertEquals(false, result);
    }

    @Test
    public void shouldDeliveryServiceReturnTrueIfWeightLessOrEqual30() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        DeliveryService bean = context.getBean(DeliveryService.class);
        Boolean result = bean.deliverPackage("Warsaw", 30);
        Assertions.assertEquals(true, result);
    }

    @Test
    public void shouldSendPackageSuccess () {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String message = bean.sendPackage("Warsaw", 24);
        Assertions.assertNotNull(message);
    }
}
