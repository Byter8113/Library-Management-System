package com.example.library.service;

import java.util.List;

import com.example.library.interfaces.BookService;
import com.example.library.model.Book;
import com.example.library.repository.InMemoryBookRepository;

public class BookServiceImpl implements BookService {
    static int id = 0;
    InMemoryBookRepository bookRepository;
    
    BookServiceImpl() {
        bookRepository = new InMemoryBookRepository();
    }

    @Override
    public Book addBook(String title, String author) {
        id++;
        Book book = new Book(id, title, author, false);
        bookRepository.save(book, id);
        return book;
    }

    @Override
    public List<Book> listBooks() {
        return listBooks();
    }

}
