package com.quest.LibraryManagementSystem;

public class Library {
    private Book[] books;
    private LibraryMember[] members;
    private int bookCount;
    private int memberCount;

    public Library(int bookCapacity, int memberCapacity) {
        books = new Book[bookCapacity];
        members = new LibraryMember[memberCapacity];
        bookCount = 0;
        memberCount = 0;
    }

    public void addBook(Book book) {
        if (bookCount < books.length) {
            books[bookCount++] = book;
        } else {
            System.out.println("No more books can be added");
        }
    }

    public void addMember(LibraryMember member) {
        if (memberCount < members.length) {
            members[memberCount++] = member;
        } else {
            System.out.println("No more members can be added");
        }
    }

    public void displayAvailableBooks() {
        System.out.println("Available Books:");
        for (int i = 0; i < bookCount; i++) {
            if (books[i].isAvailable) {
                System.out.println(books[i].getDetails());
            }
        }
    }

    public void displayAllMembers() {
        System.out.println("Library Members:");
        for (int i = 0; i < memberCount; i++) {
            System.out.println("ID: " + members[i].getMemberId() + ", Name: " + members[i].getName());
            members[i].displayBorrowedBooks();
        }
    }

    public void borrowBook(String memberId, String ISBN) {
        LibraryMember member = findMember(memberId);
        Book book = findBook(ISBN);

        if (member != null && book != null && book.isAvailable) {
            book.isAvailable=false;
            member.borrowBook(ISBN);
            System.out.println("Book borrowed successfully!");
        } else {
            System.out.println("Borrowing failed: Book not available or invalid member ID.");
        }
    }

    public void returnBook(String memberId, String ISBN) {
        LibraryMember member = findMember(memberId);
        Book book = findBook(ISBN);

        if (member != null && book != null && !book.isAvailable) {
            book.isAvailable=true;
            member.returnBook(ISBN);
            System.out.println("Book returned successfully!");
        } else {
            System.out.println("Return failed: Invalid member ID or book was not borrowed.");
        }
    }

    private LibraryMember findMember(String memberId) {
        for (int i = 0; i < memberCount; i++) {
            if (members[i].getMemberId().equalsIgnoreCase(memberId)) {
                return members[i];
            }
        }
        return null;
    }

    private Book findBook(String ISBN) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getISBN().equalsIgnoreCase(ISBN)) {
                return books[i];
            }
        }
        return null;
    }
}
