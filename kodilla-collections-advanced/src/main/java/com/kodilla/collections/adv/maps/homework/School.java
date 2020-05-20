package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String name;
    private List<Integer> schoolRooms = new ArrayList<>();

    public School (String name, int ... schoolRooms) {
        for (int schoolRoom : schoolRooms)
            this.schoolRooms.add(schoolRoom);
        this.name = name;
    }

    public int getSum() {
        int sum = 0;
        for (int schoolRoom : schoolRooms)
            sum += schoolRoom;
        return sum;
    }

    public String getName() {
        return name;
    }
}
