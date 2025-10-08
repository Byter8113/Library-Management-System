package com.example.library.interfaces;

import java.util.List;
import java.util.Optional;

import com.example.library.model.Book;

public interface BookRepository<T> {
    List<T> findAll();
    Optional<T> findById(int id);
    void save(T material);
}
