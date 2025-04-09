package com.xworkz.trainticket;

import com.xworkz.trainticket.constants.TicketClass;
import com.xworkz.trainticket.ticketdto.TrainTicketDto;
import com.xworkz.trainticket.servicetrain.TrainTicketService;

public class TrainTicketRunner {

    public static void main(String[] args) {

        TrainTicketDto dto = new TrainTicketDto();
        dto.setPassengerName("baba");
        dto.setDepartureStation("Mysore");
        dto.setArrivalStation("bamgalore");
        dto.setJourneyDate("8/04/2025");
        dto.setTicketClass(TicketClass.AC);
        dto.setNumberOfPassengers(1);
        dto.setContactNumber("9999888876");
        dto.setEmail("baba@gmail.com");


        System.out.println("Name: " + dto.getPassengerName());
        System.out.println("From: " + dto.getDepartureStation());
        System.out.println("To: " + dto.getArrivalStation());
        System.out.println("Date: " + dto.getJourneyDate());
        System.out.println("Class: " + dto.getTicketClass());
        System.out.println("No. of Passengers: " + dto.getNumberOfPassengers());
        System.out.println("Contact: " + dto.getContactNumber());
        System.out.println("Email: " + dto.getEmail());

        System.out.println("----------------**------------------");

        TrainTicketService service = new TrainTicketService();
        service.bookTicket(dto);
    }
}
