package service;

import entity.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Library {

	HashMap<String, Book> books;
	HashMap<String, Member> members;

	public Library() {

		books = new HashMap<String, Book>();
		members = new HashMap<String, Member>();

	}

	// book operations
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

	public ArrayList<Book> searchBookByAurthor(String author) {
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

//Member Operations

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
		if (member != null && book != null && book.isAvailability()) {
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
			System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", Category: "
					+ book.getCategory() + ", Available: " + book.isAvailability());
		}
	}

	public void displayAllMembers() {
		for (Member member : members.values()) {
			System.out.println("Name: " + member.getName() + ", ID: " + member.getMemberId());
		}
	}
}
