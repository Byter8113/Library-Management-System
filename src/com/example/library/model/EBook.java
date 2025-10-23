package com.example.library.model;

public class EBook extends LibraryItem {
    private String author;
    private String fileFormat;

    public EBook(long id, String title, boolean available, String author, String fileFormat) {
        super(id, title, available);
        this.author = author;
        this.fileFormat = fileFormat;
    } 

    @Override
    public String getDescription() {
        return "\nBook: " + getId() + "\ntitle: " + getTitle() + "\nauthor: " + author + "\navailable: " + getAvailable() + "\n" + "File Format: " + fileFormat + "\n";
    }

}
