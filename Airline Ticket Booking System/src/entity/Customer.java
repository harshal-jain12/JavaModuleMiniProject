package entity;

public class Customer {
	
	int customerId;
	String customerName;
	String contactNumber;
	
	public Customer(int customerId, String customerName, String contactNumber) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.contactNumber = contactNumber;
	}
	
//	public void displayCustomerInfo() {
//		
//		System.out.println("Customer Id: " + customerId);
//		System.out.println("Customer Name: " + customerName);
//		System.out.println("Contact Number: " + contactNumber);
//	}
	
}
