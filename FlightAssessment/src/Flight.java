

class Flight {
    private String id;
    private String source;
    private String destination;
    private double fair;
    private int totalSeats;
    public int availableSeats;
    private String departureTime;
    private String companyName;

    public Flight(String id, String source, String destination, double fair, int totalSeats, String departureTime, String companyName) {
        this.id = id;
        this.source = source;
        this.destination = destination;
        this.fair = fair;
        this.totalSeats = totalSeats;
        this.availableSeats = totalSeats;
        this.departureTime = departureTime;
        this.companyName = companyName;
    }

    public String getId() {
        return id;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public double getFair() {
        return fair;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public String getCompanyName() {
        return companyName;
    }
}