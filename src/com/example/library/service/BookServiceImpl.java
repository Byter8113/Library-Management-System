package com.example.library.service;

import java.util.List;

import com.example.library.interfaces.BookService;
import com.example.library.model.Book;
import com.example.library.repository.InMemoryBookRepository;

public class BookServiceImpl implements BookService {
    InMemoryBookRepository bookRepository;
    
    BookServiceImpl() {
        bookRepository = new InMemoryBookRepository();
    }

    @Override
    public Book addBook(String title, String author) {
        Book book = new Book(0, title, author, false);
        bookRepository.save(book);
        return book;
    }

    @Override
    public List<Book> listBooks() {
        return listBooks();
    }
}
