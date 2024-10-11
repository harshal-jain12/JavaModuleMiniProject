package entity;

import java.time.LocalDateTime;


public class TransactionRecord {

	static int Id = 1000;
	String memberId;
	String bookTitle;
	String transactionType;
	LocalDateTime transactiondate;
	
	
	public TransactionRecord(String bookTitle, String transactionType) {
		super();
		this.memberId = "M" + ++Id;
		this.bookTitle = bookTitle;
		this.transactionType = transactionType;
		this.transactiondate = LocalDateTime.now();
	}


	public static int getId() {
		return Id;
	}


	public static void setId(int id) {
		Id = id;
	}


	public String getMemberId() {
		return memberId;
	}


	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}


	public String getBookTitle() {
		return bookTitle;
	}


	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}


	public String getTransactionType() {
		return transactionType;
	}


	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}


	public LocalDateTime getTransactiondate() {
		return transactiondate;
	}


	public void setTransactiondate(LocalDateTime transactiondate) {
		this.transactiondate = transactiondate;
	}


	@Override
	public String toString() {
		return "TransactionRecord [memberId=" + memberId + ", bookTitle=" + bookTitle + ", transactionType="
				+ transactionType + ", transactiondate=" + transactiondate + "]";
	}


	public void displayTransaction() {
        System.out.println("Member ID: " + memberId + ", Book: " + bookTitle + 
            ", Transaction: " + transactionType + ", Date: " + transactiondate);
    }
	
	
	
	
	
}	
