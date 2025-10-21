package com.example.library.service;

import java.util.List;

import com.example.library.interfaces.EBookService;
import com.example.library.model.EBook;
import com.example.library.repository.InMemoryEBookRepository;

public class EBookServiceImpl implements EBookService{
    private static long size = 0; 
    private static InMemoryEBookRepository eBookRepository = new InMemoryEBookRepository();

    private long generateId() {
        return ++size;
    }
    
    @Override
    public EBook addEBook(String title, String author, String fileFormat) {
        long id = generateId();
        EBook eBook = new EBook(id, title, false, author, fileFormat);
        eBookRepository.save(eBook);
        return eBook;
    }

    @Override
    public List<EBook> listEBooks() {
        return eBookRepository.findAll();
    }
}
