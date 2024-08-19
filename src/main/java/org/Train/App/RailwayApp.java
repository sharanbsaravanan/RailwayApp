package org.Train.App;

import java.util.Arrays;

public class RailwayApp{
       public static void main(String[] args) {
           // Sample data setup
           Station station1 = new Station("Central");
           Station station2 = new Station("North");
           Station station3 = new Station("East");

           Train train1 = new Train("12345", "Express", Arrays.asList(station1, station2, station3), new Schedule("10:00 AM", "4:00 PM"));

           Passenger passenger1 = new Passenger("John Doe", 30, "Male");

           BookingSystem bookingSystem = new BookingSystem();
           Ticket ticket = bookingSystem.bookTicket(passenger1, train1, "A1-10");
           System.out.println("Ticket Booked: " + ticket);



       }
    }

