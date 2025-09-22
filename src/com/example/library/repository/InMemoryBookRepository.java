package com.example.library.repository;

import java.util.HashMap;
import java.util.Optional;
import java.util.Random;

import com.example.library.interfaces.BookRepository;
import com.example.library.model.Book;

public class InMemoryBookRepository implements BookRepository{
    private HashMap<Integer, Book> library = new HashMap<>();
    
    @Override
    public void save(Book book) {
        int id = new Random().nextInt();
        if(library.get(id) != null) {
            save(book);
        } else if(library.get(book) != null) {
            book.setId(id);
            System.out.println("This book has already been added.");
            return;
        }
        library.put(id, book);
    }

    @Override
    public HashMap<Integer, Book> findAll() {
        return library;
    }

    @Override
    public Optional<Book> findById(int id) {
        return Optional.ofNullable(library.get(id));
    }
}
