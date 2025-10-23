package com.example.library.model;

public class Magazine extends LibraryItem {
    private String publisher;
    private int issueNumber;

    public Magazine(long id, String title, boolean available, String publisher, int issueNumber) {
        super(id, title, available);
        this.publisher = publisher;
        this.issueNumber = issueNumber;
    }

    @Override
    public String toString() {
        return getDescription();
    }

    @Override
    public String getDescription() {
        return "\nMagazine: " + getId() + "\ntitle: " + getTitle() + "\npublisher: " + publisher + 
        "\nissue number: " + issueNumber + "\navailable: " + getAvailable() + "\n";
    }

}
