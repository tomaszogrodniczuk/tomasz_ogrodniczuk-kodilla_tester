package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

public class Audi implements Car {

    private int speed;

    public Audi (){
        this.speed = 0;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed(int incSpeed) {
        speed += incSpeed;
    }

    @Override
    public void decreaseSpeed() {
        speed -= 30;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Audi audi = (Audi) o;
        return speed == audi.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed);
    }
}
