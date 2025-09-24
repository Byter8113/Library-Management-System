package com.example.library.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.Random;

import com.example.library.interfaces.BookRepository;
import com.example.library.model.Book;

public class InMemoryBookRepository implements BookRepository{
    private HashMap<Long, Book> library = new HashMap<>();
    
    private Long generateId(Book book) {
        long id = new Random().nextLong();
        if(library.get(id) != null) {
            save(book);
        } else if(library.get(book) != null) {
            book.setId(id);
            System.out.println("This book has already been added.");
            return id;
        }
        return null;
    }

    @Override
    public void save(Book book) {
        long id = generateId(book);
        library.put(id, book);
    }

    @Override
    public List<Book> findAll() {
        List<Book> books = new ArrayList<>(library.values());
        return books;
    }

    @Override
    public Optional<Book> findById(int id) {
        return Optional.ofNullable(library.get(id));
    }
}
