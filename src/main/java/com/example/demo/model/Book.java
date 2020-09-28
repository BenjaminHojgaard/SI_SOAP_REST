package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Book {
    @Id
    @GeneratedValue
    private String isbn;
    private String title;
    private String author;

    public Book() {
        super();
    }

    public Book(String isbn, String title, String author) {
        super();
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }
    public String getisbn() {
        return isbn;
    }
    public void setisbn(String isbn) {
        this.isbn = isbn;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
}
