package service;

import entity.*;
import java.util.Scanner;

public class LibraryManagementSystem {

    public static void main(String[] args) {
        // Create a Library object
        Library library = new Library();
        Transaction transaction = new Transaction();

        // Sample data
        Book book1 = new Book("Java Programming", "John Doe", "Programming", true);
        Book book2 = new Book("Python for Beginners", "Jane Doe", "Programming", true);
        Member member1 = new Member("Alice", "M001");
        Member member2 = new Member("Bob", "M002");

        // Adding sample books and members to the library
        library.addBook(book1);
        library.addBook(book2);
        library.addMember(member1);
        library.addMember(member2);

        // Interactive Console
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n=== Library Management System ===");
            System.out.println("1. Display All Books");
            System.out.println("2. Display All Members");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. Display Transactions");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    library.displayAllBooks();
                    break;
                case 2:
                    library.displayAllMembers();
                    break;
                case 3:
                    System.out.print("Enter Member ID: ");
                    String memberId = sc.nextLine();
                    System.out.print("Enter Book Title: ");
                    String bookTitle = sc.nextLine();
                    library.borrowBook(memberId, bookTitle);
                    transaction.recordBorrowTransaction(memberId, bookTitle);
                    break;
                case 4:
                    System.out.print("Enter Member ID: ");
                    memberId = sc.nextLine();
                    System.out.print("Enter Book Title: ");
                    bookTitle = sc.nextLine();
                    library.returnBook(memberId, bookTitle);
                    transaction.recordReturnTransaction(memberId, bookTitle);
                    break;
                case 5:
                    transaction.displayTransactions();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option, please try again.");
                    break;
            }
        }
    }
}

