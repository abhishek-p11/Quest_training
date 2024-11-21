package com.quest.LibraryManagementSystem;
class LibraryMember {
    private String memberId;
    private String name;
    private String contactInfo;
    private String[] borrowedBooks;

    public LibraryMember(String memberId, String name, String contactInfo) {
        this.memberId = memberId;
        this.name = name;
        this.contactInfo = contactInfo;
        this.borrowedBooks = new String[5]; // Limit of 5 books per member
    }

    public String getMemberId() {
        return memberId;
    }

    public String getName() {
        return name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public String[] getBorrowedBooks() {
        return borrowedBooks;
    }

    public void borrowBook(String ISBN) {
        for (int i = 0; i < borrowedBooks.length; i++) {
            if (borrowedBooks[i] == null) {
                borrowedBooks[i] = ISBN;
                return;
            }
        }
        System.out.println("Cannot borrow more books. Limit reached.");
    }

    public void returnBook(String ISBN) {
        for (int i = 0; i < borrowedBooks.length; i++) {
            if (borrowedBooks[i] != null && borrowedBooks[i].equals(ISBN)) {
                borrowedBooks[i] = null;
                return;
            }
        }
        System.out.println("Book not found in borrowed list.");
    }

    public void displayBorrowedBooks() {
        System.out.print("Borrowed Books: ");
        for (String book : borrowedBooks) {
            if (book != null) {
                System.out.print(book + " ");
            }
        }
        System.out.println();
    }
}
