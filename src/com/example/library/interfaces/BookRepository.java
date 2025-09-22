package com.example.library.interfaces;

import java.util.List;
import java.util.Optional;

import com.example.library.model.Book;

public interface BookRepository {
    List<Book> findAll();
    Optional<Book> findById(int id);
    void save(Book book, int id);
}
