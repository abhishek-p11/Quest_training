package com.quest.LibraryManagement;

public class Library {
    private Book[] books = new Book[50];
    private Member[] members = new Member[20];
    private int bookCount = 0;
    private int memberCount = 0;

    public void addBook(Book book) {
        books[bookCount++] = book;
        System.out.println("Book added: " + book);
    }

    public void addMember(Member member) {
        members[memberCount++] = member;
        System.out.println("Member added: " + member);
    }

    public Book findBookByISBN(String isbn) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getISBN().equals(isbn)) {
                return books[i];
            }
        }
        return null;
    }

    public Member findMemberById(String memberId) {
        for (int i = 0; i < memberCount; i++) {
            if (members[i].toString().contains(memberId)) {
                return members[i];
            }
        }
        return null;
    }

    public void displayAllBooks() {
        System.out.println("\n--- All Books ---");
        for (int i = 0; i < bookCount; i++) {
            System.out.println(books[i]);
        }
    }

    public void displayAllMembers() {
        System.out.println("\n--- All Members ---");
        for (int i = 0; i < memberCount; i++) {
            System.out.println(members[i]);
        }
    }
}
