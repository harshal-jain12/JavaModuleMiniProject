package serviceclasses;

import java.util.ArrayList;
import java.util.HashMap;

import entityclasses.*;

public class Library {
    private HashMap<String, Book> books;
    private HashMap<String, Member> members;

    public Library() {
        books = new HashMap<>();
        members = new HashMap<>();
    }

    // Book operations
    public void addBook(Book book) {
        books.put(book.getTitle(), book);
    }

    public void removeBook(String title) {
        books.remove(title);
    }

    public void updateBook(String title, Book updatedBook) {
        books.put(title, updatedBook);
    }

    public Book searchBookByTitle(String title) {
        return books.get(title);
    }

    public ArrayList<Book> searchBookByAuthor(String author) {
        ArrayList<Book> results = new ArrayList<>();
        for (Book book : books.values()) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                results.add(book);
            }
        }
        return results;
    }

    public ArrayList<Book> searchBookByCategory(String category) {
        ArrayList<Book> results = new ArrayList<>();
        for (Book book : books.values()) {
            if (book.getCategory().equalsIgnoreCase(category)) {
                results.add(book);
            }
        }
        return results;
    }

    // Member operations
    public void addMember(Member member) {
        members.put(member.getMemberId(), member);
    }

    public void removeMember(String memberId) {
        members.remove(memberId);
    }

    public void updateMember(String memberId, Member updatedMember) {
        members.put(memberId, updatedMember);
    }

    public Member getMemberById(String memberId) {
        return members.get(memberId);
    }

    // Borrow and Return
    public void borrowBook(String memberId, String bookTitle) {
        Member member = members.get(memberId);
        Book book = books.get(bookTitle);
        if (member != null && book != null && book.isAvailable()) {
            member.borrowBook(book);
        }
    }

    public void returnBook(String memberId, String bookTitle) {
        Member member = members.get(memberId);
        Book book = books.get(bookTitle);
        if (member != null && book != null) {
            member.returnBook(book);
        }
    }

    public void displayAllBooks() {
        for (Book book : books.values()) {
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor() +
                ", Category: " + book.getCategory() + ", Available: " + book.isAvailable());
        }
    }

    public void displayAllMembers() {
        for (Member member : members.values()) {
            System.out.println("Name: " + member.getName() + ", ID: " + member.getMemberId());
        }
    }
}

