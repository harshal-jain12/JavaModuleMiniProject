package entity;

public class Flight {
	
	public int flightId;
	String destination;
	String departureTime;
	public int availableSeats;
	double ticketPrice;
	
	public Flight(int flightId, String destination, String departureTime, int availableSeats, double ticketPrice) {
		super();
		this.flightId = flightId;
		this.destination = destination;
		this.departureTime = departureTime;
		this.availableSeats = availableSeats;
		this.ticketPrice = ticketPrice;
	}
	
	public void displayFlightInfo() {
		
		System.out.println("Flight Id: " + flightId);
		System.out.println("Destination = " +destination);
		System.out.println("DepartureTime = " + departureTime);
		System.out.println("Available Seats:  " + availableSeats);
		System.out.println("TicketPrice = " + ticketPrice);
	}
	
	public boolean areSeatsAvailable(int numTickets) {
		return availableSeats >= numTickets;
	}
	
	public void bookSeats(int numTickets) {
		if(areSeatsAvailable(numTickets)) {
			availableSeats -= numTickets;
		}else {
			System.out.println("Not enough seats available");
		}
	}
	
//	public void updateFlight(String newDestination, String newTime) {
//		destination = newDestination;
//		departureTime = newTime;
//	}
//	
//	
//	public void cancleFlight() {
//		availableSeats = 0;
//		System.out.println("Flight cancled");
//	}
}
