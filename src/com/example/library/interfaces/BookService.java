package com.example.library.interfaces;

import java.util.List;

import com.example.library.model.Book;

public interface BookService {
    Book addBook(String title, String author);
    List<Book> listBooks();
}
