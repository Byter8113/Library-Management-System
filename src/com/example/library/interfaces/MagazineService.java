package com.example.library.interfaces;

import java.util.List;

import com.example.library.model.Magazine;

public interface MagazineService {
    Magazine addMagazine(String title, String publisher, int issueNumber);
    List<Magazine> listMagazines();
}
