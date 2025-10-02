package com.example.library.service;

import java.util.List;

import com.example.library.interfaces.BookService;
import com.example.library.model.Book;
import com.example.library.repository.InMemoryBookRepository;

public class BookServiceImpl implements BookService {
    private static long size = 0; 
    static InMemoryBookRepository bookRepository = new InMemoryBookRepository();

    private long generateId() {
        return ++size;
    }
    
    @Override
    public Book addBook(String title, String author) {
        long id = generateId();
        Book book = new Book(id, title, author, false);
        bookRepository.save(book);
        return book;
    }

    @Override
    public List<Book> listBooks() {
        return bookRepository.findAll();
    }
}
