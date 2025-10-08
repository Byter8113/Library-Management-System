package com.example.library.interfaces;

import java.util.List;

import com.example.library.model.Book;

public interface BookService<T> {
    T addMaterial(String title, String author);
    List<T> listMaterial();
}
