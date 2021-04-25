package com.project.bookstores.services;

// Implementation Class
// where you will find all the implementation for the method created in Interface

import com.project.bookstores.dao.BookDao;
import com.project.bookstores.entities.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService{

    @Autowired
    BookDao bookDao;

    public BookServiceImpl() {
    }

    @Override
    public List<Books> getBooks() {
        return bookDao.findAll();
    }

    @Override
    public Books getBook(int bookNo) {
        return bookDao.getOne(bookNo);
    }

    @Override
    public Books addBook(Books book) {
        bookDao.save(book);
        return book;
    }

    @Override
    public List<Books> deleteBook(int bookNo) {
        Books entity = bookDao.getOne(bookNo);
        bookDao.delete(entity);
        return bookDao.findAll();
    }

    @Override
    public Books updateBook(Books updatedBook) {
        bookDao.save(updatedBook);
        return updatedBook;
    }
}
