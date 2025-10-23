package com.example.library.interfaces;

import java.util.List;
import java.util.Optional;

import com.example.library.model.EBook;

public interface EBookRepository {
    List<EBook> findAll();
    Optional<EBook> findById(long id);
    void save(EBook eBook);
}
