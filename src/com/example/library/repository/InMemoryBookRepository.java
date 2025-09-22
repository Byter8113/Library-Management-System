package com.example.library.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import com.example.library.interfaces.BookRepository;
import com.example.library.model.Book;

public class InMemoryBookRepository implements BookRepository{
    HashMap<Integer, Book> library = new HashMap<>();
    static List<Book> listBooks = new ArrayList<>();

    @Override
    public void save(Book book, int id) {
        library.put(id, book);
        listBooks.add(book);
    }

    @Override
    public List<Book> findAll() {
        return listBooks;
    }

    @Override
    public Optional<Book> findById(int id) {
        return Optional.ofNullable(library.get(id));
    }
}
