package entity;

import java.util.ArrayList;

public class Member {

	String name;
	String memberId;
	ArrayList<Book> borrowedBooks;
	
	public Member(String name, String memberId) {
		super();
		this.name = name;
		this.memberId = memberId;
		this.borrowedBooks = borrowedBooks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public ArrayList<Book> getBorrowedBooks() {
		return borrowedBooks;
	}

	public void setBorrowedBooks(ArrayList<Book> borrowedBooks) {
		this.borrowedBooks = borrowedBooks;
	}
	
	public void borrowBook(Book book) {
		if(book.isAvailability()) {
			borrowedBooks.add(book);
			book.setAvailability(false);
		}
	}
	
	public void returnBook(Book book) {
		borrowedBooks.remove(book);
		book.setAvailability(true);
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", memberId=" + memberId + ", borrowedBooks=" + borrowedBooks + "]";
	}
	
	
}
