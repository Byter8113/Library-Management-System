package com.example.library.controller;

import java.util.List;

import com.example.library.service.MagazineServiceImpl;

public class MagazineController {
    private MagazineServiceImpl service = new MagazineServiceImpl();
    public void addMagazine(String title, boolean available, String publisher, int issueNumber) {
        service.addMagazine(title, available, publisher, issueNumber);
    }   
    public List listMagazines() {
        return service.listMagazines();    
    } 
}
