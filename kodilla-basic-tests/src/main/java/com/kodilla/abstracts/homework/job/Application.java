package com.kodilla.abstracts.homework.job;

public class Application {

    public static void main (String[] args){

        Baker baker = new Baker(2500, "Baking bread");
        Fireman fireman = new Fireman(4500, "Putting out the fire");
        Doctor doctor = new Doctor(13000, "Treating people");

        Person[] person = new Person[3];

        person[0] = new Person("Adam", 28, baker);
        person[1] = new Person("Janek", 35, fireman);
        person[2]= new Person("Ewa", 32, doctor);

        for (int i = 0; i < person.length; i++){
            person[i].showPersonDetails();
        }
    }
}
