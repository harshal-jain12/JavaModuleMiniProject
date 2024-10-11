package serviceclasses;
import entityclasses.*;
import java.util.ArrayList;

public class Transaction {
    private ArrayList<TransactionRecord> transactions;

    public Transaction() {
        transactions = new ArrayList<>();
    }

    public void recordBorrowTransaction(String memberId, String bookTitle) {
        transactions.add(new TransactionRecord(memberId, bookTitle, "Borrow"));
    }

    public void recordReturnTransaction(String memberId, String bookTitle) {
        transactions.add(new TransactionRecord(memberId, bookTitle, "Return"));
    }

    public void displayTransactions() {
        for (TransactionRecord record : transactions) {
            record.displayTransaction();
        }
    }
}
