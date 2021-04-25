package com.project.bookstores.controller;

import com.project.bookstores.entities.Books;
import com.project.bookstores.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Home Controller Rest Class
@RestController
@CrossOrigin
public class HomeController {

    // Creating Object for interface
    @Autowired
    BookService bookService;

    // Getting All the Books
    @GetMapping("/books")
    public List<Books> getBooks() {
        return bookService.getBooks();
    }

    // Getting single Book using Book Number
    @GetMapping("/books/{bookNo}")
    public Books getBook(@PathVariable int bookNo) {
        return bookService.getBook(bookNo);
    }

    // Adding one book
    @PostMapping("/books")
    public Books addBook(@RequestBody Books book) {
        return this.bookService.addBook(book);
    }

    // Deleting one book using Book Number
    @DeleteMapping("/books/{bookNo}")
    public List<Books> deleteBook(@PathVariable int bookNo) {
        return this.bookService.deleteBook(bookNo);
    }

    // Updating one Book
    @PutMapping("/books")
    public Books updateBook(@RequestBody Books book) {
        return this.bookService.updateBook(book);
    }
}
