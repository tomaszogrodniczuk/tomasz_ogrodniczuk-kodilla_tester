package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

public class Ford implements Car {

    private int speed;

    public Ford (){
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
        Ford ford = (Ford) o;
        return speed == ford.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed);
    }
}
