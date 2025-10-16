package com.example.library.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import com.example.library.interfaces.MagazineRepository;
import com.example.library.model.Magazine;

public class InMemoryMagazineRepository implements MagazineRepository{
    private HashMap<Long, Magazine> library = new HashMap<>();
    
    @Override
    public void save(Magazine magazine) {
        long id = magazine.getId();
        library.put(id, magazine);
    }

    @Override
    public List<Magazine> findAll() {
        List<Magazine> books = new ArrayList<>(library.values());
        return books;
    }

    @Override
    public Optional<Magazine> findById(long id) {
        return Optional.ofNullable(library.get(id));
    }
}
