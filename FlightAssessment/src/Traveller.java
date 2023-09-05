import java.time.LocalDate;
class Traveller {
    private String name;
    private String mobile;
    private String email;
    private String flightId;
    private LocalDate date;

    public Traveller(String name, String mobile, String email, String flightId, LocalDate date) {
        this.name = name;
        this.mobile = mobile;
        this.email = email;
        this.flightId = flightId;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public String getMobile() {
        return mobile;
    }

    public String getEmail() {
        return email;
    }

    public String getFlightId() {
        return flightId;
    }

    public LocalDate getDate() {
        return date;
    }
}

