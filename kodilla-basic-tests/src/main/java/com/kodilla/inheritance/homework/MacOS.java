package com.kodilla.inheritance.homework;

public class MacOS extends OperatingSystem{

    public MacOS(int releaseDate)
    {
        super(releaseDate);
    }

    @Override
    public void turnOn()
    {
        System.out.println("MacOS is turned on");
    }

    @Override
    public void turnOff()
    {
        System.out.println("MacOS is turned off");
    }

}
