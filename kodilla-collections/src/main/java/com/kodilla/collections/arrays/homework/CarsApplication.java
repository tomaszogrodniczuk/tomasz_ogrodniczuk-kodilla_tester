package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.Random;

public class CarsApplication {

    public static void main(String[] args) {

        Random random = new Random();
        Car[] cars = new Car[random.nextInt(15)+1];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = drawCar();
            cars[i].increaseSpeed(random.nextInt(150));
        }
        for (Car car : cars)
            CarUtils.describeCar(car);
    }

    public static Car drawCar() {

        Random random = new Random();
        int brandId = random.nextInt(3);
        if (brandId == 0)
            return new Audi();
        if (brandId == 1)
            return new Ford();
        else
            return new Opel();
    }
}
