 

class Ticket {
    private String originStation;
    private String endStation;
    private int seatNumber;
    private double fare;

    public Ticket(String origin, String end, int seatno, double fare) {
        originStation = origin;
        endStation = end;
        seatNumber = seatno;
        this.fare = fare;
    }
    public Ticket() {
        originStation = "";
        endStation = "";
        seatNumber = 0;
        fare = 0;
    }
    public void setOrigin(String origin) {
        originStation = origin;
    }
    public void setEnd(String end) {
        endStation = end;
    }
    public void setSeatNumber(int num) {
        seatNumber = num;
    }
    public void setFare(double fare) {
        this.fare = fare;
    }
    public String getOrigin() {
        return originStation;
    }
    public String getEnd() {
        return endStation;
    }
    public int getSeatNumber() {
        return seatNumber;
    }
    public double getFare() {
        return fare;
    }
    public void displayTicketInfo() {
        System.out.println("Generating Ticket info...");
        System.out.println("Origin City: " + originStation);
        System.out.println("Destination: " + endStation);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Ticket Fare: " + fare);
    }

}