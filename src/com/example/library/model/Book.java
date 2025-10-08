package com.example.library.model;

public class Book extends LibraryItem {
    private String author;
    
    public Book(long id, String title, String author, boolean available) {
        super(id, title, available);
        this.author = author;
    }

    @Override
    public String toString() {
        return getDescription();
    }

    public String getDescription() {
        return "\nBook: " + getId() + "\ntitle: " + getTitle() + "\nauthor: " + author + "\navailable: " + getAvailable() + "\n";
    }
}
