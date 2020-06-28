package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Shop {

    private List<Order> orders = new ArrayList<>();

    public void addOrder (Order order) {
        orders.add(order);
    }

    public List<Order> getOrdersByRangeOfDates(LocalDate dateFrom, LocalDate dateTo) {
        List<Order> tempOrders = new ArrayList<>();

        for(Order order : this.orders) {
            if (order.getDateOfOrder().isAfter(dateFrom) && order.getDateOfOrder().isBefore(dateTo))
                tempOrders.add(order);
        }
        return tempOrders;
    }

    public List<Order> getOrdersByRangeOfAmounts(int minAmount, int maxAmount) {
        List<Order> tempOrders = new ArrayList<>();

        for(Order order : this.orders) {
            if (order.getAmountOfOrder() >= minAmount && order.getAmountOfOrder() <= maxAmount)
                tempOrders.add(order);
        }
        return tempOrders;
    }

    public int getSize() {
        return this.orders.size();
    }

    public int getTotalAmount () {
        int sum = 0;
        for (Order order : this.orders) {
            sum += order.getAmountOfOrder();
        }
        return sum;
    }
}
