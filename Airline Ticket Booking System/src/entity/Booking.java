package entity;

public class Booking {
	
	int bookingId;
	int flightId;
	int customerId;
	int numTickets;
	
	public Booking(int bookingId, int flightId, int customerId, int numTickets) {
		super();
		this.bookingId = bookingId;
		this.flightId = flightId;
		this.customerId = customerId;
		this.numTickets = numTickets;
	}
	
//	public void displayBookingInfo() {
//		
//		System.out.println("Booking Id: " + bookingId);
//		System.out.println("Flight Id : " + flightId);
//		System.out.println("Customer Id: " + customerId);
//		System.out.println("Number of Tickets: " + numTickets);
//	}
//		
//	public double calculateTotalCost(double ticketPrice) {
//		return numTickets * ticketPrice;
//	}
	
}
