package com.example.library.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import com.example.library.interfaces.EBookRepository;
import com.example.library.model.EBook;

public class InMemoryEBookRepository implements EBookRepository {
    private HashMap<Long, EBook> library = new HashMap<>();
    
    @Override
    public void save(EBook eBook) {
        long id = eBook.getId();
        library.put(id, eBook);
    }

    @Override
    public List<EBook> findAll() {
        List<EBook> eBooks = new ArrayList<>(library.values());
        return eBooks;
    }

    @Override
    public Optional<EBook> findById(long id) {
        return Optional.ofNullable(library.get(id));
    }
}
