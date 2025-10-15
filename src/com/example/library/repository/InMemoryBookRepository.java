package com.example.library.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import com.example.library.interfaces.BookRepository;
import com.example.library.model.Book;

public class InMemoryBookRepository implements BookRepository{
    private HashMap<Long, Book> library = new HashMap<>();
    
    @Override
    public void save(Book book) {
        long id = book.getId();
        library.put(id, book);
    }

    @Override
    public List<Book> findAll() {
        List<Book> books = new ArrayList<>(library.values());
        return books;
    }

    @Override
    public Optional<Book> findById(long id) {
        return Optional.ofNullable(library.get(id));
    }
}
