package com.kodilla.soap.repository;

import com.kodilla.books.soap.Book;
import com.kodilla.books.soap.Genre;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.PostConstruct;

@Component
public class BooksRepository {
    private static final Map<String, Book> books = new HashMap<>();

    @PostConstruct
    public void initData() {
        Book bookPanKleks = new Book();
        bookPanKleks.setSignature("12345");
        bookPanKleks.setTitle("Akademia Pana Kleksa");
        bookPanKleks.setAuthor("Jan Brzechwa");
        bookPanKleks.setReleaseYear(1946);
        bookPanKleks.setGenre(Genre.FANTASY);

        books.put(bookPanKleks.getSignature(), bookPanKleks);

    }

    public Book findBook(String signature) {
        Assert.notNull(signature, "You have to specify the book's signature");
        return books.get(signature);
    }
}