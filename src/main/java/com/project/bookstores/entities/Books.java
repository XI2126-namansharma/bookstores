package com.project.bookstores.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

// Data Class for Book Entity
@Entity
public class Books {

    @Id
    public int bookNo;
    public String title;

    public Books() {
    }

    public int getBookNo() {
        return bookNo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Books(int bookNo, String title) {
        this.bookNo = bookNo;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Books{" +
                "bookNo=" + bookNo +
                ", title='" + title + '\'' +
                '}';
    }
}
