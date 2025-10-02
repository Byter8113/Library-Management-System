package com.example.library.controller;

import com.example.library.service.BookServiceImpl;

public class BookController {
    private BookServiceImpl service = new BookServiceImpl();
    public void addBook(String title, String author) {
        service.addBook(title, author);
    }   
    public void listBooks() {
        System.out.println(service.listBooks());
    } 
}
