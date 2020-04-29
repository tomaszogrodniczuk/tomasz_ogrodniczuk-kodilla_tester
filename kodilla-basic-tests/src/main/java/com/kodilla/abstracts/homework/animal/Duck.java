package com.kodilla.abstracts.homework.animal;

public class Duck extends Animal {

    public Duck() {
        super(2);
    }

    @Override
    public void giveVoice() {
        System.out.println("Quack");
    }
}
