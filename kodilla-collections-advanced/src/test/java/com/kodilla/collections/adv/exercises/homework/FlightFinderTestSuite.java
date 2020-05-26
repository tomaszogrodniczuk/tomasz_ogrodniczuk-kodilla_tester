package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {

    @Test
    public void testFindFlightsFrom() {
        // given
        FlightFinder flightFinder = new FlightFinder();
        List<Flight> result;
        // when
        result = flightFinder.findFlightsFrom("Warszawa");
        // then
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Warszawa", "Londyn"));
        expectedList.add(new Flight("Warszawa", "Gdansk"));
        assertEquals(expectedList, result);
    }

    @Test
    public void testFindFlightsTo() {
        // given
        FlightFinder flightFinder = new FlightFinder();
        List<Flight> result;
        // when
        result = flightFinder.findFlightsTo("Gdansk");
        // then
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Warszawa", "Gdansk"));
        expectedList.add(new Flight("Modlin", "Gdansk"));
        assertEquals(expectedList, result);
    }
}