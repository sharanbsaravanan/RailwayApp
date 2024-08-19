package org.Train.App;

public class Ticket {
    private String ticketNumber;
    private Passenger passenger;
    private Train train;
    private String seatNumber;

    public Ticket(String ticketNumber,Passenger passenger, Train train, String seatNumber){
        this.ticketNumber=ticketNumber;
        this.passenger= passenger;
        this.train= train;
        this.seatNumber=seatNumber;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public Train getTrain() {
        return train;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    @Override
    public String toString() {
        return "{" +
                "ticketNumber='" + ticketNumber + '\'' +
                ", seatNumber='" + seatNumber + '\'' +
                ", train=" + train.getTrainNumber() +
                '}';
    }
}
