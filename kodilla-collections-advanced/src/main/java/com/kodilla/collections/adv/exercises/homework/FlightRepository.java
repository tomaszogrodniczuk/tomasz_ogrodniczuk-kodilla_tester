package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class FlightRepository {
    List<Flight> flights = new ArrayList<>();

    public FlightRepository() {
        this.flights.add(new Flight("Warszawa", "Londyn"));
        this.flights.add(new Flight("Paryż", "Wrocław"));
        this.flights.add(new Flight("Warszawa", "Gdańsk"));
        this.flights.add(new Flight("Modlin", "Gdańsk"));
        this.flights.add(new Flight("Modlin", "Chicago"));
        this.flights.add(new Flight("Wrocław", "Poznań"));
    }

    public List<Flight>  getFlightsTable() {
        return flights;
    }
}
