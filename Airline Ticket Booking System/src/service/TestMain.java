package service;

import java.util.ArrayList;
import java.util.Scanner;

import entity.Flight;
import entity.Booking;
import entity.Customer;
import operation.*;
import exceptionhandling.*;

public class TestMain {

	public static void main(String[] args) {
		
		ArrayList<Flight> flights = new ArrayList<Flight>();
		ArrayList<Customer> customers = new ArrayList<Customer>();
		ArrayList<Booking> bookings = new ArrayList<Booking>();
		
		Scanner scanner = new Scanner(System.in);
		
		flights.add(new Flight(101, "New York", "10:10 AM", 100, 2000.00));
		flights.add(new Flight(102, "Los Angeles", "12:00 PM", 50, 30000.00));
		
		int choice;
		
		do {
			System.out.println("\nAirline Ticket Booking System");
			System.out.println("1. Book Ticket");
			System.out.println("2. Display Flights");
			System.out.println("3. Exit");
			System.out.println("Enter your choice: ");
			choice = scanner.nextInt();
			
			switch(choice) {
			
			case 1: 
				try {
					System.out.println("Enter flight Id to book: ");
					int flightId = scanner.nextInt();
					System.out.println("Enter number of tickets: ");
					int numTickets = scanner.nextInt();
					
					Flight seletedFlight = FlightOperations.findFlightById(flightId, flights);
					
					FlightOperations.bookFlightSeats(seletedFlight, numTickets);
				}
				catch(FlightNotFoundException | InsufficientSeatsException e) {
					System.out.println(e.getMessage());
				}
				break;
				
			case 2: 
				for(Flight flight: flights) {
					flight.displayFlightInfo();
				}
				break;
				
			case 3:
				System.out.println("Exiting..........");
				break;
				
			default: {
				System.out.println("Invalid choice!");
			}
			
		}
			
		}while(choice != 6);
		
		scanner.close();
	}

}
