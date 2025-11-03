package com.example.library.view;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.example.library.controller.BookController;
import com.example.library.controller.EBookController;
import com.example.library.controller.MagazineController;
import com.example.library.model.Book;
import com.example.library.model.EBook;
import com.example.library.model.Magazine;

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
            System.out.println("Choose: \n1. Books \n2. Magazines \n3. EBooks \n4. Exit");
            promt = scanner.nextLine();
            if (promt.equals("1")) {
                books();
            } else if(promt.equals("2")) {
                magazines();
            } else if(promt.equals("3")) {
                eBooks();
            } else if(promt.equals("4")) {
                return;
            } else {
                System.out.println("such a team does not exist");
            }
        }
    }

    public void books() {
        String promt = null;
        while(true) {
            System.out.println("Choose: \n1. Add book \n2. List all books \n3. Back");
            promt = scanner.nextLine();
            if (promt.equals("1")) {
                addBookFlow();
            } else if(promt.equals("2")) {
                listBooksFlow();
            } else if(promt.equals("3")) {
                start();
            } else if(promt != null) {
                System.out.println("such a team does not exist");
            }
        }
    }

    public void magazines() {
        boolean flag = true;
        String promt = null;
        while(flag) {
            System.out.println("Choose: \n1. Add magazine \n2. List all magazines \n3. Back");
            promt = scanner.nextLine();
            if (promt.equals("1")) {
                addMagazineFlow();
            } else if(promt.equals("2")) {
                listMagazinesFlow();
            } else if(promt.equals("3")) {
                start();
            } else if(promt != null) {
                System.out.println("such a team does not exist");
            }
        }
    }

    public void eBooks() {
        String promt = null;
        while(true) {
            System.out.println("Choose: \n1. Add eBook \n2. List all eBooks \n3. Back");
            promt = scanner.nextLine();
            if (promt.equals("1")) {
                addEBookFlow();
            } else if(promt.equals("2")) {
                listEBooksFlow();
            } else if(promt.equals("3")) {
                start();
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
        booksController.addBook(title, author);
        System.out.println("Book was added!");
    }

    private void addMagazineFlow() {
        System.out.println("Enter title: ");
        String title = scanner.nextLine();
        System.out.println("Enter publisher: ");
        String publisher = scanner.nextLine();
        System.out.println("Enter issueNumber: ");
        try {
            int issueNumber = scanner.nextInt();
            magazinesController.addMagazine(title, publisher, issueNumber);
            System.out.println("Magazine was added!");
        } catch(InputMismatchException e) {
            System.out.println("You writed not number!");
        }
    }

    private void addEBookFlow() {
        System.out.println("Enter author: ");
        String title = scanner.nextLine();
        System.out.println("Enter title: ");
        String author = scanner.nextLine();
        System.out.println("Enter file format: ");
        String fileFormat = scanner.nextLine();
        eBooksController.addEBook(title, author, fileFormat);;
        System.out.println("Book was added!");
    }

    private void listMagazinesFlow() {
        List<Magazine> listMagazines = magazinesController.listMagazines();  
        if (listMagazines.isEmpty()) {
            System.out.println("No magazines!");
        } else {
            System.out.println(listMagazines);
        }
    }

    private void listBooksFlow() {
        List<Book> listBooks = booksController.listBooks();  
        if (listBooks.isEmpty()) {
            System.out.println("No books!");
        } else {
            System.out.println(listBooks);
        }
    }

    private void listEBooksFlow() {
        List<EBook> listEBooks = eBooksController.listEBooks();  
        if (listEBooks.isEmpty()) {
            System.out.println("No eBooks!");
        } else {
            System.out.println(listEBooks);
        }
    }
}
