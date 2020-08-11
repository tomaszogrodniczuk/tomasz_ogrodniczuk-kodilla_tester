package com.kodilla.rest.controller.homework;

import com.kodilla.rest.controller.BookController;
import com.kodilla.rest.domain.BookDto;
import com.kodilla.rest.service.BookService;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class BookControllerAddTest {

    @Test
    public void shouldAddBook() {
        //given
        BookService bookService = new BookService();
        BookController bookController = new BookController(bookService);
        bookService.addBook(new BookDto("Title 1", "Author 1"));
        bookService.addBook(new BookDto("Title 2", "Author 2"));
        bookService.addBook(new BookDto("Title 3", "Author 3"));

        //when
        List<BookDto> result = bookController.getBooks();

        //then
        assertEquals(3, result.size());
    }
}
