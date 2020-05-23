package com.kodilla.collections.adv.immutable.special.homework;

import javax.sound.midi.Soundbank;

public class BookApplication {
    public static void main(String[] args) {
        BookManager bookManager = new BookManager();
        //TEST NA SAMYCH OBIEKTACH
        Book book1 = bookManager.createBook("Historia", "Nowakowski");
        Book book2 = bookManager.createBook("Historia", "Nowakowski");
        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());
        System.out.println(book1 == book2);
        System.out.println(book1.equals(book2));
        System.out.println("=============================================");
        //TEST NA LISTACH
        bookManager.createBooksList("Historia", "Kowalski");
        bookManager.createBooksList("Historia", "Kowalski");
    }
}
