package com.quest.LibraryManagement;

class Member implements LibraryOperation {
    private String name;
    private String memberId;
    private int borrowedBooks;
    protected int borrowLimit;

    public Member(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
        this.borrowedBooks = 0;
        this.borrowLimit = 2; // Default borrow limit
    }

    @Override
    public void borrowBook(String isbn) {
        if (borrowedBooks < borrowLimit) {
            borrowedBooks++;
            System.out.println(name + " borrowed the book with ISBN: " + isbn);
        } else {
            System.out.println(name + " has reached the borrowing limit.");
        }
    }

    @Override
    public void returnBook(String isbn) {
        if (borrowedBooks > 0) {
            borrowedBooks--;
            System.out.println(name + " returned the book with ISBN: " + isbn);
        } else {
            System.out.println(name + " has no books to return.");
        }
    }

    public double calculateLateFee(final int daysLate) {
        double feePerDay = 1.0; // $1 per day
        return daysLate * feePerDay;
    }

    @Override
    public String toString() {
        return "Member [Name: " + name + ", ID: " + memberId + ", Borrowed Books: " + borrowedBooks + "]";
    }
}


