package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> school = new HashMap<>();

        Principal janKowalski = new Principal("Jan", "Kowalski");
        Principal adamNowak = new Principal("Adam", "Nowak");
        Principal annaGut = new Principal("Anna", "Gut");

        School school1 = new School("Zolkiewski" ,25,23,25,18);
        School school2 = new School("Krolowej Jadwigi", 15,25,25,18,20);
        School school3 = new School("Boleslawa Prusa",24,24, 20,19);

        school.put(janKowalski, school1);
        school.put(adamNowak, school2);
        school.put(annaGut, school3);

        for (Map.Entry<Principal, School> principalEntry : school.entrySet())
            System.out.println(principalEntry.getKey().getFirstName() + " " + principalEntry.getKey().getLastName() +
                    " has " + principalEntry.getValue().getSum() + " students in the " + principalEntry.getValue().getName() + " school.");

    }
}
