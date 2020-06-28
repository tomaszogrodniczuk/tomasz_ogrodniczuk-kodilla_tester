package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ShopTestSuite {

    Shop shop = new Shop();

    @Test
    public void shouldAddOrder() {
        //When
        int numberOfOrders = shop.getSize();

        //Then
        assertEquals(5, numberOfOrders);
    }

    @Test
    public void shouldGetOrdersByRangeOfDates() {
        //When
        List<Order> result = shop.getOrdersByRangeOfDates(LocalDate.of(2020, 4,1), LocalDate.of(2020,5,1));

        //Then
        assertEquals(2, result.size());
    }

    @Test
    public void shouldGetOrdersByRangeOfAmounts() {
        //When
        List<Order> result = shop.getOrdersByRangeOfAmounts(200, 600);

        //Then
        assertEquals(3, result.size());
    }

    @Test
    public void shouldGetSizeOfOrdersList() {
        //When
        int size = shop.getSize();

        //Then
        assertEquals(5, size);
    }

    @Test
    public void shouldGetTotalAmountOfAllOrders() {
        //When
        int sum = shop.getTotalAmount();

        //Then
        assertEquals(3187, sum);
    }

    @Test
    public void shouldReturnSizeEqualZeroIfTryingToGetOrdersOutOfDatesRange (){
        //When
        List<Order> result = shop.getOrdersByRangeOfDates(LocalDate.of(2020, 6,1), LocalDate.of(2020,7,1));

        //Then
        assertEquals(0, result.size());
    }

    @BeforeEach
    public void initializeShop() {
        shop.addOrder(new Order(1000, LocalDate.of(2020, 4,23), "kwoalski"));
        shop.addOrder(new Order(500, LocalDate.of(2020, 5,5), "nowakowski"));
        shop.addOrder(new Order(344, LocalDate.of(2020, 3,10), "jaskolka"));
        shop.addOrder(new Order(1123, LocalDate.of(2020, 4,30), "muchomor23"));
        shop.addOrder(new Order(220, LocalDate.of(2020, 5,15), "andrzejk"));
    }
}