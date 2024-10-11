package service;
import java.util.ArrayList;

import entity.*;

public class Transaction {
	
	ArrayList<TransactionRecord> transactions;

	public Transaction() {
		super();
		transactions = new ArrayList<TransactionRecord>();
	}

	 public void recordBorrowTransaction(String bookTitle, String transactionType) {
	        transactions.add(new TransactionRecord(bookTitle, "Borrow"));
	    }
	
	public void recordReturnTransaction(String bookTitle, String trnsactionType ) {
		transactions.add(new TransactionRecord(bookTitle, "Return"));
	}
	
	public void displayTransactions() {
		for(TransactionRecord record: transactions) {
			record.displayTransaction();
		}
	}
	
	

}
