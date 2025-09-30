package com.example.library;

import com.example.library.controller.BookController;

public class LibraryApplication {
    public static void main(String[] args) {
        BookController controller = new BookController();

        controller.addBook("How learn Java?", "Bobby");
        controller.addBook("Why learn Java so hard?", "Crying Bobby");
        
        controller.listBooks();
    }
}
