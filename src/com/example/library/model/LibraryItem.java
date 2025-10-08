package com.example.library.model;

public abstract class LibraryItem {
    private long id;
    private String title;
    private boolean available;

    public LibraryItem(long id, String title, boolean available) {
        this.id = id;
        this.title = title;
        this.available = available;
    }

    public long getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public boolean getAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public abstract String getDescription();
}
