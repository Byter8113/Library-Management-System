package com.example.library.view;

import java.util.List;
import java.util.Scanner;

import com.example.library.controller.BookController;
import com.example.library.controller.EBookController;
import com.example.library.controller.MagazineController;

public class ConsoleView {
    private BookController booksController = new BookController();
    private MagazineController magazinesController = new MagazineController();
    private EBookController eBooksController = new EBookController();
    Scanner scanner = new Scanner(System.in);
    // public void start() {
    //     String promt = null;
    //     while(true) {
    //         System.out.println("Choose: \n1. Add book \n2. List all books \n3. Exit");
    //         promt = scanner.nextLine();
    //         if (promt.equals("1")) {
    //             addBookFlow();
    //         } else if(promt.equals("2")) {
    //             listBooksFlow();
    //         } else if(promt.equals("3")) {
    //             return;
    //         } else if(promt != null) {
    //             System.out.println("such a team does not exist");
    //         }
    //     }
    // }

    public void start() {
        String promt = null;
        while(true) {
            System.out.println("\nMain Menu");
            System.out.println("1. Books");
            System.out.println("2. Magazines");
            System.out.println("3. EBooks");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");

            promt = scanner.nextLine();
            switch (promt) {
                case "1" -> books();
                case "2" -> magazines();
                case "3" -> eBooks();
                case "4" -> { return; }
                default -> System.out.println("Such a command does not exist");
            }

        }
    }

    public void books() {
        while(true) {
            System.out.println("\nBooks Menu:");
            System.out.println("1. Add Book");
            System.out.println("2. List all Books");
            System.out.println("3. Back");

            String promt = scanner.nextLine();

            switch (promt) {
                    case "1" -> addBookFlow();
                    case "2" -> listBooksFlow();
                    case "3" -> { return; }
                    default -> System.out.println("Such a command does not exist");
            }
        }
    }

    public void magazines() {
        while (true) {
            System.out.println("\n Magazines Menu:");
            System.out.println("1. Add magazine");
            System.out.println("2. List all magazines");
            System.out.println("3. Back");

            String promt = scanner.nextLine();

            switch (promt) {
                case "1" -> addMagazineFlow();
                case "2" -> listMagazinesFlow();
                case "3" -> { return; }
                default -> System.out.println("Such a command does not exist");
            }
        }
    }

    public void eBooks() {
        while (true) {
            System.out.println("\nEBooks Menu:");
            System.out.println("1. Add eBook");
            System.out.println("2. List all eBooks");
            System.out.println("3. Back");

            String promt = scanner.nextLine();

            switch (promt) {
                    case "1" -> addEBookFlow();
                    case "2" -> listEBooksFlow();
                    case "3" -> { return; }
                    default -> System.out.println("Such a command does not exist");
            }
        }
    }

    private void addBookFlow() {
        System.out.println("Enter title: ");
        String title = scanner.nextLine();
        System.out.println("Enter author: ");
        String author = scanner.nextLine();
        booksController.addBook(title, author);
        System.out.println("Book was added!");
    }

    private void addMagazineFlow() {
        System.out.println("Enter title: ");
        String title = scanner.nextLine();
        System.out.println("Enter publisher: ");
        String publisher = scanner.nextLine();
        System.out.println("Enter issue number: ");

        try {
            int issueNumber = Integer.parseInt(scanner.nextLine());
            magazinesController.addMagazine(title, publisher, issueNumber);
            System.out.println("Magazine was added!");
        } catch (NumberFormatException e) {
            System.out.println("You wrote not a number!");
        }
    }


    private void addEBookFlow() {
        System.out.println("Enter title: ");
        String title = scanner.nextLine();
        System.out.println("Enter author: ");
        String author = scanner.nextLine();
        System.out.println("Enter file format: ");
        String fileFormat = scanner.nextLine();
        eBooksController.addEBook(title, author, fileFormat);;
        System.out.println("Book was added!");
    }

    private void listMagazinesFlow() {
        printList(magazinesController.listMagazines(), "No magazines!");
    }

    private void listBooksFlow() {
        printList(eBooksController.listEBooks(), "No books!");
    }

    private void listEBooksFlow() {
        printList(booksController.listBooks(), "No eBooks!");
    }

    private <T> void printList(List<T> list, String emptyMessage) {
        if (list.isEmpty()) {
            System.out.println(emptyMessage);
        } else {
            System.out.println(list);
        }
    }
}