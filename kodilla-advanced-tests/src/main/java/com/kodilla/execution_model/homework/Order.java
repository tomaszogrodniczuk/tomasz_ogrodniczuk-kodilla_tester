package com.kodilla.execution_model.homework;

import java.time.LocalDate;

public class Order {
    private int amountOfOrder;
    private LocalDate dateOfOrder;
    private String login;

    public Order(int amountOfOrder, LocalDate dateOfOrder, String login) {
        this.amountOfOrder = amountOfOrder;
        this.dateOfOrder = dateOfOrder;
        this.login = login;
    }

    public int getAmountOfOrder() {
        return amountOfOrder;
    }

    public LocalDate getDateOfOrder() {
        return dateOfOrder;
    }

    public String getLogin() {
        return login;
    }
}