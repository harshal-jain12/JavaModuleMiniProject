package operation;

import java.util.List;

import entity.Flight;
import exceptionhandling.FlightNotFoundException;
import exceptionhandling.InsufficientSeatsException;

public class FlightOperations {

	public static Flight findFlightById(int flightId, List<Flight> flights) throws FlightNotFoundException{
		for(Flight flight : flights) {
			if(flight.flightId == flightId) {
				return flight;
			}
		}
		throw new FlightNotFoundException("Flight with Id" + flightId + " not found.");
	}
	
	public static void bookFlightSeats(Flight flight, int numTickets) throws InsufficientSeatsException{
		if(flight.areSeatsAvailable(numTickets)) {
			flight.bookSeats(numTickets);
			System.out.println("Booking successful");
		}
		else {
			throw new InsufficientSeatsException("Not enough seats availbale. Onle " + flight.availableSeats + "seats left.");
			
		}
	}
}
