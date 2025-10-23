package com.example.library.controller;

import java.util.List;

import com.example.library.service.MagazineServiceImpl;

public class MagazineController {
    private MagazineServiceImpl service = new MagazineServiceImpl();
    public void addMagazine(String title, String publisher, int issueNumber) {
        service.addMagazine(title, publisher, issueNumber);
    }   
    public List listMagazines() {
        return service.listMagazines();    
    } 
}
