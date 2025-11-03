package com.example.library.interfaces;

import java.util.List;

import com.example.library.model.EBook;

public interface EBookService {
    EBook addEBook(String title, String author, String fileFormat);
    List<EBook> listEBooks();
}
