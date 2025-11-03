package com.example.library.service;

import java.util.List;

import com.example.library.interfaces.MagazineService;
import com.example.library.model.Magazine;
import com.example.library.repository.InMemoryMagazineRepository;

public class MagazineServiceImpl implements MagazineService{
    private static long size = 0; 
    private static InMemoryMagazineRepository magazineRepository = new InMemoryMagazineRepository();

    private long generateId() {
        return ++size;
    }
    
    @Override
    public Magazine addMagazine(String title, boolean available, String publisher, int issueNumber) {
        long id = generateId();
        Magazine magazine = new Magazine(id, title, available, publisher, issueNumber);
        magazineRepository.save(magazine);
        return magazine;
    }

    @Override
    public List<Magazine> listMagazines() {
        return magazineRepository.findAll();
    }
}
