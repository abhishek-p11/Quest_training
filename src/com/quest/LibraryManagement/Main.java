package com.quest.LibraryManagement;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();
        int choice;

        do {
            System.out.println("\n--- Library Management System ---");
            System.out.println("1. Add Book");
            System.out.println("2. Add Member");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. Display All Books");
            System.out.println("6. Display All Members");
            System.out.println("7. Calculate Late Fee");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Book Title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter Book Author: ");
                    String author = sc.nextLine();
                    System.out.print("Enter Book ISBN: ");
                    String isbn = sc.nextLine();
                    library.addBook(new Book(title, author, isbn));
                }
                case 2 -> {
                    System.out.print("Enter Member Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Member ID: ");
                    String memberId = sc.nextLine();
                    System.out.print("Is Premium Member? (yes/no): ");
                    String isPremium = sc.nextLine();
                    if (isPremium.equalsIgnoreCase("yes")) {
                        library.addMember(new PremiumMember(name, memberId));
                    } else {
                        library.addMember(new Member(name, memberId));
                    }
                }
                case 3 -> {
                    System.out.print("Enter Member ID: ");
                    String memberId = sc.nextLine();
                    Member member = library.findMemberById(memberId);
                    if (member == null) {
                        System.out.println("Member not found.");
                        continue;
                    }

                    System.out.print("Enter Book ISBN: ");
                    String isbn = sc.nextLine();
                    Book book = library.findBookByISBN(isbn);
                    if (book == null) {
                        System.out.println("Book not found.");
                        continue;
                    }

                    if (book.isAvailable()) {
                        member.borrowBook(isbn);
                        book.borrow();
                    } else {
                        System.out.println("Book is already borrowed.");
                    }
                }
                case 4 -> {
                    System.out.print("Enter Member ID: ");
                    String memberId = sc.nextLine();
                    Member member = library.findMemberById(memberId);
                    if (member == null) {
                        System.out.println("Member not found.");
                        continue;
                    }

                    System.out.print("Enter Book ISBN: ");
                    String isbn = sc.nextLine();
                    Book book = library.findBookByISBN(isbn);
                    if (book == null) {
                        System.out.println("Book not found.");
                        continue;
                    }

                    member.returnBook(isbn);
                    book.returnBook();
                }
                case 5 -> library.displayAllBooks();
                case 6 -> library.displayAllMembers();
                case 7 -> {
                    System.out.print("Enter Member ID: ");
                    String memberId = sc.nextLine();
                    Member member = library.findMemberById(memberId);
                    if (member == null) {
                        System.out.println("Member not found.");
                        continue;
                    }

                    System.out.print("Enter days late: ");
                    int daysLate = sc.nextInt();
                    System.out.println("Late Fee: $" + member.calculateLateFee(daysLate));
                }
                case 8 -> System.out.println("Exiting system. Goodbye!");
                default -> System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 8);

        sc.close();
    }
}

