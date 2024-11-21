package com.quest.LibraryManagementSystem;
import java.util.Scanner;
public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library(10, 5);

        library.addBook(new Book("9780134685991", "Effective Java", "Joshua Bloch", 2017));
        library.addBook(new Book("9780596009205", "Head First Java", "Kathy Sierra", 2003));
        library.addBook(new Book("9780132350884", "Clean Code", "Robert C. Martin", 2008));

        library.addMember(new LibraryMember("b001", "Abhi", "abhi@example.com"));
        library.addMember(new LibraryMember("b002", "alan", "alan@example.com"));

        while (true) {
            System.out.println("\nLibrary Management System:");
            System.out.println("1. Display Available Books");
            System.out.println("2. Display All Members");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    library.displayAvailableBooks();
                    break;
                case 2:
                    library.displayAllMembers();
                    break;
                case 3:
                    System.out.print("Enter Member ID: ");
                    String borrowMemberId = sc.nextLine();
                    System.out.print("Enter Book ISBN: ");
                    String borrowISBN = sc.nextLine();
                    library.borrowBook(borrowMemberId, borrowISBN);
                    break;
                case 4:
                    System.out.print("Enter Member ID: ");
                    String returnMemberId = sc.nextLine();
                    System.out.print("Enter Book ISBN: ");
                    String returnISBN = sc.nextLine();
                    library.returnBook(returnMemberId, returnISBN);
                    break;
                case 5:
                    System.out.println("Exiting system. Goodbye!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}

