import java.util.ArrayList;

class Airport {
    private Address address;
    private ArrayList<Flight> flights;
    private ArrayList<Traveller> travellers;

    public Airport(Address address) {
        this.address = address;
        this.flights = new ArrayList<>();
        this.travellers = new ArrayList<>();
    }

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public ArrayList<Flight> searchFlightBySourceAndDestination(String source, String destination) {
        ArrayList<Flight> matchingFlights = new ArrayList<>();
        for (Flight flight : flights) {
            if (flight.getSource().equalsIgnoreCase(source) && flight.getDestination().equalsIgnoreCase(destination)) {
                matchingFlights.add(flight);
            }
        }
        return matchingFlights;
    }
    public void bookTicket(String flightId, Traveller traveller) {
        for (Flight flight : flights) {
            if (flight.getId().equals(flightId)) {
                if (flight.getAvailableSeats() > 0) {
                    flight.availableSeats -= 1;
                    travellers.add(traveller);
                } else {
                    System.out.println("Sorry, no more available seats for this flight.");
                }
                return;
            }
        }
        System.out.println("Flight with ID " + flightId + " not found.");
    }
}