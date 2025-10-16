package com.example.library.interfaces;

import java.util.List;
import java.util.Optional;

import com.example.library.model.Magazine;

public interface MagazineRepository {
    List<Magazine> findAll();
    Optional<Magazine> findById(long id);
    void save(Magazine magazine);
}
