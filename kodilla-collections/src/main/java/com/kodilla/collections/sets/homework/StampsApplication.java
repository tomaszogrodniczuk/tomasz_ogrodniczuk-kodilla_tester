package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Old Town", 3,2,true));
        stamps.add(new Stamp("Eagle", 3,3,false));
        stamps.add(new Stamp("Old Town", 3,2,true));
        stamps.add(new Stamp("Polish Shipyard", 5,3,true));
        stamps.add(new Stamp("Copernicus", 3,2,true));
        stamps.add(new Stamp("Mountains", 2,3,false));

        System.out.println("Size: " + stamps.size());
        for (Stamp stamp : stamps)
            System.out.println(stamp);
    }
}
