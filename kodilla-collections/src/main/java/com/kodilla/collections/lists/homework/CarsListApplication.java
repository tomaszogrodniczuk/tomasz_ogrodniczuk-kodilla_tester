package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Audi());
        cars.add(new Ford());
        cars.add(new Opel());

        System.out.println("=====   BEFORE REMOVING =====");
                for (Car car : cars)
            CarUtils.describeCar(car);

        cars.remove(0);
        cars.remove(new Opel());

        System.out.println("=====   AFTER REMOVING =====");
        for (Car car : cars)
            CarUtils.describeCar(car);

        System.out.println("Size: " + cars.size());
    }
}
