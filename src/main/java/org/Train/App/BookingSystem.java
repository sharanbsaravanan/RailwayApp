package org.Train.App;

import java.util.HashSet;
import java.util.Set;

public class BookingSystem {
    private Set<Ticket> bookedTickets = new HashSet<>();


    public Ticket bookTicket(Passenger passenger, Train train, String seatNumber) {
        String ticketNumber = "T-" + (bookedTickets.size() + 1);
        Ticket ticket = new Ticket(ticketNumber, passenger, train, seatNumber);
        bookedTickets.add(ticket);
        passenger.setTicket(ticket);
        return ticket;
    }

    public void cancelTicket(String ticketNumber) {
        bookedTickets.removeIf(ticket -> ticket.getTicketNumber().equals(ticketNumber));
    }

    public boolean checkAvailability(Train train) {
        long count = bookedTickets.stream()
                .filter(ticket -> ticket.getTrain().equals(train))
                .count();
        return count < 100; // Assume each train has 100 seats for simplicity
    }



}
