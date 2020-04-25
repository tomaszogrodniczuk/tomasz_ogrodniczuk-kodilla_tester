package com.kodilla.inheritance.homework;

public class ApplicationOS {

    public static void main (String[] args) {

        OperatingSystem operatingSystem = new OperatingSystem(1999);
        operatingSystem.turnOn();
        operatingSystem.turnOff();
        System.out.println("Operating system release date: " + operatingSystem.getReleaseDate());

        Windows windows = new Windows(2011);
        windows.turnOn();
        windows.turnOff();
        System.out.println("Windows release date: " + windows.getReleaseDate());

        MacOS macOS = new MacOS(2015);
        macOS.turnOn();
        macOS.turnOff();
        System.out.println("MacOS release date: " + macOS.getReleaseDate());
    }

}
