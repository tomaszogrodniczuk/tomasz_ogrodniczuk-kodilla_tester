package com.kodilla.abstracts.homework.animal;

public class Dog extends Animal{

    public Dog() {
        super(4);
    }

    @Override
    public void giveVoice() {
        System.out.println("Hau hau");
    }
}
