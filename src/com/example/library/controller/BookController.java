package com.example.library.controller;

import java.util.List;

import com.example.library.service.BookServiceImpl;

public class BookController {
    private BookServiceImpl service = new BookServiceImpl();
    public void addBook(String title, String author) {
        service.addBook(title, author);
    }   
    public List listBooks() {
        return service.listBooks();    
    } 
}
