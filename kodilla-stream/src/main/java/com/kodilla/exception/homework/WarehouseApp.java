package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("11111"));
        warehouse.addOrder(new Order("22222"));
        warehouse.addOrder(new Order("33333"));
        warehouse.addOrder(new Order("44444"));
        warehouse.addOrder(new Order("55555"));

        try {
            System.out.println(warehouse.getOrder("111711").getNumber());
        } catch (OrderDoesntExistException e) {
            System.out.println("I can't find this order!");
        }

    }

}
