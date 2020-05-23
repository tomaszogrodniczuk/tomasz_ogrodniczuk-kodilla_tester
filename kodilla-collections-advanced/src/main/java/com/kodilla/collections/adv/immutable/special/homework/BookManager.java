package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;

public class BookManager {
    private List<Book> books = new ArrayList<>();

    public Book createBook (String title, String author) {
        return new Book (title,author);
    }
    public void createBooksList(String title, String author){
        Book tempBook = new Book (title, author);
        for (Book book : books) {
            if (tempBook.equals(book))
                System.out.println("The object with these values already exists");
            else
                System.out.println("The object with these values does not exist");
            if (tempBook == book)
                System.out.println("Such an object already exists");
            else
                System.out.println("Such an object does not exist");
        }
            books.add(tempBook);
    }
}
