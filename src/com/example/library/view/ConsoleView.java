package com.example.library.view;

import java.nio.channels.Pipe.SourceChannel;
import java.util.List;
import java.util.Scanner;

import com.example.library.controller.BookController;
import com.example.library.model.Book;

public class ConsoleView {
    private BookController controller = new BookController();
    Scanner scanner = new Scanner(System.in);
    public void start() {
        String promt = null;
        while(true) {
            System.out.println("Choose: \n1. Add book \n2. List all books \n3. Exit");
            promt = scanner.nextLine();
            if (promt.equals("Add book")) {
                addBookFlow();
            } else if(promt.equals("List all books")) {
                listBooksFlow();
            } else if(promt.equals("Exit")) {
                return;
            } else if(promt != null) {
                System.out.println("such a team does not exist");
            }
        }
    }

    private void addBookFlow() {
        System.out.println("Enter author: ");
        String title = scanner.nextLine();
        System.out.println("Enter title: ");
        String author = scanner.nextLine();
        controller.addBook(title, author);
        System.out.println("Book was added!");
    }

    private void listBooksFlow() {
        List<Book> listBooks = controller.listBooks();  
        if (listBooks.isEmpty()) {
            System.out.println("No books!");
        } else {
            System.out.println(listBooks);
        }
    }
}
