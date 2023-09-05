import java.time.LocalDate;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Airport airport = new Airport(new Address("Example City", "Example State", "Example Country"));

      
        airport.addFlight(new Flight("F101", "CityA", "CityB", 200.0, 100, "08:00 AM", "AirlineA"));
        airport.addFlight(new Flight("F102", "CityB", "CityC", 250.0, 150, "10:00 AM", "AirlineB"));
        airport.addFlight(new Flight("F103", "CityA", "CityC", 220.0, 120, "09:30 AM", "AirlineC"));

       
        ArrayList<Flight> foundFlights = airport.searchFlightBySourceAndDestination("CityA", "CityC");
        if (foundFlights.isEmpty()) {
            System.out.println("No flights found for the given source and destination.");
        } else {
            System.out.println("Flights found for the given source and destination:");
            for (Flight flight : foundFlights) {
                System.out.println("Flight ID: " + flight.getId() + ", Departure Time: " + flight.getDepartureTime() +
                        ", Company Name: " + flight.getCompanyName() + ", Available Seats: " + flight.getAvailableSeats());
            }
        }

       
        Traveller traveller = new Traveller("Deepika", "1234567890", "deepika@gmail.com", "74ht", LocalDate.now());
        airport.bookTicket("74ht", traveller);
    }
}
