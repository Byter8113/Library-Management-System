package com.example.library.interfaces;

import java.util.HashMap;
import java.util.Optional;

import com.example.library.model.Book;

public interface BookRepository {
    HashMap<Integer, Book> findAll();
    Optional<Book> findById(int id);
    void save(Book book);
}
