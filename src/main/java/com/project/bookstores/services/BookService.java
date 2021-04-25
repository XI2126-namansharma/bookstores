package com.project.bookstores.services;

import com.project.bookstores.entities.Books;

import java.util.List;

// Interface for making our program loosely coupled
public interface BookService {

    List<Books> getBooks();

    Books getBook(int bookNo);

    Books addBook(Books book);

    List<Books> deleteBook(int bookNo);

    Books updateBook(Books book);

}