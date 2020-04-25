package com.kodilla.inheritance.homework;

public class OperatingSystem {

    private int releaseDate;

    public OperatingSystem(int releaseDate)
    {
        this.releaseDate = releaseDate;
    }

    public void turnOn()
    {
        System.out.println("Operating system is turned on");
    }

    public void turnOff()
    {
        System.out.println("Operating system is turned off");
    }

    public int getReleaseDate()
    {
        return releaseDate;
    }


}
