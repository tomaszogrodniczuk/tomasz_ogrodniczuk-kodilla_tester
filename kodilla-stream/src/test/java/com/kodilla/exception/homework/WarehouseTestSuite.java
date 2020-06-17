package com.kodilla.exception.homework;

import org.junit.Test;

import static org.junit.Assert.*;

public class WarehouseTestSuite {

    @Test (expected = OrderDoesntExistException.class)
    public void testGetOrder_withException() throws OrderDoesntExistException{
        // given
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("11111"));
        warehouse.addOrder(new Order("22222"));
        warehouse.addOrder(new Order("33333"));
        warehouse.addOrder(new Order("44444"));
        warehouse.addOrder(new Order("55555"));
        // when
        Order order = warehouse.getOrder("11121");
        //then
        assertEquals(new Order("11111"), order);
    }

}