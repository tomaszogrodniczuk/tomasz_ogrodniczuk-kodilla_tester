package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class FlightRepository {
    private List<Flight> flights = new ArrayList<>();

    public FlightRepository() {
        this.flights.add(new Flight("Warszawa", "Londyn"));
        this.flights.add(new Flight("Paryz", "Wrocław"));
        this.flights.add(new Flight("Warszawa", "Gdansk"));
        this.flights.add(new Flight("Modlin", "Gdansk"));
        this.flights.add(new Flight("Modlin", "Chicago"));
        this.flights.add(new Flight("Wroclaw", "Poznan"));
    }

    public List<Flight> getFlightsTable() {
        return flights;
    }
}
