package com.example.library.controller;

import java.util.List;

import com.example.library.service.EBookServiceImpl;

public class EBookController {
    private EBookServiceImpl service = new EBookServiceImpl();
    public void addEBook(String title, String author, String fileFormat) {
        service.addEBook(title, author, fileFormat);
    }   
    public List listEBooks() {
        return service.listEBooks();    
    } 
}
